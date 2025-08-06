package A_Iniciante.Condicoes;

public class IFeElse {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 40;
        boolean hokage = false;
        short numeroDeMissoes = 100;
        if (numeroDeMissoes >= 15 && numeroDeMissoes < 30 && idade > 15) {
            rank = "Chunin";
        } else if (numeroDeMissoes >= 30 && numeroDeMissoes <100 && idade >= 20) {
            rank = "Jounin";
        } else if (numeroDeMissoes >= 100 && idade >= 40) {
            rank = "Hokage";
        } else {
            rank = "Genin";

        }
        System.out.println("O rank do ninja é: "+rank);

    }
}