package patterns.criacao.builder;

public class HamburguerBuilder implements SanduicherBuilder {

    private Sanduiche s = new Hamburguer();

    public void abrePao() {
        System.out.println("Abre Pao de Hamburguer");
    }

    public void insereIngredientes() {
        System.out.println("insere carne e queijo");
    }

    @Override
    public void fecharPao() {
        System.out.println("fecha pao de Hamburguer");
    }

    @Override
    public Sanduiche getSanduicher() {
        System.out.println("hamburguer esta pronto");
        return s;
    }


}
