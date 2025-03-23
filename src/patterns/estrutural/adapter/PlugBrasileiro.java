package patterns.estrutural.adapter;

public class PlugBrasileiro implements Plug {
    @Override
	public String obtemEletricidade() {
		return "Plug brasileiro conectado � ";
	}
}
