package patterns.estrutural.adapter;

public class PlugAmericano implements Plug {
	@Override
	public String obtemEletricidade() {
		return "Plug americando conectado � ";
	}
}