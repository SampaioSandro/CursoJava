

public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new Conta(1970, 1999);
		
		conta.deposita(201);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		
		System.out.println(conta.getAgencia());
		System.out.println("O total de contas é: " + conta.getTotal());

	}

}
