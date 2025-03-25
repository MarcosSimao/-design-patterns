package patterns.estrutural.facade;

public class AutenticadorProvedor {
    public boolean autenticar(String apiKey) {
        return "CHAVE_SECRETA".equals(apiKey);  // Simulação de autenticação
    }
}
