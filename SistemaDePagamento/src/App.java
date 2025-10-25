import java.util.Scanner;
import sistemaDePagamento.Funcionario;
import java.util.ArrayList;
public class App {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios= new ArrayList<>();
        char opcao;
        int tipo;
        String nome;
        String id;
        String turno;
        String cpf;
        double horas;
        double valorHora;
        
        
        System.out.println("========Sistema de pagamento=========");
        do{
            System.out.println("\nSelecione o tipi de funcionario");
            System.out.println("1 - Horista");
            System.out.println("2 - Comissionado");
            System.out.println("3 - Assalariado");
            System.out.println("opcao: ");
            tipo=sc.nextInt();
            sc.nextLine();

            System.out.println("Nome: ");
            nome= sc.nextLine();
            System.out.println("ID: ");
            id = sc.nextLine();
            System.out.println("Turno: ");
            turno= sc.nextLine();
            System.out.println("CPF: ");
            cpf = sc.nextLine();
            

            switch (tipo) {
                case 1:
                    System.out.println("Horas trabalhadas ");
                    horas = sc.nextDouble();
                    System.out.println("Valor da hora: ");
                    valorHora=sc.nextDouble();
                    funcionarios.add(new FuncionarioHorista(nome,id,turno,cpf,horas,valorHora));
                    
                case 2:
                    System.out.println("Total de vendas: ");
                    double vendas = sc.nextDouble();
                    System.out.println("Tataxa de comissão: ");
                    double taxa = sc.nextDouble();
                    funcionarios.add(new FuncionarioComissionado(nome,id,turno,cpf,horas,valorHora));
                case 3:
                

                    
                    break;
            
                default:
                    break;
            }        




        }
    }
}
