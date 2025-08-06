package A_Iniciante.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

// while

        int numeroDeClones = 0;
        int maxClones = 40;
        System.out.println(" * * * Laço While * * *");
        while (numeroDeClones < maxClones) {
            numeroDeClones++;
            System.out.println("Kage Bunshin no Jutsu - CLONE Nº: " + numeroDeClones);
        }
        System.out.println("\n0 STAMINA >> COMPRE MANA POT");

// for
        System.out.println(" * * * Laço For * * *");

        for (int i = 0; i <= maxClones; i++) {
            System.out.println("Kage Bunshin no Jutsu nº: " + i);
        }
        System.out.println("\nLimite de clones atingidos! \uD83D\uDE29");
    }

}
