package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoPaulo    = new Conta();
		
		contaDoPaulo.saldo = 100.5;
		
		contaDoPaulo.deposita(50.5);

		System.out.println(contaDoPaulo.saldo);
		contaDoPaulo.saca(20);
		
		System.out.println("Saldo Final ==> " + contaDoPaulo.saldo);
		
		Conta contaDaMarcelle = new Conta();

		contaDaMarcelle.deposita(1001);
		
//		contaDaMarcelle.transfere(300, contaDoPaulo);
		
		if (contaDaMarcelle.transfere(300, contaDoPaulo)) {
			System.out.println("Saldo suficiente ");
		} else {
			System.out.println("Saldo insuficiente ");
		}
		
		System.out.println("Saldo da Conta Marcelle: " + contaDaMarcelle.saldo);
		System.out.println("Saldo da Conta Paulo: " + contaDoPaulo.saldo);
	}

}
