package patterns.estrutural.bridge;

public class ProfessorImplGraduacao extends Implementador{
    @Override
	public void opImpl() {
		System.out.println("Implementa��o Prof. Gradu��o");
		System.out.println("Tchau");
	}
	
}
