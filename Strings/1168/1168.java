import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int qtdTestes = Integer.parseInt(scan.nextLine());
		byte[] ledsNecessarios = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

		while (qtdTestes-- > 0) {
			char[] numeros = scan.next().toCharArray();
			int total = 0;
			
			for (int numero : numeros) total += ledsNecessarios[numero-48];
			System.out.println(total + " leds");
		}
	}
}