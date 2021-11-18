package patterns.criacao.builder;

public class FisherBuilder implements SanduicherBuilder{
    Sanduiche s= new FishBurguer();
    @Override
    public void abrePao() {
        System.out.println("Abre Pao de fish");
    }

    public void insereIngredientes() {
        System.out.println("insere carne e queijo");
    }

    @Override
    public void fecharPao() {
        System.out.println("fecha pao de fish");
    }

    @Override
    public Sanduiche getSanduicher() {
        System.out.println("fish esta pronto");
        return s;
    }
}
