package fogoes;

public class MontaFogaoInd {

	public static void main(String[] args) {

		FogaoIndustrial fogao_ind = new FogaoIndustrial();

		fogao_ind.setBoca(6);
		fogao_ind.setGrade_boca(4);
		fogao_ind.setBotao(7);
		fogao_ind.setTubo_gas(1);
		fogao_ind.setForno(1);
		fogao_ind.setGrelha(1);
		fogao_ind.setBandeja(2);
//		fogao_ind.setValor(2000);
		
		

		System.out.println("==========>>> Fogão Industrial <<<==========");
		System.out.println("Bocas          ==> " + fogao_ind.getBoca());
		System.out.println("Grades         ==> " + fogao_ind.getGrade_boca());
		System.out.println("Botões         ==> " + fogao_ind.getBotao());
		System.out.println("Tubo de Gás    ==> " + fogao_ind.getTubo_gas());
		System.out.println("Forno          ==> " + fogao_ind.getForno());
		System.out.println("Grelha         ==> " + fogao_ind.getGrelha());
		System.out.println("Bandejas       ==> " + fogao_ind.getBandeja());
		System.out.println("Valor          ==> " + fogao_ind.getValor());
	}

}