package sampa_videos;

public class UtilizaMetodos {

	public static void main(String[] args) {

		Carteira carteiraSampaio = new Carteira();

		Carteira carteiraTamis = new Carteira();

		carteiraSampaio.quantidadeFilmes = 700;

		carteiraTamis.quantidadeFilmes = 1000;

		System.out.println("Carteira Atual Sampaio ==> " + carteiraSampaio.quantidadeFilmes);

		System.out.println("Carteira Atual Tamis==> " + carteiraTamis.quantidadeFilmes);

		carteiraSampaio.retira(100);

		System.out.println("Carteira Sampaio após retirada ==> " + carteiraSampaio.quantidadeFilmes);
		
		carteiraTamis.movimenta(50, carteiraSampaio);
		
		System.out.println("Carteira Sampaio após receber vídeos da Tamis ==> " + carteiraSampaio.quantidadeFilmes);
		
		System.out.println("Carteira Tamis após transferir vídeos para o Sampaio ==> " + carteiraTamis.quantidadeFilmes);
		
	}

}
