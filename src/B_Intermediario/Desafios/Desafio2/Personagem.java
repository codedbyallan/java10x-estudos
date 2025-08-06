package B_Intermediario.Desafios.Desafio2;

// exercicio para fixar conhecimentos;
//Desafio 1 — Criando a base da herança
//Objetivo: Criar a classe mãe Character (personagem) com atributos e um método genérico que depois será sobrescrito.
public class Personagem {
    String nome;
    int idade;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + "\n");
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("H.E.G. => Habilidade Especial Genérica.");
    }
}
