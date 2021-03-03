import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		char[] n1, n2;

		while (true) {
			n1 = scan.next().toCharArray();
			n2 = scan.next().toCharArray();

			if (n1[0] == '0' && n2[0] == '0')
				break;

			int resultado = carryOperations(n1, n2);
			
			if(resultado == 0) System.out.println("No carry operation.");
			else if(resultado == 1) System.out.println(resultado + " carry operation.");
			else System.out.println(resultado + " carry operations.");
		}
	}

	public static int carryOperations(char[] n1, char[] n2) {
		int carry = 0;
		int tam;
		int aux = 0;

		if (n1.length > n2.length)
			tam = n1.length;
		else
			tam = n2.length;

		for (int i = 0; i < tam; i++) {
			aux += getValue(n1, i) + getValue(n2, i);

			aux /= 10;
			if(aux == 1) carry++;
		}

		return carry;
	}

	public static int getValue(char[] n, int index) {
		int pos = n.length - 1 - index;
		if (pos < 0)
			return 0;
		else
			return n[pos] - 48;
	}
}