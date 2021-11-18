package patterns.criacao.builder;

public interface SanduicherBuilder {
    void abrePao();
    void insereIngredientes();
    void fecharPao();
    Sanduiche getSanduicher();

}
