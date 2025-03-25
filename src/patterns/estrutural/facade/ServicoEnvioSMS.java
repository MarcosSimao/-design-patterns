package patterns.estrutural.facade;

public class ServicoEnvioSMS {
    public void enviar(String numero, String mensagem) {
        System.out.println("📡 Enviando SMS para " + numero + ": " + mensagem);
    }
}
