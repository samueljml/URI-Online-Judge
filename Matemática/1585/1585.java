import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		short casosDeTeste = scan.nextShort();
		
		while(casosDeTeste-- > 0) System.out.printf("%d cm2\n", (scan.nextByte() * scan.nextByte()) / 2);
	}
}