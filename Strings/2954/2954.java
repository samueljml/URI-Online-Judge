import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quantidadeFrases = Integer.parseInt(scan.nextLine());

		while (quantidadeFrases-- > 0) {
			String frase = scan.nextLine();
			String fraseSemCaracteresEspeciais = frase.replaceAll("[^A-Za-z]", " ").toLowerCase();
			String[] palavras = fraseSemCaracteresEspeciais.split(" ");
			int calculoDeLetras = 0;
			int maior = 0;

			for (String palavra : palavras) {
				calculoDeLetras += palavra.length();
				if (palavra.equals("jogo") || palavra.equals("perdi")) {

					if (calculoDeLetras > maior) {
						maior = calculoDeLetras;
					}
					calculoDeLetras = 0;
				}
			}
			System.out.println(maior);
		}
	}
}