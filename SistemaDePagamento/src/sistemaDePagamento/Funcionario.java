package sistemaDePagamento;
public abstract class Funcionario implements Pagamento {
    protected String nome;
    protected String turno;
    protected String cpf;
    protected int id;

    public Funcionario(String nome,String turno,String cpf,int id){
        this.nome = nome;
        this.turno=turno;
        this.cpf=cpf;
        this.id=id;
    }
    public abstract double calcularHorasTrabalhadas();
    public abstract double calcularTotalHoras();
    public abstract double totalVendas();
    public abstract double pagamento();
    public abstract double calcularSalario();
    public abstract double calcularBonus();
    public abstract double calcularSalarioBonus();
    public abstract double calcularPagamaento();

    public String toString(){
        return "ID: "+id +"Nome: "+nome+"CPF: "+cpf+"turno:"+turno;
    }


}
