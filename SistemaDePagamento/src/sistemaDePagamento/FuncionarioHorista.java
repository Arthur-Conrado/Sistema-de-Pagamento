package sistemaDePagamento;
public class FuncionarioHorista extends Funcionario {
    protected int horas;
    protected double valorhora;
    protected double bonus;
    protected double salariototal;

    public FuncionarioHorista(String nome,String turno,String cpf,int id, int horas, double valorhora){
        super(nome,turno,cpf,id);
        this.horas = horas;
        this.valorhora = valorhora;
    }

    public int getHoras(){
        return horas;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
    public double getValorHoras(){
        return valorhora;
    }
    public void setValorhora(double valorhora){
        this.valorhora = valorhora;
    }

    @Override
    public double calcularHorasTrabalhadas(){
        return horas * valorhora;
    }

    @Override
    public double calcularTotalHoras(){
        double salario = horas * valorhora;
        if (horas > 160) {
            bonus = salario * 0.10;
        } else {
            bonus = 0.0;
        }
        salariototal = bonus + salario;
        return salariototal;
    }

    @Override
    public double calcularPagamento(){
        return calcularTotalHoras();
    }
}


