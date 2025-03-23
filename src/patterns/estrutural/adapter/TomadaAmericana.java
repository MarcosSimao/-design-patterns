package patterns.estrutural.adapter;

public class TomadaAmericana extends Tomada<PlugAmericano> {
	@Override
	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
	@Override
	public String getNomeRede() {
		return "tomada americana";
	}
}
