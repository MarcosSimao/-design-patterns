package patterns.estrutural.decorator;

public class SMSLogger extends SMSDecorator{
    public SMSLogger(EnvioSMS envioSMS) {
        super(envioSMS);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("📜 Log: Enviando mensagem para " + numero);
        super.enviarMensagem(numero, mensagem);
    }
}
