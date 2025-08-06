package B_Intermediario.Desafios.DesafioChatGPT;

public class Chuunin extends Ninja {
    public Chuunin(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidadeEspecial = "Habilidade especial de Chuunin";
    }

    @Override
    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }

}
