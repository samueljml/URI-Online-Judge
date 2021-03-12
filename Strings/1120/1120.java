import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String digitoComProblema = scan.next();
			String numero = scan.next();
			
			if(digitoComProblema.equals("0") && numero.equals("0")) break;
			
			numero = numero.replace(digitoComProblema, "");
			
			if(numero.length() == 0) System.out.println(0);
			else System.out.println(new BigInteger(numero));
		}
	}
}