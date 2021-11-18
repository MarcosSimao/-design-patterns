package patterns.criacao.abstractFactory;

import patterns.criacao.factoryMethod.Passagem;

import java.util.Calendar;

// fabrica abstrata
public interface EmpresaOnibus {

    PassagemOnibusInterestadual emitePassagemInterEstadual(String origem, String destino, Calendar dataHora);
    PassagemOnibusUrbano emitePassagemUrbano(String origem, String destino, Calendar dataHora);
}
