import Cadastro.CadastraFuncionario;

import java.util.Scanner;

public class PagInicial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao =0;

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
                case 1: CadastraFuncionario.CadastroFuncionario();
                break;
                case 2: Main.MostraFuncionarios();
                break;
                case 3: Main.ProcuraFuncionarios();
                break;
                case 0: System.out.println("Encerrando...");
                break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();  // Fecha o Scanneropcao != 0);
    }
}
