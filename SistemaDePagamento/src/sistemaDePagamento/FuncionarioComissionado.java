public class FuncionarioComissionado extends Funcionario{
    public FuncionarioComissionado(String nome,String turno,String cpf,int id, Integer totalVendas, double comissao){
        super(nome,turno,cpf,id);
        this.totalVendas = totalVendas;
        this.comissao=comissao;
    }

    public double getTotalVendas(){
        return totalVendas;
    }
    public double setTotalVendas(){
        this.totalVendas=totalVendas;
    }
    public double getComissao(){
        return comissao;
    }

    public double setComissao(){
        this.comissao=comissao;
    }
    @override
    public double calcularComissao(){
        double pagamento=totalVendas*comissao;
        return pagamento;
    }
}
