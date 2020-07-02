
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		
		g1.setNome("Pereira, Donizete");
        g1.setCpf("888.777.666-99");
        g1.setSalario(7000.00);
        
        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        
        g1.setSenha(335577);
	
       boolean autenticou = g1.autentica(335577);
       
       System.out.println ("Autenticação: " + autenticou);
       
       System.out.println(g1.getBonificacao());


	
	}

}
