package fogoes;

public class ObterValorTotal {

	public static void main(String[] args) {

		FogaoResidencial fogao_res = new FogaoResidencial();

		fogao_res.setValor(700);

		FogaoIndustrial fogao_ind = new FogaoIndustrial();

		fogao_ind.setValor(3500);

		FogaoCamp fogao_camp = new FogaoCamp();

		fogao_camp.setValor(250);

		ValorTotal controle = new ValorTotal();

		controle.registra(fogao_res);
		controle.registra(fogao_ind);
		controle.registra(fogao_camp);

		System.out.println("Fog�o Resid�ncial custa ==> " + fogao_res.getValor());
		System.out.println();
		System.out.println("Fog�o Industrial  custa ==> " + fogao_ind.getValor());
		System.out.println();
		System.out.println("Fog�o de Camping  custa ==> " + fogao_camp.getValor());
		System.out.println();
		System.out.println("O valor total dos tr�s fog�es � ==> " + controle.getTot());

	}
}
