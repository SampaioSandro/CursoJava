package animal;

public class Voar {

	private int senha = 1719;

	public void autentica(CriaAsas voa) {
		boolean autenticou = voa.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode Voar");
		} else {
			System.out.println("N�o pode Voar");
		}
	}

}
