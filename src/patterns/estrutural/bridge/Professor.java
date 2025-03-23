package patterns.estrutural.bridge;

public abstract class Professor{
	
	protected Implementador imp;
	
	protected Professor(Implementador imp){
		this.imp = imp;
	}
	
	public abstract void op();
}
