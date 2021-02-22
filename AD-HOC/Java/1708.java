import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		int pilotoMaisRapido = scan.nextInt();
		int pilotoMaisLento = scan.nextInt();
		
		System.out.println(calcularEmQueVoltaExistiraRetardatario(pilotoMaisRapido, pilotoMaisLento));
	}
	
	public static int calcularEmQueVoltaExistiraRetardatario (int maisRapido, int maisLento) {
		int voltas = 1;
		while(true) {
			
			if(maisRapido * (voltas + 1) <= maisLento * voltas) return voltas + 1;
			voltas++;
		}
	}
}