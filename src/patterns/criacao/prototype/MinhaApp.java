package patterns.criacao.prototype;
/*
PROTOTYPE
Intencao: Criar novos objetos através da clonagem de um protótipo existente, ao invés de instanciar diretamente uma nova instância.
 */
public class MinhaApp {

	public static void main(String[] args) {
		//Carregar os diferentes tipos de notas musicais
		Partitura.carregaNotas();

		//Compor a can��o
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Mi").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Re").desenha();
	}

}
