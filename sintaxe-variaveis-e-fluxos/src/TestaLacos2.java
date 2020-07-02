
public class TestaLacos2 {

	public static void main(String[] args) {
		for (int linha = 0; linha <= 10; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {

//			for (int coluna = 0; coluna <= 10; coluna++) {  // mesmo resultado do FOR da linha 6
//				if (linha < coluna) {
//					break;
//				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
