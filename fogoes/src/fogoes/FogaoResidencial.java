package fogoes;

public class FogaoResidencial {

	private int boca;
	private int grade_boca;
	private int botao;
	private int tubo_gas;
	private int forno;
	private int grelha;
	private static int tampa_vidro;
	private static int tomada;
	private static int botao_eletrico;
	private static int velas;
	private double valor;

	public int getBoca() {
		return boca;
	}

	public void setBoca(int boca) {
		this.boca = boca;
	}

	public int getGrade_boca() {
		return grade_boca;
	}

	public void setGrade_boca(int grade_boca) {
		this.grade_boca = grade_boca;
	}

	public int getBotao() {
		return botao;
	}

	public void setBotao(int botao) {
		this.botao = botao;
	}

	public int getTubo_gas() {
		return tubo_gas;
	}

	public void setTubo_gas(int tubo_gas) {
		this.tubo_gas = tubo_gas;
	}

	public int getGrelha() {
		return grelha;
	}

	public void setGrelha(int grelha) {
		this.grelha = grelha;
	}

	public int getForno() {
		return forno;
	}

	public void setForno(int forno) {
		this.forno = forno;
	}

	public void setTampa_vidro(int tampa_vidro) {
		FogaoResidencial.tampa_vidro = tampa_vidro;
	}

	public int getTampa_vidro() {
		return tampa_vidro;
	}

	public int getTomada() {
		return tomada;
	}

	public void setTomada(int tomada) {
		FogaoResidencial.tomada = tomada;
	}

	public int getBotao_eletrico() {
		return botao_eletrico;
	}

	public void setBotao_eletrico(int botao_eletrico) {
		FogaoResidencial.botao_eletrico = botao_eletrico;
	}

	public int getVelas() {
		return velas;
	}

	public void setVelas(int velas) {
		FogaoResidencial.velas = velas;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return this.valor * 1.3;
	}

}