
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");
		int idade = 18;
		int quantidadePessoas = 3;

		boolean acompanhando = quantidadePessoas >= 2; // true;

		System.out.println("Valor de acompanhado = " + acompanhando);

		if (idade >= 18 && acompanhando) {
			System.out.println("Você é maior que 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
