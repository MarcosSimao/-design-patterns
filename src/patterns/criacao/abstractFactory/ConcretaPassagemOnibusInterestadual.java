package patterns.criacao.abstractFactory;

import java.util.Calendar;

public class ConcretaPassagemOnibusInterestadual extends PassagemOnibusInterestadual{
    public ConcretaPassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Passagem de Onibus Interestadual "+this.getOrigem());
        System.out.println("para "+this.getDestino());
        System.out.println("data/hora: "+super.dateFormat.format(this.getDataHoraPartida().getTime()));
    }
}
