package patterns.estrutural.bridge;

public class ProfessorGraduacao extends Professor{
	
	public ProfessorGraduacao(Implementador imp){
		super(imp);
	}
	@Override
	public void op() {
		imp.opImpl();
	}
}
