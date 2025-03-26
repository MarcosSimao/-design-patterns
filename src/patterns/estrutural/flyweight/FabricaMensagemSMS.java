package patterns.estrutural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaMensagemSMS {
    private static final Map<String, SMS> mensagens = new HashMap<>();

    public static SMS getMensagem(String conteudo) {
        if (!mensagens.containsKey(conteudo)) {
            mensagens.put(conteudo, new MensagemCompartilhada(conteudo));
            System.out.println("🆕 Criando nova mensagem: " + conteudo);
        } else {
            System.out.println("♻️ Reutilizando mensagem existente: " + conteudo);
        }
        return mensagens.get(conteudo);
    }
}
