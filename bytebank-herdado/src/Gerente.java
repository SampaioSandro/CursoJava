//Gerente eh um funcion�rio, Gerente herda da classe do funcionario
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getBonificacao() {
//		return 	super.getBonificacao() + super.salario;  //super referencia a um m�todo da classe m�e
//		return super.getBonificacao() + super.getSalario();
		System.out.println("Chamando o m�todo de bonifica��o do Gerente");
		return super.getBonificacao();
	}

}
