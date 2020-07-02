package fogoes;

public class FogaoIndustrial extends FogaoResidencial {

	private static int bandeja;

	public void setBandeja(int bandeja) {
		FogaoIndustrial.bandeja = bandeja;
	}

	public int getBandeja() {
		return bandeja;
	}

	public double getValor() {
		return super.getValor() + 500;
	}

}
