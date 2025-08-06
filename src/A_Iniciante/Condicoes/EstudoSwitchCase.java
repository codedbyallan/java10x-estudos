package A_Iniciante.Condicoes;
import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ninja;
        do {

            System.out.println("Escolha um ninja: ");
            System.out.println("[1] - Kakashi ");
            System.out.println("[2] - Gai ");
            System.out.println("[3] - Jiraya ");
            System.out.println("[4] - Tsunade ");

            ninja = sc.nextInt();

            switch (ninja) {
                case 1:
                    System.out.println("Kakashi");
                    break;
                case 2:
                    System.out.println("Gai");
                    break;
                case 3:
                    System.out.println("Jiraya");
                    break;
                case 4:
                    System.out.println("Tsunade");
                    break;
                default:
                    System.out.println("Digite a opção correta.");
                    break;
            }
        } while (ninja < 1 || ninja > 4);

        sc.close();
    }
}