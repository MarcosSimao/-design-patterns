package patterns.estrutural.facade;

public class FacadeEnvioSMS {
    private ValidadorNumero validador;
    private AutenticadorProvedor autenticador;
    private RegistroSMS registro;
    private ServicoEnvioSMS servicoEnvio;

    public FacadeEnvioSMS() {
        this.validador = new ValidadorNumero();
        this.autenticador = new AutenticadorProvedor();
        this.registro = new RegistroSMS();
        this.servicoEnvio = new ServicoEnvioSMS();
    }

    public void enviarSMS(String apiKey, String numero, String mensagem) {
        if (!autenticador.autenticar(apiKey)) {
            System.out.println("❌ Erro: Autenticação falhou!");
            return;
        }

        if (!validador.validar(numero)) {
            System.out.println("❌ Erro: Número inválido!");
            return;
        }

        registro.salvar(numero, mensagem);
        servicoEnvio.enviar(numero, mensagem);
    }
}
