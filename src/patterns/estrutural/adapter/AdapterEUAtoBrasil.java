package patterns.estrutural.adapter;

//Adapter
public class AdapterEUAtoBrasil extends TomadaBrasileira {
	
	public String conecta(Plug plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
}
