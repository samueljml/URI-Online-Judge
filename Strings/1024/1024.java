import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int qtdTestes = Integer.parseInt(scan.nextLine());

		while (qtdTestes-- > 0) {
			StringBuilder texto = new StringBuilder(scan.nextLine());

			primeiraPassada(texto);
			segundaPassada(texto);
			terceiraPassada(texto);
			
			System.out.println(texto);
		}
	}

	private static void primeiraPassada(StringBuilder texto) {
		for (int i = 0; i < texto.length(); i++) {
			char caractere = texto.charAt(i);

			if (caractere >= 65 && caractere <= 90 || caractere >= 97 && caractere <= 122) {
				caractere += 3;
				texto.setCharAt(i, caractere);
			}
		}
	}

	private static String segundaPassada(StringBuilder texto) {
		return texto.reverse().toString();
	}

	private static void terceiraPassada(StringBuilder texto) {
		for (int i = texto.length() / 2; i < texto.length(); i++) {
			char caractere = texto.charAt(i);
			caractere -= 1;
			texto.setCharAt(i, caractere);
		}
	}
}