package animal;

public class GeraPassaroPreto {

	public static void main(String[] args) {

		PassaroPreto preto = new PassaroPreto();

		preto.setAlimenta("bicando");
		preto.setComunica("cantando");
		preto.setLocomove("andando");
		preto.setMembros(2);
		preto.setAsas(2);
		preto.setSenha(1719);
		
		boolean autenticou = preto.autentica(1719);
		System.out.println("preto se alimenta " + preto.getAlimenta());
		System.out.println("preto se comunica " + preto.getComunica());
		System.out.println("preto se locomove " + preto.getLocomove());
		System.out.println("preto possui "      + preto.getMembros() + " membros");
		System.out.println("preto possui "      + preto.getAsas()    + " asas");
		System.out.println("preto pode voar " 	+ autenticou);
	}

}