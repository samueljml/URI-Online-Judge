import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdTestes = scan.nextInt();
		
		while(qtdTestes-- > 0) {
			StringBuilder cartasNecessarias = new StringBuilder("QJKA");
			char[] cartas = scan.next().toCharArray();
			
			for(int i=0; i<cartas.length; i++) {
				for(int j=0; j<cartasNecessarias.length(); j++) {
					if(cartasNecessarias.charAt(j) == cartas[i]) {
						cartasNecessarias.deleteCharAt(j);
					}
				}
				if(cartas.length == 0) break;
			}
			
			if(cartasNecessarias.length() == 0) System.out.println("Aaah muleke");
			else System.out.println("Ooo raca viu");
		}
		scan.close();
	}
}