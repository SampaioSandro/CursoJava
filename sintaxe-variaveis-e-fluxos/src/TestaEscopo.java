
public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("Testando Escopo");

		int idade = 18;
		int quantidadePessoas = 3;

		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println(acompanhado);
	}
}
