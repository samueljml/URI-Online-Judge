import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int qtdPartidas = scan.nextInt();
			int golsParaComprar = scan.nextInt();
			int[] partida = new int[qtdPartidas];
			int total = 0;
			
			for(int i=0; i<qtdPartidas; i++) {
				partida[i] = scan.nextInt() - scan.nextInt();
			}
			Arrays.sort(partida);
			
			for(int i=qtdPartidas-1; i>-1; i--) {
				if(golsParaComprar == 0) break;
				while(partida[i] <= 0) {
					partida[i]++;
					if(--golsParaComprar == 0) {
						break;
					}
				}
			}
			
			for(int i=0; i<qtdPartidas; i++) {
				if(partida[i] > 0) total += 3;
				else if(partida [i] == 0) total++;
			}
			
			System.out.println(total);
		}
	}
}