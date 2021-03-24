import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdSoldados = scan.nextInt();
		int[] soldados1 = new int [qtdSoldados];
		int[] soldados2 = new int [qtdSoldados];	
		int numeroMaximoDeBatalhasVencidas = 0;
		
		lerSoldadosOrdenados(scan, soldados1, qtdSoldados);
		lerSoldadosOrdenados(scan, soldados2, qtdSoldados);
		
		for(int i=0, j=0; i<qtdSoldados; i++) {
			if(soldados1[j] < soldados2[i]) {
				j++;
				numeroMaximoDeBatalhasVencidas++;
			}
		}
		System.out.println(numeroMaximoDeBatalhasVencidas);
	}
	
	public static void lerSoldadosOrdenados(Scanner scan, int[] soldados, int qtdSoldados) {
		for(int i=0; i<qtdSoldados; i++) {
			soldados[i] = scan.nextInt();
		}
		Arrays.sort(soldados);
	}
}