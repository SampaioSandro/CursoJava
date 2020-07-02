package animal;

public class Pato extends AnimalDomestico implements CriaAsas {

	private int asas;
	private int senha;
	
	@Override
	public int getAsas() {
		// TODO Auto-generated method stub
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
