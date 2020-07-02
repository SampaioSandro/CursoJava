package fogoes;

public class ValorTotal {

	private double tot;

	public void registra(FogaoResidencial fogao_res) {

		double valores = fogao_res.getValor();
		this.tot = this.tot + valores;
	}

	public double getTot() {
		return tot;
	}

}
