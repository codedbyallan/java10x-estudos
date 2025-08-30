package B_Intermediario.Desafios.Desafio3;

public class NinjaAvancado implements Ninja {
    private String nome;
    private int idade;
    private TipoHabilidade habilidade;
    private String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " está executando a habilidade avançada: "
                + habilidade + " com especialidade em " + especialidade);
    }

}
