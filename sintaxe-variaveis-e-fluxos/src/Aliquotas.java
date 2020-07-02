
public class Aliquotas {

	public static void main(String[] args) {

		double salario = 3900.00;

		if (salario > 1900.00 && salario < 2800.00) {
			System.out.println("Você pode deduzir na declaração o valor de R$ 142");
		} else {
			if (salario > 2800.00 && salario < 3751.00) {
				System.out.println("Você pode deduzir na declaração o valor de R$ 350");
			} else {
				System.out.println("Você pode deduzir na declaração o valor de R$ 636");
			}
		}
	}
}