//Gerente eh um funcionário, Gerente herda da classe do funcionario
public class EditorVideo extends Funcionario {

		public double getBonificacao() {
		return super.getBonificacao() + +100;
	}

}
