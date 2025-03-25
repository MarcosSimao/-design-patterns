package patterns.estrutural.decorator;

public class SMSCriptografado extends SMSDecorator{
    public SMSCriptografado(EnvioSMS envioSMS) {
        super(envioSMS);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        String mensagemCriptografada = "***" + mensagem.hashCode() + "***";  // Simulação de criptografia
        super.enviarMensagem(numero, mensagemCriptografada);
    }
}
