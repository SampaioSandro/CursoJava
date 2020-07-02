
public class TesteReferencias {

	public static void main(String[] args) {

		Funcionario g1 = new Gerente();
		g1.setNome("Anannias");
		g1.setSalario(5000);
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Valdenia");
		f1.setSalario(3000);
		
		Funcionario e1 = new EditorVideo();
		e1.setNome("Valdenice");
		e1.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(e1);
		

		System.out.println("Nome do Gerente                ==> " + g1.getNome());
		System.out.println("Salário do Gerente             ==> " + g1.getSalario());
		System.out.println("Bonificação do Gerente         ==> " + g1.getBonificacao());
		System.out.println();
		System.out.println("Nome do Funcionário            ==> " + f1.getNome());
		System.out.println("Salário do Funcionário         ==> " + f1.getSalario());
		System.out.println("Bonificação do Funcionário     ==> " + f1.getBonificacao());
		System.out.println();	
		System.out.println("Nome do Editor de Video        ==> " + e1.getNome());
		System.out.println("Salário do Editor de Video     ==> " + e1.getSalario());
		System.out.println("Bonificação do Editor de Video ==> " + e1.getBonificacao());
		
		
		
		System.out.println(controle.getSoma());
		
		
		
		
	}
}
