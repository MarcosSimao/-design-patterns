package patterns.criacao.factoryMethod;

import java.util.Calendar;
// fabrica abstrata
public interface Empresa {

    Passagem emitePassagem(String origem, String destino, Calendar dataHora);
}
