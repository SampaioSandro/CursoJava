package bytebankcomposto;

public class Conta {

//	public static void main(String[] args) {

	private double saldo;
	int agencia;
	int numero;
//	String titular;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
//			destino.saldo +=valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double pegaSaldo() {
		return this.saldo;
	}
}
