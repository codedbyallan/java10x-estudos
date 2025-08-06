package B_Intermediario.Desafios.Desafio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Personagem> personagens = new ArrayList<>();

        int opcao = 0;
        do {
            System.out.println("=== Menu de Personagens ===");
            System.out.println("1 - Criar novo personagem");
            System.out.println("2 - Listar personagens");
            System.out.println("3 - Aprender nova Ultimate");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você deseja criar: (1 - Orc), (2 - Elfo) ou (3 - Personagem Genérico)?");
                    int tipoPersonagem = sc.nextInt();
                    sc.nextLine();
                    if (tipoPersonagem == 1) {
                        System.out.println("Digite o nome do Orc: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite a idade do Orc: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        Orc orc = new Orc();
                        orc.nome = nome;
                        orc.idade = idade;
                        personagens.add(orc);
                    } else if (tipoPersonagem == 2) {
                        System.out.println("Digite o nome do Elfo: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite a idade do Elfo: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        Elfo elfo = new Elfo();
                        elfo.nome = nome;
                        elfo.idade = idade;
                        personagens.add(elfo);
                    } else if (tipoPersonagem == 3) {
                        System.out.println("Digite o nome do Personagem: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite a idade do Personagem: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        Personagem personagem = new Personagem();
                        personagem.nome = nome;
                        personagem.idade = idade;
                        personagens.add(personagem);

                    } else {
                        System.out.println("Digite uma opção válida.");
                    }
                    break;
                case 2:
                    if (personagens.isEmpty()) {
                        System.out.println("Nenhum personagem cadastrado.");
                    } else {
                        System.out.println("Personagens Cadastrados: ");
                        for (Personagem personagem : personagens) {
                            if (personagem instanceof Orc) {
                                System.out.println(">> ORC: ");
                            } else if (personagem instanceof Elfo) {
                                System.out.println(">> ELFO: ");
                            } else {
                                System.out.println(">> PERSONAGEM GENÉRICO: ");
                            }
                            personagem.mostrarInformacoes();
                            personagem.mostrarHabilidadeEspecial();
                            System.out.println("_______________________");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Você selecionou: Aprender nova Ultimate");
                    System.out.println("Digite o número do personagem para aprender uma nova Ultimate");
                    int numeroPersonagem = sc.nextInt();
                    sc.nextLine();
                    Personagem personagemEscolhido = personagens.get(numeroPersonagem);
                    if (personagemEscolhido instanceof Orc) {
                        Orc orcEscolhido = (Orc) personagemEscolhido;
                        System.out.print("Digite a nova ultimate para o Orc: ");
                        String novaUltimate = sc.nextLine();
                        orcEscolhido.ultimate = novaUltimate;
                        System.out.println("Ultimate atualizada com sucesso!");

                    } else if (personagemEscolhido instanceof Elfo) {
                        Elfo elfoEscolhido = (Elfo) personagemEscolhido;
                        System.out.print("Digite a nova ultimate para o Elfo: ");
                        String novaUltimate = sc.nextLine();
                        elfoEscolhido.ultimate = novaUltimate;
                        System.out.println("Ultimate atualizada com sucesso!");
                    } else {
                        System.out.println("ERRO: Personagens genéricos não tem a capacidade de aprender uma Ultimate.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando cadastro de personagem...");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        }
        while (opcao != 4);
        sc.close();
    }
}
