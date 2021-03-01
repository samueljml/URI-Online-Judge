import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		char[] permutacao = scan.next().toCharArray();
		char[] textoCriptografado = scan.next().toCharArray();
		String textoOriginal = "";
		
		for(int i = 0; i<textoCriptografado.length; i++) {
			textoOriginal += permutacao[textoCriptografado[i] - 97];
		}

		System.out.println(textoOriginal);
		scan.close();
	}
}