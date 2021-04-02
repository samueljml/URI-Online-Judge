import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdPalavrasIrregulares = scan.nextInt();
		int qtdPalavras = scan.nextInt();
		HashMap<String, String> palavrasIrregulares = new HashMap<>();

		for (int i = 0; i < qtdPalavrasIrregulares; i++) {
			palavrasIrregulares.put(scan.next(), scan.next());
		}

		for (int i = 0; i < qtdPalavras; i++) {
			String palavra = scan.next();
			char ultimaLetra = palavra.charAt(palavra.length() - 1);
			char penultimaLetra = ' ';
			
			if(palavra.length() > 1) {
				penultimaLetra = palavra.charAt(palavra.length() - 2);
			}
			
			if (palavrasIrregulares.containsKey(palavra)) {
				palavra = palavrasIrregulares.get(palavra);
			}
			else if (!isVogal(penultimaLetra) && ultimaLetra == 'y') {
				palavra = palavra.substring(0, palavra.length() - 1) + "ies";
			}
			else if (ultimaLetra == 'o' || ultimaLetra == 's' || ultimaLetra == 'x'
					|| penultimaLetra == 'c' && ultimaLetra == 'h' || penultimaLetra == 's' && ultimaLetra == 'h') {
				palavra += "es";
			}
			else {
				palavra += "s";
			}
			
			System.out.println(palavra);
		}
	}

	public static boolean isVogal(char c) {
		int[] vogais = { 97, 101, 105, 111, 117 };
		for (int i = 0; i < vogais.length; i++) {
			if (vogais[i] == c)
				return true;
		}
		return false;
	}
}