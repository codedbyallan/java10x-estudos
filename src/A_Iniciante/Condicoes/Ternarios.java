package A_Iniciante.Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de missões realizadas");
        short missoes = sc.nextShort();
        String rank = (missoes >= 15) ? "Esse ninja pode realizar o exame Chunin" : "Esse ninja precisa realizar mais missões";
        System.out.println(rank);
        sc.close();
    }
}
