package patterns.criacao.factoryMethod;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//produto
public abstract class Passagem {

    private String origem;
    private String destino;
    private Calendar dataHora;


    protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Passagem(String origem, String destino, Calendar dataHora) {
        this.origem = origem;
        this.destino = destino;
        this.dataHora = dataHora;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Calendar getDataHora() {
        return dataHora;
    }

    public void setDataHora(Calendar dataHora) {
        this.dataHora = dataHora;
    }

    public abstract void exibeDetalhes();
}
