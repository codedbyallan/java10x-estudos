package A_Iniciante.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numMax = 3;
        String[] ninjas = new String[numMax];

        int opcao = 0;
        int ninjasCadastrados = 0;

        while (opcao != 4) {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("4. Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    if (ninjasCadastrados < numMax) {
                        System.out.println("\n===== Digite o nome do Ninja =====");
                        final String nomeNinja = sc.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("\n===== Ninja cadastrado com sucesso! =====");

                    } else {
                        System.out.println("\n===== Lista encerrada, impossível cadastrar mais Ninjas =====");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("\n===== Lista de Ninjas vazia, voltando ao MENU =====");
                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n===== Digite a posição do Ninja que você quer deletar =====");
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] != null) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }
                    int del = sc.nextInt();
                    sc.nextLine();
                    if (del >= 1 && del <= numMax && ninjas[del - 1] != null) {
                        System.out.println("Ninja " + ninjas[del - 1] + " deletado com sucesso!");
                        ninjas[del - 1] = null;
                        ninjasCadastrados--;
                    } else {
                        System.out.println("Número inválido ou posição vazia.");
                    }
                    break;

                case 4:
                    System.out.println("\n===== Cadastro encerrado =====");
                    break;

                default:
                    System.out.println("\n===== Digite uma opção válida. =====");
                    break;
            }
        }
        sc.close();
    }
}


