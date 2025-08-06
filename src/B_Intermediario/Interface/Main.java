package B_Intermediario.Interface;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 15;
        naruto.aldeia = "Aldeia da folha";
        naruto.ModoSabioAtivado();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 16;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.SharinganAtivado();

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 17;
        sakura.aldeia = "Aldeia da folha";
        sakura.AtivarCura();

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.idade = 18;
        hinata.aldeia = "Aldeia da folha";
        hinata.ByakuganAtivado();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto H. Uzumaki";
        boruto.idade = 10;
        boruto.aldeia = "Aldeia da folha";

        boruto.ModoSabioAtivado();
        boruto.ativarKarma();
        boruto.ativarJougan();

    }
}
