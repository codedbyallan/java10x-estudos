package B_Intermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        ninja.nome = "Ninja Genérico";
        ninja.habilidadeEspecial();

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.habilidadeEspecial();
    }
}
