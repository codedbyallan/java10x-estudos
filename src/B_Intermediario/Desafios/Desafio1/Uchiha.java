package B_Intermediario.Desafios.Desafio1;

public class Uchiha extends Ninja {

    String habilidadeEspecial = "\uD83D\uDD25⚡CHIDORI!!!⚡\uD83D\uDD25";

    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("\n - HABILIDADE ESPECIAL: " + habilidadeEspecial);
    }
}
