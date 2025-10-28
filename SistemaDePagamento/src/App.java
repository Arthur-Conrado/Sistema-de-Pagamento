import java.util.ArrayList;
import sistemaDePagamento.*;

public class App {
    
     
    public static void main(String[] args)  {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        java.util.Scanner sc = new java.util.Scanner(System.in);

       
        if (args != null && args.length > 0 && "--test".equals(args[0])) {
            funcionarios.add(new FuncionarioHorista("João", "Manhã", "11122233344", 1, 40, 25.0));
            funcionarios.add(new FuncionarioComissionado("Maria", "Tarde", "22233344455", 2, 10, 50.0));
            funcionarios.add(new FuncionarioAssalariado("Pedro", "Noite", "33344455566", 3, 3000.0, 200.0));
        } else {
           
            char opcao;
            do {
                System.out.println("\nSelecione o tipo de funcionario");
                System.out.println("1 - Horista");
                System.out.println("2 - Comissionado");
                System.out.println("3 - Assalariado");
                System.out.print("opcao: ");
                int tipo = Integer.parseInt(sc.nextLine().trim());

                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Turno: ");
                String turno = sc.nextLine();
                System.out.print("CPF: ");
                String cpf = sc.nextLine();
                System.out.print("ID (numero): ");
                int id = Integer.parseInt(sc.nextLine().trim());

                switch (tipo) {
                    case 1: {
                        System.out.print("Horas trabalhadas (mes): ");
                        int horas = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Valor da hora: ");
                        double valorHora = Double.parseDouble(sc.nextLine().trim());
                        funcionarios.add(new FuncionarioHorista(nome, turno, cpf, id, horas, valorHora));
                        break;
                    }
                    case 2: {
                        System.out.print("Total de vendas: ");
                        int vendas = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Taxa de comissao (ex: 0.05 para 5%): ");
                        double taxa = Double.parseDouble(sc.nextLine().trim());
                        funcionarios.add(new FuncionarioComissionado(nome, turno, cpf, id, vendas, taxa));
                        break;
                    }
                    case 3: {
                        System.out.print("Salario base: ");
                        double salario = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Bonus fixo: ");
                        double bonus = Double.parseDouble(sc.nextLine().trim());
                        funcionarios.add(new FuncionarioAssalariado(nome, turno, cpf, id, salario, bonus));
                        break;
                    }
                    default:
                        System.out.println("Opcao invalida");
                }

                System.out.print("\nDeseja cadastrar outro funcionario? (s/n): ");
                opcao = sc.nextLine().trim().isEmpty() ? 'n' : sc.nextLine().trim().charAt(0);
            } while (opcao == 's' || opcao == 'S');
        }

      
        System.out.println("\n===== Pagamentos =====");
        double total = 0.0;
        Funcionario maior = null;
        for (Funcionario f : funcionarios) {
            double pagamento = f.calcularPagamento();
            System.out.println(f + " | Pagamento: R$ " + pagamento);
            total += pagamento;
            if (maior == null || pagamento > maior.calcularPagamento()) {
                maior = f;
            }
        }
        System.out.println("\nTotal pago pela empresa: R$ " + total);
        if (maior != null) {
            System.out.println("Maior pagamento: " + maior.getNome() + " (R$ " + maior.calcularPagamento() + ")");
        }
        sc.close();
    }
}
