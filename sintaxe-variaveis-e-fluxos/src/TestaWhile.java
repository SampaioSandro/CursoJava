
public class TestaWhile {

	public static void main(String[] args) {

		int contador = 0;
		while (contador <= 10) {
			System.out.println("Valor do contador: " + contador);
//			contador = contador + 1;
//			contador +=1;
			contador++;
		}
		System.out.println("Valor do contador Fora do while: " + contador);
	}

}
