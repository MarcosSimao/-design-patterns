package patterns.criacao.abstractFactory;

import java.util.Calendar;

public class ConcretaEmpresaOnibus implements EmpresaOnibus{
    @Override
    public PassagemOnibusInterestadual emitePassagemInterEstadual(String origem, String destino, Calendar dataHora) {
        return new ConcretaPassagemOnibusInterestadual(origem,destino,dataHora);
    }

    @Override
    public PassagemOnibusUrbano emitePassagemUrbano(String origem, String destino, Calendar dataHora) {
        return new ConcretaPassagemOnibusUrbano(origem,destino,dataHora);
    }
}
