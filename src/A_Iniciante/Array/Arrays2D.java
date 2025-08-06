package A_Iniciante.Array;

public class Arrays2D {
    public static void main(String[] args) {
        String[][] estadosCidades = new String[3][3];

        estadosCidades[0][0] = "Minas Gerais";
        estadosCidades[0][1] = "Belo Horizonte";
        estadosCidades[0][2] = "Contagem";

        estadosCidades[1][0] = "Rio de Janeiro";
        estadosCidades[1][1] = "Niterói";
        estadosCidades[1][2] = "Belford roxo";

        estadosCidades[2][0] = "São Paulo";
        estadosCidades[2][1] = "Jundiaí";
        estadosCidades[2][2] = "São José dos Campos";
        for (int i = 0; i < estadosCidades.length; i++) {
            System.out.println((i + 1) + ". " + estadosCidades[i][0]);
            for (int j = 1; j < estadosCidades.length; j++) {
                System.out.println(" - " + estadosCidades[i][j]);
            }

        }
    }
}
