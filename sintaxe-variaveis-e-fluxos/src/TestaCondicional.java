
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");
		int idade = 17;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Voc� � maior que 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem mais de 18, mais pode entrar, " 
						+ "pois esta acompanhado");
			} else {
				System.out.println("infelizmente voc� n�o pode entrar");
			}
		}

	}
}