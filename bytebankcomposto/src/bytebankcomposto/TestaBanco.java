package bytebankcomposto;

public class TestaBanco {

	public static void main(String[] args) {

		Cliente paulo = new Cliente();

		paulo.nome = "Paulo Silveira";
		paulo.cpf = "091.295.178-85";
		paulo.profissao = "analista de testes";

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
//		Associa o cliente Paulo à conta contaDoPaulo
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);

	}

}
