import java.util.ArrayList;
import java.util.Scanner;

public class SistemaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int opcao;

        do {
            System.out.println("=== Menu de Cadastro de Funcionários ===");
            System.out.println("1 - Cadastrar Funcionário Comum");
            System.out.println("2 - Cadastrar Gerente");
            System.out.println("3 - Listar Funcionários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Funcionário: ");
                    String nomeF = scanner.nextLine();
                    System.out.print("Salário do Funcionário: ");
                    double salarioFuncionario = scanner.nextDouble();
                    if (salarioFuncionario <= 0) {
                        System.out.println ("Salario invalido! tente informar um valor positivo!");
                        System.out.print("Salário do Funcionário: ");
                        salarioFuncionario = scanner.nextDouble();
                    }
                    Funcionario funcionario = new Funcionario(nomeF, salarioFuncionario);
                    funcionarios.add(funcionario);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do Gerente: ");
                    String nomeG = scanner.nextLine();
                    System.out.print("Salário do Gerente: ");
                    double salarioGerente = scanner.nextDouble();
                    if (salarioGerente <= 0) {
                        System.out.println ("Salario invalido! tente informar um valor positivo!");
                        System.out.print("Salário do Funcionário: ");
                        salarioGerente = scanner.nextDouble();
                    }
                    System.out.print("Bônus Extra do Gerente: ");
                    double bonusG = scanner.nextDouble();
                    Gerente gerente = new Gerente(nomeG, salarioGerente, bonusG);
                    funcionarios.add(gerente);
                    System.out.println("Gerente cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("== Lista de Funcionários ===");
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario funcionario1 : funcionarios) {
                            System.out.println("---------------------------");
                            System.out.println(funcionario1.exibirDados());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
