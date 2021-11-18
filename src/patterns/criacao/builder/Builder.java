package patterns.criacao.builder;

/*
BUILDER
Intecao : separar a contrucao de um objeto complexo da sua
representacao de modo que o mesmo processo de construcao possa criar diferentes representacoes
separa a contrucao do objeto de sua representacao
 */
public class Builder {

    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha();

        SanduicherBuilder s1 = new HamburguerBuilder();
        SanduicherBuilder s2 = new FisherBuilder();

        cozinha.fazSanduicher(s1);
        s1.getSanduicher();
        cozinha.fazSanduicher(s2);
        s2.getSanduicher();

    }
}
