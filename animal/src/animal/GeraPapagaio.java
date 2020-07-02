package animal;

public class GeraPapagaio {

	public static void main(String[] args) {

		Papagaio louro = new Papagaio();
//		Voar voa = new Voar();

		louro.setAlimenta("bicando");
		louro.setComunica("falando");
		louro.setLocomove("andando");
		louro.setMembros(2);
		louro.setCostume("gritar");
		louro.setAsas(2);
		louro.setSenha(1719);
		
		boolean autenticou = louro.autentica(1717);
				
		System.out.println("louro se alimenta " + louro.getAlimenta());
		System.out.println("louro se comunica " + louro.getComunica());
		System.out.println("louro se locomove " + louro.getLocomove());
		System.out.println("louro se possue " + louro.getMembros() + " membros");
		System.out.println("louro tem costume de " + louro.getCostume());
		System.out.println("louro possue " + louro.getAsas() + " asas");
		System.out.println("louro pode voar " + autenticou);
		


	}

}
