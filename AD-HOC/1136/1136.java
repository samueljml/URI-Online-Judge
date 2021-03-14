import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			int qtdBolas = scan.nextInt();
			int[] lista = new int[qtdBolas];
			int[] diferencaAbosoluta = new int[n + 1];

			if (n == 0 && qtdBolas == 0)
				break;

			for (int i = 0; i < qtdBolas; i++) {
				lista[i] = scan.nextInt();
			}

			getDiferencaAbsoluta(diferencaAbosoluta, lista);

			int total = getTotalNumeroAnunciados(diferencaAbosoluta);

			if (total == n)
				System.out.println("Y");
			else
				System.out.println("N");
		}
	}

	private static int getTotalNumeroAnunciados(int[] diferencaAbosoluta) {
		int total = 0;
		for (int i = 1; i < diferencaAbosoluta.length; i++) {
			if (diferencaAbosoluta[i] == i) {
				total++;
			}
		}
		return total;
	}

	private static void getDiferencaAbsoluta(int[] diferencaAbosoluta, int[] lista) {
		int diferenca;
		for (int initialIndex = 0; initialIndex < lista.length; initialIndex++) {

			for (int i = initialIndex + 1; i < lista.length; i++) {

				diferenca = Math.abs(lista[initialIndex] - lista[i]);
				diferencaAbosoluta[diferenca] = diferenca;
			}
		}
	}
}