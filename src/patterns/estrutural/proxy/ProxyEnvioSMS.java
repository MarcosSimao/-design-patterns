package patterns.estrutural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyEnvioSMS implements EnvioSMS{
    private EnvioSMS smsReal;
    private Map<String, String> cacheMensagens;  // Armazena mensagens já enviadas

    public ProxyEnvioSMS(EnvioSMS smsReal) {
        this.smsReal = smsReal;
        this.cacheMensagens = new HashMap<>();
    }
    @Override
    public void enviarMensagem(String numero, String mensagem) {
        // Se já enviamos essa mensagem para esse número, evitamos o reenvio
        if (cacheMensagens.containsKey(numero) && cacheMensagens.get(numero).equals(mensagem)) {
            System.out.println("🔁 Mensagem duplicada detectada! Não será reenviada.");
            return;
        }

        // Logando a tentativa de envio
        System.out.println("📜 Log: Enviando mensagem para " + numero);

        // Chamamos o objeto real para enviar a mensagem
        smsReal.enviarMensagem(numero, mensagem);

        // Salvamos no cache para evitar reenvio
        cacheMensagens.put(numero, mensagem);
    }
}
