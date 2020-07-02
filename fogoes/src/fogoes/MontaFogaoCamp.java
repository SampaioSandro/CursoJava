package fogoes;

public class MontaFogaoCamp {

	public static void main(String[] args) {

		FogaoCamp fogao_camp = new FogaoCamp();

		fogao_camp.setBoca(1);
		fogao_camp.setGrade_boca(1);
		fogao_camp.setBotao(1);
		fogao_camp.setTubo_gas(1);
//		fogao_camp.setValor(300);

		System.out.println("==========>>> Fogão de Camping <<<==========");
		System.out.println("Bocas          ==> " + fogao_camp.getBoca());
		System.out.println("Grades         ==> " + fogao_camp.getGrade_boca());
		System.out.println("Botões         ==> " + fogao_camp.getBotao());
		System.out.println("Tubo de Gás    ==> " + fogao_camp.getTubo_gas());
		System.out.println("Valor          ==> " + fogao_camp.getValor());
	}

}