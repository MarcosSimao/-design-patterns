package patterns.estrutural.adapter;

public class TomadaBrasileira extends Tomada<PlugBrasileiro> {
	@Override
	public String conecta(PlugBrasileiro plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
	@Override
	public String getNomeRede() {
		return "tomada brasileira";
	}
}
