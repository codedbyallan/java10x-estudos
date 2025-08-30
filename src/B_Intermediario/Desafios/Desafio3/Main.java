package B_Intermediario.Desafios.Desafio3;

public class Main {
    public static void main(String[] args) {
        Ninja narutinho = new NinjaBasico("Narutinho pré-shippuden",12,TipoHabilidade.NINJUTSO);
        Ninja narutasso = new NinjaAvancado("Narutasso boladão 12 caldas",22,TipoHabilidade.KATON,
                "modo sábio");

        narutinho.mostrarInformacoes();
        narutinho.executarHabilidade();
        System.out.println("----------------");
        narutasso.mostrarInformacoes();
        narutasso.executarHabilidade();

    }
}
