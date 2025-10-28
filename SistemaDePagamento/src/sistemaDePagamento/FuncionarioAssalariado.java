package sistemaDePagamento;
public class FuncionarioAssalariado extends Funcionario{
    protected double salario;
    protected double bonus;
    protected double salariototal;

    public FuncionarioAssalariado(String nome, String turno, String cpf, int id, double salario, double bonus){
        super(nome,turno,cpf,id);
        this.salario = salario;
        this.bonus = bonus;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario(){
        return salario;
    }

    @Override
    public double calcularBonus(){
        
        return bonus;
    }

    @Override
    public double calcularSalarioBonus(){
        bonus = calcularBonus();
        salariototal = bonus + salario;
        return salariototal;
    }

    @Override
    public double calcularPagamento(){
        return calcularSalarioBonus();
    }


    

    
}
