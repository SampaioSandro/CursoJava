package animal;

public class GeraGato {

	public static void main(String[] args) {

		Gato gato = new Gato();

		gato.setAlimenta("mastigando");
		gato.setComunica("miando");
		gato.setLocomove("correndo");
		gato.setMembros(4);
		gato.setComporta("carinhando");
		
		System.out.println("Gato se alimenta " + gato.getAlimenta());
		System.out.println("Gato se comunica " + gato.getComunica());
		System.out.println("Gato se locomove " + gato.getLocomove());
		System.out.println("Gato possui "      + gato.getMembros() + " membros");
		System.out.println("Gato se comporta " + gato.getComporta());
		
	}

}
