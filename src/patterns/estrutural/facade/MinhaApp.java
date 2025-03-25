package patterns.estrutural.facade;

/*
FACADE
Intencao: Esconder a complexidade de subsistemas e fornecer uma interface simples para o cliente
 */
public class MinhaApp {

	public static void main(String[] args) {
        FacadeEnvioSMS facade = new FacadeEnvioSMS();

        // Teste com chave correta e número válido
        System.out.println("✅ Enviando SMS válido:");
        facade.enviarSMS("CHAVE_SECRETA", "+5511999999999", "Promoção especial!");

        // Teste com chave errada
        System.out.println("\n🚫 Tentativa com chave errada:");
        facade.enviarSMS("CHAVE_ERRADA", "+5511999999999", "Mensagem bloqueada.");

        // Teste com número inválido
        System.out.println("\n🚫 Tentativa com número inválido:");
        facade.enviarSMS("CHAVE_SECRETA", "11999999999", "Mensagem inválida.");
    }
}


