
public class Fatorial {

	public static void main(String[] args) {

		      int fatorial = 1; 
		      for (int i = 1; i <= 10; i++) { 
		               fatorial *= i;
		               System.out.println("Fatorial de "+i+ " = " +fatorial); 
		       } 
		    } 
}

// Solucução do professor*
//public class DesafioFatorial {
//
//    public static void main(String[] args) {
//
//            int  fatorial = 1;
//            for (int n = 1; n < 11; n++) {
//                fatorial = fatorial * n;
//                System.out.println("Fatorial de " + n + " = " + fatorial);
//            }
//        }
//}

//*****************Minha tentativa
//for (int numero = 1; numero <= 10; numero++) {
//	for (int indice = 1; indice < 10; indice++) {
//		if (indice < numero) {
//			break;
//		}
//		System.out.println("Numero: " + numero * numero);
//		System.out.println("Indice: " + indice + 1);
//	}
//	System.out.println();
//}
