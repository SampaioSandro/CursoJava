package animal;

public class GeraPato {

	public static void main(String[] args) {

		Pato pato = new Pato();

		pato.setAlimenta("bicando");
		pato.setComunica("falando");
		pato.setLocomove("cantando");
		pato.setMembros(2);
		pato.setAsas(2);
		pato.setSenha(1719);
		
		boolean autenticou = pato.autentica(1717);
		
		
		System.out.println("pato se alimenta " + pato.getAlimenta());
		System.out.println("pato se comunica " + pato.getComunica());
		System.out.println("pato se locomove " + pato.getLocomove());
		System.out.println("pato possui "      + pato.getMembros() + " membros");
		System.out.println("pato possui "      + pato.getAsas()    + " asas");
		System.out.println("pato pode voar " 	+ autenticou);
	}

}
