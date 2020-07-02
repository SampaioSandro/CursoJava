package bytebankcomposto;

public class TestaContaSemCliente {

	public static void main(String[] args) {

		Conta contaDaMarcelle = new Conta();
		
		Conta contaDoPaulo = new Conta();
		
		System.out.println(contaDaMarcelle.pegaSaldo());
		
		contaDaMarcelle.titular = new Cliente();
		
		contaDaMarcelle.titular.nome = "Marcelle";
		
		
		System.out.println(contaDaMarcelle.titular.nome);
		System.out.println(contaDoPaulo.pegaSaldo());

	}

}
