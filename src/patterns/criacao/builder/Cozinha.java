package patterns.criacao.builder;

public class Cozinha {

    public void fazSanduicher(SanduicherBuilder builder){
        builder.abrePao();
        builder.insereIngredientes();
        builder.fecharPao();
    }
}
