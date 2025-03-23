package patterns.estrutural.bridge;

public class ProfessorPosGraduacao extends Professor{

	public ProfessorPosGraduacao(Implementador imp){
		super(imp);
	}
	@Override
	public void op() {
		imp.opImpl();
	}
}
