package animal;

public abstract class AnimalDomestico {

	private String locomove;
	private String comunica;
	private String alimenta;
	private int membros;

	public String getLocomove() {
		return locomove;
	}

	public void setLocomove(String locomove) {
		this.locomove = locomove;
	}

	public String getComunica() {
		return comunica;
	}

	public void setComunica(String comunica) {
		this.comunica = comunica;
	}

	public String getAlimenta() {
		return alimenta;
	}

	public void setAlimenta(String alimenta) {
		this.alimenta = alimenta;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

}
