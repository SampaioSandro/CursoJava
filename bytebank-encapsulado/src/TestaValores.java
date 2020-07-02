
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1970, 1999);
		
		Conta conta2 = new Conta(118, 1969);
		
		Conta conta3 = new Conta(0237, 4719);
		
		//Conta esta inconsistência de acordo com a regra de negócio, pois esta permitindo criar uma agência com valor zero
//		conta.setAgencia(-50);
//		conta.setNumero(-350);
		
		System.out.println("O total de contas é: " + Conta.getTotal());

	}

}
