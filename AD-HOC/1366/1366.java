import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int qtdVaretas = scan.nextInt();
			int total = 0;
			int metades = 0;

			if (qtdVaretas == 0)
				break;

			while(qtdVaretas-- > 0) {
				scan.nextInt();
				int quantidade = scan.nextInt();

				total += quantidade / 4;
				quantidade %= 4;

				metades += quantidade / 2;
			}
			System.out.println((total + metades/2));
		}
		scan.close();
	}
}