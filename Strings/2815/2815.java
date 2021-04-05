import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String[] palavras = scan.nextLine().split(" ");
		String saida = "";
		
		for (String palavra : palavras) {
			
			if (palavra.length() > 3) {
				if (palavra.charAt(0) == palavra.charAt(2) && palavra.charAt(1) == palavra.charAt(3)) {
					palavra = palavra.substring(2);
				}
			}
			
			saida += palavra + " ";
		}
		
		saida = saida.substring(0, saida.length() - 1);
		System.out.println(saida);
	}
}
