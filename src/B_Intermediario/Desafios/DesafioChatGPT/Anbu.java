package B_Intermediario.Desafios.DesafioChatGPT;

public class Anbu extends Ninja {
    public Anbu(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidadeEspecial = "Habilidade especial da equipe especial ANBU";
    }

    @Override
    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }
}
