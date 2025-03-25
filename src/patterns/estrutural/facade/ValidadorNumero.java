package patterns.estrutural.facade;

public class ValidadorNumero {
    public boolean validar(String numero) {
        return numero.matches("\\+55\\d{11}");  // Valida formato +55XXXXXXXXXXX
    }
}
