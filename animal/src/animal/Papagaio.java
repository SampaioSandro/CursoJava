package animal;

public class Papagaio extends AnimalDomestico implements CriaAsas {

	private int senha;
	private String costume;
	private int asas;

	public void setCostume(String costume) {
		this.costume = costume;
	}

	public String getCostume() {
		return costume;
	}

	@Override
	public int getAsas() {
		return this.asas;
	}

	@Override
	public void setAsas(int asas) {
		this.asas = asas;

	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
