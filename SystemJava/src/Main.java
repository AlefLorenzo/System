import java.util.Scanner;

public class Main {  // Nome alterado para evitar conflito
    static String[] nome = new String[10];
    static double[] salario = new double[10];
    static String[] profission = new String[10];
    static int [] setor = new int[10];
    static int i = 0;  // Inicializado
    static Scanner sc = new Scanner(System.in);  // Único Scanner

    public static void CadastraFuncionarios() {
        if (i >= 10) {
            System.out.println("Limite de funcionários atingido!");
            return;
        }

        System.out.println("===========Cadastro de funcionarios=========");
        System.out.print("Digite o nome do funcionario: ");
        nome[i] = sc.nextLine();

        System.out.print("Digite o salario do funcionario: ");
        salario[i] = sc.nextDouble();
        sc.nextLine();  // Limpa o buffer

        System.out.print("Digite qual a profissao do funcionario: ");
        profission[i] = sc.nextLine();

        System.out.printf("Digite o setor do funcionario: ");
        setor[i] = sc.nextInt();

        System.out.println("            =========      ");
        System.out.println("Usuario cadastrado com sucesso!");
        System.out.println("            =========      ");
        i++;
    }

    public static void MostraFuncionarios() {
        if (i == 0) {
            System.out.println("Nenhum funcionário cadastrado!");
            return;
        }

        System.out.println("\n=== Lista de Funcionários ===");
        for (int j = 0; j < i; j++) {  // Só mostra os cadastrados
            System.out.printf(" %d.Nome: %s | Salario: R$ %.2f | Profissao: %s | Setor: %d \n",
                    j+1, nome[j], salario[j], profission[j], setor[j]);
        }
    }

    public static void ProcuraFuncionarios() {
        if (i == 0) {
            System.out.println("Nenhum funcionário cadastrado!");
            return;
        }

        System.out.print("Digite o nome do funcionario que deseja procurar: ");
        String busca = sc.nextLine();
        boolean encontrado = false;

        for (int j = 0; j < i; j++) {
            if (busca.equalsIgnoreCase(nome[j])) {  // Comparação correta
                System.out.println("-----------");
                System.out.printf("Funcionário encontrado:" +
                        "\n Nome: %s - Salario: R$ %.2f\n",
                        nome[j], salario[j]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário não encontrado!");
        }
    }

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n===== Menu Principal =====");
            System.out.println("1 - Cadastrar Funcionarios");
            System.out.println("2 - Listar Funcionarios");
            System.out.println("3 - Procurar Funcionario");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();  // Limpa o buffer

            switch (opcao) {
                case 1: CadastraFuncionarios(); break;
                case 2: MostraFuncionarios(); break;
                case 3: ProcuraFuncionarios(); break;
                case 0: System.out.println("Encerrando..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();  // Fecha o Scanner
    }
}