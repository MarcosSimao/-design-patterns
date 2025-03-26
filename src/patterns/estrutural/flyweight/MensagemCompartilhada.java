package patterns.estrutural.flyweight;

public class MensagemCompartilhada implements SMS {
    private final String conteudo; // Estado Intrínseco (imutável)

    public MensagemCompartilhada(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void enviar(String numero) {
        System.out.println("📡 Enviando SMS para " + numero + ": " + conteudo);
    }
}
