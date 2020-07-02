//Gerente eh um funcionário, Gerente herda da classe do funcionario
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
//		return 	super.getBonificacao() + super.salario;  //super referencia a um método da classe mãe
//		return super.getBonificacao() + super.getSalario();
		System.out.println("Chamando o método de bonificação do Gerente");
		return super.getBonificacao();
	}

}
