package B_Intermediario.Desafios.DesafioChatGPT;

public class Jounin extends Ninja {
    public Jounin(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidadeEspecial = "Habilidade especial de Jounin";
    }

    @Override
    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }
}
