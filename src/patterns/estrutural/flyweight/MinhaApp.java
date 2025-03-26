package patterns.estrutural.flyweight;

import patterns.estrutural.proxy.EnvioSMS;
import patterns.estrutural.proxy.InfobipSMS;
import patterns.estrutural.proxy.ProxyEnvioSMS;

/*
FLYWEIGHT
Intencao: Evitar a criação desnecessária de objetos duplicados ao compartilhar instâncias comuns, economizando memória e melhorando o desempenho.
 */
public class MinhaApp {

	public static void main(String[] args) {
        SMS msg1 = FabricaMensagemSMS.getMensagem("Promoção: 50% de desconto!");
        msg1.enviar("+5511999999999");

        SMS msg2 = FabricaMensagemSMS.getMensagem("Seu código de verificação: 123456");
        msg2.enviar("+5511988888888");

        SMS msg3 = FabricaMensagemSMS.getMensagem("Promoção: 50% de desconto!");
        msg3.enviar("+5511977777777");

        // Verifica se msg1 e msg3 são o mesmo objeto
        System.out.println("\n🔍 msg1 == msg3? " + (msg1 == msg3));
    }

}
