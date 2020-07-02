package sampa_videos;

public class Carteira {

	int quantidadeFilmes;
	int filial;
	int idCadastro;
	String nome;

	public boolean retira(int qtde) {
		if (this.quantidadeFilmes >= qtde) {
			this.quantidadeFilmes -= qtde;
			return true;
		} else {
			return false;
		}
	}

	public boolean movimenta(int qtde, Carteira destino) {
		if (this.quantidadeFilmes >= qtde) {
			this.quantidadeFilmes -= qtde;
			destino.quantidadeFilmes += qtde;
			return true;
		} else {
			return false;
		}
	}
}