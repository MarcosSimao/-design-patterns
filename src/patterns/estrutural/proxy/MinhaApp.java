package patterns.estrutural.proxy;
/*
ADAPTER
Intencao: Fornecer um substituto ou intermediário para controlar o acesso a um objeto real.
 */
public class MinhaApp {

	public static void main(String[] args) {
        // Criamos o objeto real (Infobip)
        EnvioSMS infobip = new InfobipSMS();

        // Criamos o Proxy para controlar os envios
        EnvioSMS proxySMS = new ProxyEnvioSMS(infobip);

        // Enviamos mensagens
        proxySMS.enviarMensagem("+5511999999999", "Oferta exclusiva!");
        proxySMS.enviarMensagem("+5511999999999", "Oferta exclusiva!"); // Essa será bloqueada pelo Proxy
        proxySMS.enviarMensagem("+5511988888888", "Seu código de verificação é 123456.");
    }

}
