package A_Iniciante.Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        //Ninja 1
        String NomeNinja1 = "Naruto Uzucrack";
        int Idade1 = 14;
        String NomeDaMissao1 = "Operação LAVA-JATO";
        char Dificuldade1 = 'B';
        String Status1;

        if (Idade1 < 15) {
            if (Dificuldade1 == 'C' || Dificuldade1 == 'D') {
                Status1 = "Concluída.";
            } else {
                Status1 = "Não concluída, idade insuficiente.";
            }
        } else {
            Status1 = "Concluída.";
        }

        System.out.println("Nome: " + NomeNinja1);
        System.out.println("Idade: " + Idade1);
        System.out.println("NomeDaMissao: " + NomeDaMissao1);
        System.out.println("Dificuldade: " + Dificuldade1);
        System.out.println("Status: " + Status1);
        System.out.println("----------------------");

        //Ninja 2
        String NomeNinja2 = "Sasuke RedPill";
        int Idade2 = 16;
        String NomeDaMissao2 = "CAMPARI SIM, CERVEJA NÃO";
        char Dificuldade2 = 'A';
        String Status2;

        if (Idade2 < 15) {
            if (Dificuldade2 == 'C' || Dificuldade2 == 'D') {
                Status2 = "Concluída.";
            } else {
                Status2 = "Não concluída, idade insuficiente.";
            }
        } else {
            Status2 = "Concluída.";
        }

        System.out.println("Nome: " + NomeNinja2);
        System.out.println("Idade: " + Idade2);
        System.out.println("NomeDaMissao: " + NomeDaMissao2);
        System.out.println("Dificuldade: " + Dificuldade2);
        System.out.println("Status: " + Status2);
        System.out.println("----------------------");

        //Ninja 3
        String NomeNinja3 = "Sakura Lacradora";
        int Idade3 = 2;
        String NomeDaMissao3 = "Difusão da cultura Woke";
        char Dificuldade3 = 'S';
        String Status3;

        if (Idade3 < 15) {
            if(Dificuldade3 == 'C' || Dificuldade3 == 'D') {
                Status3 = "Concluída.";
            }else {
                Status3 = "Não concluída, idade insuficiente.";
            }
        }else {
            Status3 = "Concluída.";
        }

        System.out.println("Nome: " + NomeNinja3);
        System.out.println("Idade: " + Idade3);
        System.out.println("NomeDaMissao: " + NomeDaMissao3);
        System.out.println("Dificuldade: " + Dificuldade3);
        System.out.println("Status: " + Status3);
        System.out.println("----------------------");

    }
}
