
public class TestaGetESet {

	public static void main(String[] args) {

		Conta conta = new Conta(1970,1999);

		// Não posso acessar diretamente, preciso de um método, pois o atributo numero
		// da conta é privado
		// conta.numero = 1337;
//		conta.setNumero(1719);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Sampaio, Sandro");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		Cliente titularDaConta = conta.getTitular();
		
		conta.getTitular().setProfissao("Analista");
		
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		
	}

}
