
public class TestaSomatoria {

	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while (contador <= 10) {
			System.out.println("Valor do contador: " + contador);
//			total = total + contador;
			total += contador;
			
			System.out.println("Valor do total: " + total);

			contador++;
		}
		System.out.println("Valor Final: " + total);
	}
	
}
