package sistemaDePagamento;
public class FuncionarioComissionado extends Funcionario{
    protected int totalVendas;
    protected double comissao;

    public FuncionarioComissionado(String nome,String turno,String cpf,int id, int totalVendas, double comissao){
        super(nome,turno,cpf,id);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public int getTotalVendas(){
        return totalVendas;
    }
    public void setTotalVendas(int totalVendas){
        this.totalVendas = totalVendas;
    }
    public double getComissao(){
        return comissao;
    }

    public void setComissao(double comissao){
        this.comissao = comissao;
    }

    @Override
    public double totalVendas(){
        return totalVendas;
    }

    @Override
    public double calcularComissao(){
        return totalVendas * comissao;
    }

    @Override
    public double calcularPagamento(){
        return calcularComissao();
    }
}
