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

		System.out.println("Carteira Sampaio ap�s retirada ==> " + carteiraSampaio.quantidadeFilmes);
		
		carteiraTamis.movimenta(50, carteiraSampaio);
		
		System.out.println("Carteira Sampaio ap�s receber v�deos da Tamis ==> " + carteiraSampaio.quantidadeFilmes);
		
		System.out.println("Carteira Tamis ap�s transferir v�deos para o Sampaio ==> " + carteiraTamis.quantidadeFilmes);
		
	}

}
