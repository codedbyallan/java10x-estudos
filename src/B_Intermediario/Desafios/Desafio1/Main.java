package B_Intermediario.Desafios.Desafio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        ArrayList<Ninja> listaDeNinjas = new ArrayList<>();


        do {
            System.out.println("\n# Menu Ninja: ");
            System.out.println("[1] Cadastrar nova missão");
            System.out.println("[2] Exibir missões ativas");
            System.out.println("[3] Atualizar habilidade especial");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("O Ninja é um Uchiha? (s/n)");
                    String tipoNinja = sc.nextLine();

                    if (tipoNinja.equalsIgnoreCase("s")) {

                        System.out.println("Digite o nome do ninja: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite a idade do ninja: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite o nome da missão: ");
                        String missao = sc.nextLine();
                        System.out.println("Digite o Rank associado à missão: ");
                        char nivelDificuldade = sc.next().charAt(0);
                        sc.nextLine();
                        System.out.println("Digite o Status da missão: ");
                        String statusMissao = sc.nextLine();

                        Uchiha uchiha = new Uchiha();
                        uchiha.nome = nome;
                        uchiha.idade = idade;
                        uchiha.missao = missao;
                        uchiha.nivelDificuldade = nivelDificuldade;
                        uchiha.statusMissao = statusMissao;
                        listaDeNinjas.add(uchiha);

                        System.out.println("\n\n✅ Missão cadastrada com sucesso!");
                    } else {
                        System.out.println("Digite o nome do ninja: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite a idade do ninja: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite o nome da missão: ");
                        String missao = sc.nextLine();
                        System.out.println("Digite o Rank associado à missão: ");
                        char nivelDificuldade = sc.next().charAt(0);
                        sc.nextLine();
                        System.out.println("Digite o Status da missão: ");
                        String statusMissao = sc.nextLine();

                        Ninja ninja = new Ninja();
                        ninja.nome = nome;
                        ninja.idade = idade;
                        ninja.missao = missao;
                        ninja.nivelDificuldade = nivelDificuldade;
                        ninja.statusMissao = statusMissao;
                        listaDeNinjas.add(ninja);
                        System.out.println("\n\n✅ Missão cadastrada com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("Missões ativas: \n");
                    if (listaDeNinjas.isEmpty()) {
                        System.out.println("Lista de missões vazia, cadastre uma nova missão.");
                    } else {
                        for (Ninja n : listaDeNinjas) {
                            n.mostrarInformacoes();
                            System.out.println("----------------------------");
                        }
                    }
                    break;
                case 3:
                    if (listaDeNinjas.isEmpty()) {
                        System.out.println("⚠\uFE0F Nenhum ninja cadastrado.");
                    }
                    for (int i = 0; i < listaDeNinjas.size(); i++) {
                        System.out.println("[" + i + "] " + listaDeNinjas.get(i).nome);
                    }
                    System.out.print("Digite o número do ninja que deseja atualizar: ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    if (listaDeNinjas.get(indice) instanceof Uchiha) {
                        Uchiha u = (Uchiha) listaDeNinjas.get(indice);
                        System.out.print("Digite a nova habilidade especial: ");
                        String novaHabilidade = sc.nextLine();
                        u.habilidadeEspecial = novaHabilidade;

                    } else {
                        System.out.println("❌ Esse ninja não é um Uchiha e não possui habilidade especial.");

                    }

                    break;
                case 4:
                    System.out.println("Encerrando programa.");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;

            }
        } while (opcao != 4);
        sc.close();

    }
}