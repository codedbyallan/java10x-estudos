package B_Intermediario.Desafios.Desafio1;

public class Ninja {
    String nome;
    int idade;
    String missao;
    char nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("### TOP SECRET ###\n");
        System.out.println("### Informações do Ninja ### ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("\n### Missão ###");
        System.out.println("Missão: " + missao);
        System.out.println("Missão - Rank " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
    }

}
