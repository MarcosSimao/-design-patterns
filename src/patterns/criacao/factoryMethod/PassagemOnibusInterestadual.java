package patterns.criacao.factoryMethod;

import java.util.Calendar;
//produto concreto
public class PassagemOnibusInterestadual  extends Passagem{

    public PassagemOnibusInterestadual(String origem, String destino, Calendar dataHora) {
        super(origem, destino, dataHora);
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Passagem de Onibus Interestadual "+this.getOrigem());
        System.out.println("para "+this.getDestino());
        System.out.println("data/hora: "+super.dateFormat.format(this.getDataHora().getTime()));
    }

}
