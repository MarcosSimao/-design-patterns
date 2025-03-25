package patterns.estrutural.decorator;

/*
Decorator
Intencao: Adicionar funcionalidades a um objeto de forma flexível, sem modificar sua estrutura original..
 */
public class MinhaApp {

	public static void main(String[] args) {
        // Criamos o objeto real (Infobip)
        EnvioSMS infobip = new InfobipSMS();

        // Aplicamos o Decorator de Log
        EnvioSMS smsComLog = new SMSLogger(infobip);

        // Aplicamos o Decorator de Criptografia por cima do Log
        EnvioSMS smsSeguro = new SMSCriptografado(smsComLog);

        // Teste final: Enviar SMS com Log e Criptografia
        smsSeguro.enviarMensagem("+5511999999999", "Oferta especial!");

        // Teste: Apenas Log sem Criptografia
        smsComLog.enviarMensagem("+5511988888888", "Seu código é 123456.");
    }

}
