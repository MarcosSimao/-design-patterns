package patterns.estrutural.composite;

public class Sms implements EnvioSMS {
    private String numero;
    private String mensagem;

    public Sms(String numero, String mensagem) {
        this.numero = numero;
        this.mensagem = mensagem;
    }

    @Override
    public void enviarMensagem() {
        System.out.println("📡 Enviando SMS para " + numero + ": " + mensagem);
    }
}
