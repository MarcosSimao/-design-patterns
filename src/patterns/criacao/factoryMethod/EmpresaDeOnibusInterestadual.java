package patterns.criacao.factoryMethod;

import java.util.Calendar;

//empresa concreta
public class EmpresaDeOnibusInterestadual implements Empresa{
    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataHora) {
        return new PassagemOnibusInterestadual(origem, destino, dataHora);
    }
}
