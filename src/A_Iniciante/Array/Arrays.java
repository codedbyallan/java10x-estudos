package A_Iniciante.Array;

public class Arrays {
    public static void main(String[] args) {
        String[] ninjas = new String[4];                               //criando o array com 4 posições
        ninjas[0] = "Ninja 1";
        ninjas[1] = "Ninja 2";
        ninjas[2] = "Ninja 3";
        ninjas[3] = "Ninja 4";
        System.out.println(ninjas[1]);                                  //imprimir o ninja na posição 1 (ninja 2)
        System.out.println(java.util.Arrays.toString(ninjas));          //Imprimir todos os dados do array
                                                                        // Aprender depois, ainda não foi falado!)

        String[] testes = {"Ninja 1","Ninja 2","Ninja 3","Ninja 4"};    //Criando o array ja passando os dados;

        System.out.println(testes[2]);                                  //imprimir o dado na posição 2 (ninja 3).

        int[]idade = new int[2];
        idade[0] = 10;
        idade[1] = 20;
        System.out.println(idade[0]);

        boolean[]VouF = new boolean[2];
        System.out.println(VouF[0]);
                                                                        // podemos utilizar o >for< para percorrer toda
                                                                        // a lista de array e listar todos com o sout.
                                                                        // no caso desse for,
                                                                        //inicializa a variavel 'i' começando em 0,
                                                                        //e fala que, enquanto i for < 4,
                                                                        //i++ incrementa um valor e, qnd pedimos para
                                                                        //imprimir ninjas na posição 'i',
                                                                        // irá mostrar o percurso percorrido por 'i'.
        for (int i = 0; i < 4; i++) {
            System.out.println(ninjas[i]);
            
        }
    }
}
