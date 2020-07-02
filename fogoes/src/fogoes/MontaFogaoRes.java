package fogoes;

public class MontaFogaoRes {

	public static void main(String[] args) {

		FogaoResidencial fogao_res = new FogaoResidencial();

		fogao_res.setBoca(4);
		fogao_res.setGrade_boca(4);
		fogao_res.setBotao(5);
		fogao_res.setTubo_gas(1);
		fogao_res.setForno(1);
		fogao_res.setGrelha(2);
		fogao_res.setTampa_vidro(1);
		fogao_res.setTomada(1);
		fogao_res.setBotao_eletrico(1);
		fogao_res.setVelas(5);
//		fogao_res.setValor(1000);

		System.out.println("==========>>> Fogão Residencial <<<==========");
		System.out.println("Bocas          ==> " + fogao_res.getBoca());
		System.out.println("Grades         ==> " + fogao_res.getGrade_boca());
		System.out.println("Botões         ==> " + fogao_res.getBotao());
		System.out.println("Tubo de Gás    ==> " + fogao_res.getTubo_gas());
		System.out.println("Forno          ==> " + fogao_res.getForno());
		System.out.println("Grelha         ==> " + fogao_res.getGrelha());
		System.out.println("Tampa de Vidro ==> " + fogao_res.getTampa_vidro());
		System.out.println("Tomada         ==> " + fogao_res.getTomada());
		System.out.println("Botao Elétrico ==> " + fogao_res.getBotao_eletrico());
		System.out.println("Velas          ==> " + fogao_res.getVelas());
		System.out.println("Valor          ==> " + fogao_res.getValor());

	}

}