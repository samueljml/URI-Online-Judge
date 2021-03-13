import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("#0.00");
		Scanner scan = new Scanner(System.in);
		final double pi = 3.14;

		while(scan.hasNext()) {
			double volume = scan.nextDouble();
			double raio = scan.nextDouble()/2;
			double area = pi * (raio*raio);
			double altura = volume/area;
			
			System.out.println("ALTURA = " + df.format(altura));
			System.out.println("AREA = " + df.format(area));
		}
	}
}