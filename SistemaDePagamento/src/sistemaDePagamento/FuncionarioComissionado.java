public class FuncionarioComissionado extends Funcionario{
    public FuncionarioComissionado(String nome,String turno,String cpf,int identificacao ){
        super(nome,turno,cpf,identificacao);
    }

    public double calcularHorasTrabalhadas(){
        double salario=horas*valorhora;
        return salario;
    }
    public double calcularTotalHoras(){
        double salario=horas*valorhora;
        bonus = salario*0.10;
        salariototal=bonus+salario;
        return salariototal;
    }
}
