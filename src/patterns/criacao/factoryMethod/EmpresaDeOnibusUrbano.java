package patterns.criacao.factoryMethod;

import java.util.Calendar;

// empresa concreta
public class EmpresaDeOnibusUrbano implements Empresa{
    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataHora) {
        return new PassagemOnibusUrbano(origem,destino,dataHora);
    }
}
