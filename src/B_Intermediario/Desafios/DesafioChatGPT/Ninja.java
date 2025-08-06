package B_Intermediario.Desafios.DesafioChatGPT;

public class Ninja {
    String nome;
    int idade;
    String missaoAtual;
    char rankMissao;
    String status;
    String habilidadeEspecial = "Habilidade genérica de Ninja";

    public void mostrarInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao atual: " + missaoAtual);
        System.out.println("Missão nível " + rankMissao);
        System.out.println("Status da missão: " + status + "\n");
        System.out.println("------------\n");
    }

    public void mostrarInformacoesBasicas() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + "\n");
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }

}
