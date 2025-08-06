package B_Intermediario.Desafios.DesafioChatGPT;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final ArrayList<Ninja> ninjas = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("=== Sistema Ninja de Konoha ===\n");
            System.out.println("1. Cadastrar novo Ninja");
            System.out.println("2. Listar todos os Ninjas com missões cadastradas");
            System.out.println("3. Cadastrar missão de um Ninja");
            System.out.println("4. Exibir habilidade especial de um Ninja");
            System.out.println("5. Atualizar habilidade especial de um Ninja");

            //1.Perguntar qual ninja
            //2.exibir indice
            //3.capturar
            //4. sobrescrever

            System.out.println("6. Sair\n");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar novo Ninja: \n");
                    System.out.println("Qual rank do Ninja a ser cadastrado?");
                    System.out.println("[1] Genin;");
                    System.out.println("[2] Chuunin;");
                    System.out.println("[3] Jounin;");
                    System.out.println("[4] ANBU;");
                    final int rankEscolhido = sc.nextInt();
                    sc.nextLine();

                    if (rankEscolhido == 1) {
                        System.out.println("Digite o nome do Genin: ");
                        final String nome = sc.nextLine();
                        System.out.println("Digite a idade do Genin: ");
                        final int idade = sc.nextInt();
                        sc.nextLine();
                        final Genin ninjaGenin = new Genin(nome, idade);
                        ninjas.add(ninjaGenin);

                    } else if (rankEscolhido == 2) {
                        System.out.println("Digite o nome do Chuunin: ");
                        final String nome = sc.nextLine();
                        System.out.println("Digite a idade do Chuunin: ");
                        final int idade = sc.nextInt();
                        sc.nextLine();
                        final Chuunin ninjaChuunin = new Chuunin(nome, idade);
                        ninjas.add(ninjaChuunin);

                    } else if (rankEscolhido == 3) {
                        System.out.println("Digite o nome do Jounin: ");
                        final String nome = sc.nextLine();
                        System.out.println("Digite a idade do Jounin: ");
                        final int idade = sc.nextInt();
                        sc.nextLine();
                        final Jounin ninjaJounin = new Jounin(nome, idade);
                        ninjas.add(ninjaJounin);

                    } else if (rankEscolhido == 4) {

                        System.out.println("Digite o nome do ANBU: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite a idade do ANBU: ");
                        final int idade = sc.nextInt();
                        sc.nextLine();
                        final Anbu ninjaANBU = new Anbu(nome, idade);
                        ninjas.add(ninjaANBU);
                    } else {
                        System.out.println("Opção inválida. Digite a opção correta!");
                    }
                    break;
                case 2:
                    if (ninjas.isEmpty()) {
                        System.out.println("Nenhum Ninja Cadastrado");
                    } else {
                        System.out.println("Ninjas cadastrados: ");
                        for (final Ninja ninja : ninjas) {
                            switch (ninja) {
                                case final Genin genin -> System.out.println(">> Genin:");
                                case final Chuunin chuunin -> System.out.println(">> Chuunin:");
                                case final Jounin jounin -> System.out.println(">> Jounin:");
                                case null, default -> System.out.println(">> ANBU: ");
                            }
                            assert ninja != null;
                            ninja.mostrarInformacoes();
                        }
                    }
                    break;
                case 3:
                    if (ninjas.isEmpty()) {
                        System.out.println("Para cadastrar uma missão, é necessário cadastrar pelo menos um Ninja.");
                    } else {
                        System.out.println("Escolha o Ninja para atribuí-lo a uma missão:\n");
                        for (int i = 0; i < ninjas.size(); i++) {
                            if (ninjas.get(i) instanceof Genin) {
                                System.out.println("[" + i + "] Genin:");
                            } else if (ninjas.get(i) instanceof Chuunin) {
                                System.out.println("[" + i + "] Chuunin:");
                            } else if (ninjas.get(i) instanceof Jounin) {
                                System.out.println("[" + i + "] Jounin:");
                            } else {
                                System.out.println("[" + i + "] ANBU:");
                            }
                            ninjas.get(i).mostrarInformacoes();
                        }
                        System.out.println("Digite o número do Ninja escolhido: ");
                        final int ninjaEscolhido = sc.nextInt();
                        sc.nextLine();
                        if (ninjaEscolhido >= 0 && ninjaEscolhido < ninjas.size()) {
                            final Ninja ninjaSelecionado = ninjas.get(ninjaEscolhido);
                            System.out.println("Digite o nome da missão: ");
                            final String nomeMissao = sc.nextLine();
                            System.out.println("Atribua o Nível da missão: [S],[A],[B],[C] ou [D]");
                            final char nivelMissao = sc.nextLine().toUpperCase().charAt(0);
                            if (nivelMissao == 'S' || nivelMissao == 'A') {
                                if (ninjaSelecionado.idade < 15) {
                                    System.out.println("Missões de RANK S ou A só podem ser realizadas por Ninjas" +
                                            " maiores de 15 anos.");
                                    break;
                                }
                                if (!(ninjaSelecionado instanceof Jounin) && !(ninjaSelecionado instanceof Anbu)) {
                                    System.out.println("Missões de RANK S ou A só podem ser realizadas por Ninjas" +
                                            " de rank Anbu/Jounin.");
                                    break;
                                }
                            }
                            System.out.println("Digite o Status da missão: ");
                            final String statusMissao = sc.nextLine();
                            ninjaSelecionado.missaoAtual = nomeMissao;
                            ninjaSelecionado.rankMissao = nivelMissao;
                            ninjaSelecionado.status = statusMissao;
                            System.out.println("Missão cadastrada com sucesso!");
                        } else {
                            System.out.println("Número inválido, Ninja não encontrado!");
                        }

                    }
                    break;
                case 4:
                    if (ninjas.isEmpty()) {
                        System.out.println("Nenhum Ninja cadastrado!");
                    } else {
                        System.out.println("Escolha um ninja para exibir sua habilidade especial:\n");
                    }
                    for (int i = 0; i < ninjas.size(); i++) {
                        switch (ninjas.get(i)) {
                            case final Genin genin -> System.out.println("[" + i + "] Genin: ");
                            case final Chuunin chuunin -> System.out.println("[" + i + "] Chuunin: ");
                            case final Jounin jounin -> System.out.println("[" + i + "] Jounin: ");
                            case null, default -> System.out.println("[" + i + "] Anbu: ");
                        }
                        ninjas.get(i).mostrarInformacoesBasicas();
                    }
                    System.out.println("\nDigite o número do Ninja escolhido: ");
                    final int ninjaEscolhido = sc.nextInt();
                    sc.nextLine();

                    if (ninjaEscolhido >= 0 && ninjaEscolhido < ninjas.size()) {
                        final Ninja ninja = ninjas.get(ninjaEscolhido);
                        System.out.println("\nHabilidade especial de " + ninja.nome + ":");
                        ninja.mostrarHabilidadeEspecial();
                        System.out.println();
                    } else {
                        System.out.println("Número inválido.");
                    }
                    System.out.println("Gostaria de atualizar a habilidade especial do ninja? (S/N)");
                    final char atualizar = sc.nextLine().toUpperCase().charAt(0);
                    if (atualizar == 'S') {
                        System.out.println("Escolha o Ninja para alterar sua habilidade especial:\n");

                        for (int i = 0; i < ninjas.size(); i++) {
                            switch (ninjas.get(i)) {
                                case final Genin genin -> System.out.println("[" + i + "] Genin: ");
                                case final Chuunin chuunin -> System.out.println("[" + i + "] Chuunin: ");
                                case final Jounin jounin -> System.out.println("[" + i + "] Jounin: ");
                                case null, default -> System.out.println("[" + i + "] Anbu: ");
                            }
                            ninjas.get(i).mostrarInformacoesBasicas();
                            System.out.println("Habilidade atual: ");
                            ninjas.get(i).mostrarHabilidadeEspecial();
                            System.out.println();
                        }

                        System.out.print("Digite o número do Ninja escolhido: ");
                        final int numeroIndice = sc.nextInt();
                        sc.nextLine();

                        if (numeroIndice >= 0 && numeroIndice < ninjas.size()) {
                            final Ninja ninjaEscolhido2 = ninjas.get(numeroIndice);
                            System.out.print("Digite a nova habilidade especial: ");
                            final String novaHabilidade = sc.nextLine();
                            ninjaEscolhido2.habilidadeEspecial = novaHabilidade;

                            System.out.println("Habilidade especial atualizada com sucesso!");
                        } else {
                            System.out.println("Número inválido. Nenhum ninja atualizado.");
                        }
                    } else {
                        System.out.println("Voltando ao menu . . .");
                    }

                    break;
                case 5:
                    if (ninjas.isEmpty()) {
                        System.out.println("Nenhum Ninja encontrado!");
                    } else {
                        System.out.println("Escolha o Ninja para alterar sua habilidade especial:\n");

                        for (int i = 0; i < ninjas.size(); i++) {
                            switch (ninjas.get(i)) {
                                case final Genin genin -> System.out.println("[" + i + "] Genin: ");
                                case final Chuunin chuunin -> System.out.println("[" + i + "] Chuunin: ");
                                case final Jounin jounin -> System.out.println("[" + i + "] Jounin: ");
                                case null, default -> System.out.println("[" + i + "] Anbu: ");
                            }
                            ninjas.get(i).mostrarInformacoesBasicas();
                            System.out.println("Habilidade atual: ");
                            ninjas.get(i).mostrarHabilidadeEspecial();
                            System.out.println();
                        }

                        System.out.print("Digite o número do Ninja escolhido: ");
                        final int numeroIndice = sc.nextInt();
                        sc.nextLine();

                        if (numeroIndice >= 0 && numeroIndice < ninjas.size()) {
                            final Ninja ninjaEscolhido2 = ninjas.get(numeroIndice);
                            System.out.print("Digite a nova habilidade especial: ");
                            final String novaHabilidade = sc.nextLine();
                            ninjaEscolhido2.habilidadeEspecial = novaHabilidade;

                            System.out.println("Habilidade especial atualizada com sucesso!");
                        } else {
                            System.out.println("Número inválido. Nenhum ninja atualizado.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Encerrando . . .");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        } while (opcao != 6);


        sc.close();

    }
}