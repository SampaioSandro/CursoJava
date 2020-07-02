public class Conta {

//	public static void main(String[] args) {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // Esse atr�buto � da classe e n�o da instacia 

//************************ Construtor - Rotina de inicializa��o, ele � executado apenas uma vez ************

	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("O total de contas �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma ag�ncia: " + this.agencia);
		System.out.println("estou criando uma conta: " + this.numero);
	}

//*****************************************************************************************************************
	public void deposita(double valor) {
		if (valor <= 0) {
			System.out.println("valor invalido");
		}
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

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) { // nesse caso "numero" � apenas uma vari�vel tempor�ria
		if (numero <= 0) {
			System.out.println("n�o pode n�mero da conta menor ou igual a zero");
		} else {
			this.numero = numero;
		}

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("n�o pode n�meor da ag�ncia menor ou igual a zero");
		} else {
			this.agencia = agencia;
		}
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
