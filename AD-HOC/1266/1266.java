import java.util.Scanner;

public class Main {
	
	static int qtdEspacosVazios = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int qtdPostes = scan.nextInt();
			
			if(qtdPostes == 0) break;
			
			int[] postes = new int[qtdPostes];
			qtdEspacosVazios = 0;
			int totalPostesNecessarios = 0;
			

			for(int i=0; i<qtdPostes; i++) {
				postes[i] = scan.nextInt();
			}
			
			int indexPrimeiroPoste = getPrimeiroPoste(postes);
			
			if(indexPrimeiroPoste == qtdPostes+1) {
				totalPostesNecessarios += postes.length/2;
				if(postes.length%2 == 1) {
					totalPostesNecessarios++;
				}
			}
			else {
				totalPostesNecessarios += getQtdPostesNecessarios(postes, indexPrimeiroPoste+1, qtdPostes);
				totalPostesNecessarios += getQtdPostesNecessarios(postes, 0, indexPrimeiroPoste+1);
			}
			
			System.out.println(totalPostesNecessarios);
		}
	}

	private static int getQtdPostesNecessarios(int[] postes, int start, int end) {
		int postesNecessarios = 0;
		
		for(int i=start; i<end; i++) {
			if(postes[i] == 1) {
				if(qtdEspacosVazios > 1) {
					postesNecessarios += qtdEspacosVazios/2;
				}
				qtdEspacosVazios = 0;
				continue;
			}
			qtdEspacosVazios++;
		}
		return postesNecessarios;
	}

	private static int getPrimeiroPoste(int[] postes) {
		for(int i=0; i<postes.length; i++) {
			if(postes[i] == 1) {
				return i;
			}
		}
		return postes.length+1;
	}
}