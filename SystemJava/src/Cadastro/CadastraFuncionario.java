package Cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.constant.ConstantDescs.NULL;

public class CadastraFuncionario {
    static List<String> NomeFuncionario = new ArrayList<String>();
    static List<Double> SalarioFuncionario = new ArrayList<Double>();
    static int NumerosCPF = 11;
    static List<Integer> IdadeFuncionario = new ArrayList<Integer>();



    public static void CadastroFuncionario() {
     Scanner sc = new Scanner(System.in);
        System.out.println("=============Cadastro do funcionario===========");

        while (true) {
            System.out.println("Nome do funcionario ou (Sair) para terminar o programa: ");
            String nome = sc.next();

            System.out.println("Salario do funcionario: ");
            double salario = sc.nextDouble();

            System.out.println("Cpf do funcionario: ");


            System.out.println("Idade do funcionario: ");
            int idade = sc.nextInt();


            if (nome.equalsIgnoreCase("Sair")) {
                System.out.println("Saindo...");
                break;

            }
            NomeFuncionario.add(nome);
            IdadeFuncionario.add(idade);
            SalarioFuncionario.add(salario);
            System.out.println("==============================================");
            System.out.println(nome + ",Seus como Funcionario cadastrado com sucesso!");
            System.out.println("==============================================");
        }
        sc.close();
    }

}
