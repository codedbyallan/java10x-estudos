package B_Intermediario.Desafios.DesafioChatGPT;

public class Genin extends Ninja {
    public Genin(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidadeEspecial = "Habilidade especial de Genin";
    }

    @Override
    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }
}