import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		short casosDeTeste = scan.nextShort();
		
		while(casosDeTeste-- > 0) {
			
			Fruta.addValor(scan.nextFloat());
			scan.next();
			Fruta.addFrutas(scan.nextLine());
		}
		
		Fruta.apresentarResumo();
		scan.close();
	}
	
	public static class Fruta {
		private static List<Integer> quilogramasPorDia = new ArrayList<Integer>();
		private static float totalValorGasto = 0;
		
		public static void addValor(float valorDaFruta) {
			totalValorGasto += valorDaFruta;
		}
		public static void addFrutas(String frutas) {
			
			int spaceCount = 0;
			for (char c : frutas.toCharArray()) {
			    if (c == ' ') {
			         spaceCount++;
			    }
			}
			quilogramasPorDia.add(spaceCount + 1);
		}
		public static void apresentarResumo() {
			float mediaQuilogramasPorDia = 0;
			
			for (short i=0; i<quilogramasPorDia.size(); i++) {
				mediaQuilogramasPorDia += quilogramasPorDia.get(i);
				System.out.printf("day %d: %d kg\n", i+1, quilogramasPorDia.get(i));
				//System.out.println("day " + (i+1) + ": " + quilogramasPorDia.get(i) + " kg");
			}
			mediaQuilogramasPorDia /= quilogramasPorDia.size();
			
			System.out.printf("%.2f kg by day\n", mediaQuilogramasPorDia);
			System.out.printf("R$ %.2f by day\n", totalValorGasto/quilogramasPorDia.size());
		}
	}
}