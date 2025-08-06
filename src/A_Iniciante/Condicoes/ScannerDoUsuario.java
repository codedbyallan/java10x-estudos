package A_Iniciante.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeDoNinja;
        int idade;

        System.out.println("Digite o nome do Ninja: ");
        nomeDoNinja = input.nextLine();

        System.out.println("Digite a idade: ");
        idade = input.nextInt();

        System.out.println("____________");
        System.out.println("Nome: " + nomeDoNinja);
        System.out.println("Idade: " + idade);

        if(idade >= 18){
            System.out.println("Ninja maior de idade. Habilitado a fazer missões SOLO.");
        }else{
            System.out.println("Ninja menor de idade, precisa de um supervisor adulto.");
        }




        input.close();

    }
}
