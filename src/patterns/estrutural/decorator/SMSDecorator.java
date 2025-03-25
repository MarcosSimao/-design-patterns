package patterns.estrutural.decorator;

import java.util.HashMap;
import java.util.Map;

public abstract class SMSDecorator implements EnvioSMS {
    protected EnvioSMS envioSMS;  // Objeto real ou outro decorator


    public SMSDecorator(EnvioSMS envioSMS) {
        this.envioSMS = envioSMS;
    }
    @Override
    public void enviarMensagem(String numero, String mensagem) {
        envioSMS.enviarMensagem(numero, mensagem);  // Chama o objeto real
    }
}
