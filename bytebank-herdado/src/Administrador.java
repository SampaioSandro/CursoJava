//Gerente eh um funcion�rio, Gerente herda da classe do funcionario
public class Administrador extends Funcionario implements Autenticavel {

	private int senha;

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Administrador");
		return 51;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
