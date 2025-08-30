package B_Intermediario.Construtores;

public class Main {
    public static void main(String[] args) {
        Hokages hashirama = new Hokages();
        hashirama.nome = "Hashirama Senju";
        hashirama.idade = 45;
        hashirama.vivoOuNao = true;
        System.out.println("Nome: " + hashirama.nome+ "\nIdade: " + hashirama.idade + "\nVivo: " + hashirama.vivoOuNao+"\n -----------");

        Hokages tobirama = new Hokages("Tobirama Senju");
        System.out.println(tobirama.nome);

        Hokages hiruzen = new Hokages(89);
        System.out.println(hiruzen.idade);

        Hokages minato = new Hokages("Minato Namikaze",32,false);
        System.out.println(minato.nome);
    }
}
