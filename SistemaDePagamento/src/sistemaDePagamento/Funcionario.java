package sistemaDePagamento;
public abstract class Funcionario {
    protected String nome;
    protected String turno;
    protected String cpf;
    protected int identificacao;

    public Funcionario(String nome,String turno,String cpf,int identificacao){
        this.nome = nome;
        this.turno=turno;
        this.cpf=cpf;
        this.identificacao=identificacao;
    }
    public abstract double calcularHorasTrabalhadas();
    public abstract double calcularTotalHoras();
    public abstract double totalVendas();
    public abstract double pagamento();
    public abstract double calcularSalario();
    public abstract double calcularBonus();

    public void exibir(){
        Sistem.out.println("Conta");
    }


}
