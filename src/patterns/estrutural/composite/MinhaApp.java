package patterns.estrutural.composite;

import patterns.estrutural.decorator.SMSCriptografado;
import patterns.estrutural.decorator.SMSLogger;

/*
COMPOSITE
Intencao: Tratar objetos individuais e grupos de objetos da mesma maneira, permitindo construir estruturas hierárquicas (árvores).
 */
public class MinhaApp {

	public static void main(String[] args) {
        // Criando SMS individuais
        EnvioSMS sms1 = new Sms("+5511999999999", "Promoção especial!");
        EnvioSMS sms2 = new Sms("+5511988888888", "Seu código de verificação é 123456.");
        EnvioSMS sms3 = new Sms("+5511977777777", "Feliz aniversário! 🎉");

        // Criando um grupo de SMS
        GrupoSms grupoSMS = new GrupoSms();
        grupoSMS.adicionar(sms1);
        grupoSMS.adicionar(sms2);
        grupoSMS.adicionar(sms3);

        // Teste: Enviar apenas um SMS
        System.out.println("📝 Enviando um SMS individual:");
        sms1.enviarMensagem();

        // Teste: Enviar mensagens em grupo
        System.out.println("\n📝 Enviando um grupo de SMS:");
        grupoSMS.enviarMensagem();
    }
    }


