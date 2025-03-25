package patterns.estrutural.composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoSms implements EnvioSMS{
    private List<EnvioSMS> mensagens = new ArrayList<>();

    public void adicionar(EnvioSMS envioSMS) {
        mensagens.add(envioSMS);
    }

    public void remover(EnvioSMS envioSMS) {
        mensagens.remove(envioSMS);
    }

    @Override
    public void enviarMensagem() {
        System.out.println("📢 Enviando mensagens em grupo...");
      mensagens.forEach(EnvioSMS::enviarMensagem);
    }
}
