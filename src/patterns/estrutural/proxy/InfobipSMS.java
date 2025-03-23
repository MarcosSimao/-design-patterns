package patterns.estrutural.proxy;

public class InfobipSMS implements EnvioSMS{
    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando SMS via Infobip para " + numero + ": " + mensagem);
    }
}
