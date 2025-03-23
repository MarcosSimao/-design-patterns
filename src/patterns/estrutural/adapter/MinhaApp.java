package patterns.estrutural.adapter;
/*
ADAPTER
Intencao: Converter a interface de uma classe em outra que o cliente espera.
Converter a interface de uma classe para outra interface esperada pelo cliente
 */
public class MinhaApp {

	public static void main(String[] args) {
		//Adaptado
		PlugAmericano plugEUA = new PlugAmericano();
        PlugBrasileiro plugBr = new PlugBrasileiro();
		AdapterEUAtoBrasil tomadaModificada = new AdapterEUAtoBrasil();
		String Peua = tomadaModificada.conecta(plugEUA);
		String Pbr =  tomadaModificada.conecta(plugBr);
		
		System.out.println(Peua);
		System.out.println(Pbr);

	}

}
