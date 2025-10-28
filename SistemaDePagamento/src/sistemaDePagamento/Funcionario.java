package sistemaDePagamento;
public abstract class Funcionario implements Pagamento {
    protected String nome;
    protected String turno;
    protected String cpf;
    protected int id;
    public Funcionario(String nome,String turno,String cpf,int id){
        this.nome = nome;
        this.turno = turno;
        this.cpf = cpf;
        this.id = id;
    }

   
    public String getNome() {
         return nome; 
        }
    public int getId() {
         return id; 
        }
    public String getCpf() {
         return cpf; 
        }
    public String getTurno() {
         return turno; 
        }

    
    public double calcularHorasTrabalhadas(){
         return 0.0; 
        }
    public double calcularTotalHoras(){
         return 0.0; 
        }
    public double totalVendas(){
         return 0.0; 
        }
    public double calcularComissao(){
         return 0.0; 
        }
    public double calcularSalario(){ 
        return 0.0; }
    public double calcularBonus(){ return 0.0; 
        }
    public double calcularSalarioBonus(){ 
        return 0.0; 
     }

   
    public abstract double calcularPagamento();

    @Override
    public String toString(){
        return "ID: " + id + " Nome: " + nome + " CPF: " + cpf + " turno: " + turno;
    }


}
