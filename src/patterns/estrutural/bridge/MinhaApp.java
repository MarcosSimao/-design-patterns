package patterns.estrutural.bridge;
/*
BRIDGE
Intencao: Desacoplar uma abstração de sua implementação para que ambas possam variar independentemente..
 */
public class MinhaApp {

	public static void main(String[] args) {
		
		Professor grad = new ProfessorGraduacao(new ProfessorImplGraduacao());
		grad.op();
		Professor pos = new ProfessorPosGraduacao(new ProfessorImplPosGraduacao());
		pos.op();
	}

}
