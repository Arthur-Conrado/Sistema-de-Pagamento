public class FuncionarioHorista extends Funcionario {
    public FuncionarioHorista(String nome,String turno,String cpf,int id, Integer horas, double valorhora){
        super(nome,turno,cpf,id);
        this.horas = horas;
        this.valorhora = valorhora;
    }

    public double getHoras(){
        return horas;
    }
    public double setHoras(){
        this.hora=hora;
    }
    public double getValorHoras(){
        return valorhora;
    }
    public double setValorhora(){
        this.valorhora=valorhora;
    }

    @Override
    public double calcularHorasTrabalhadas(){
        double salario=horas*valorhora;
        return salario;
    }
    @Override
    public double calcularTotalHoras(){
        double salario=horas*valorhora;
        bonus = salario*0.10;
        salariototal=bonus+salario;
        return salariototal;
    }
}


