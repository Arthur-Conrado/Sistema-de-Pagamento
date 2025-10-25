public class FuncionarioAssalariado extends Funcionario{
    public FuncionarioAssalariado(string nome, string turno, string cpf, int id,int salario,int bonus){
        super(nome,turno,cpf,id);
        this.salario=salario;
        this.bonus=bonus;
        }

        public double getSalario(){
            return salario;
        }
        public double setSalario(){
            this.salario = salario;
        }
        public double getBonus(){
            return Bonus;
        }
        public double setBonus(){
            this.bonus=bonus;
        }
        @Override
        public double calcularSalarioBonus(){
            bonus = salario*0.10;
            salariototal=bonus+salario;
            return salariototal;
        }


    

    
}
