package patterns.estrutural.facade;

public class RegistroSMS {
    public void salvar(String numero, String mensagem) {
        System.out.println("💾 Registrando SMS no banco: " + mensagem + " para " + numero);
    }
}
