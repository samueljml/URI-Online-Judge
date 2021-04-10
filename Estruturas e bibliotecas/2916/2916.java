import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int qtdNotas = scan.nextInt();
			int[] notas = new int[qtdNotas];
			int k = scan.nextInt();
			long SomaDasKnotas = 0;
			
			for(int i=0; i<qtdNotas; i++) {
				notas[i] = scan.nextInt();
			}
			Arrays.sort(notas);
			
			for(int i=notas.length-1; i>= notas.length-k; i--) {
				SomaDasKnotas += notas[i];
			}
			System.out.println(SomaDasKnotas%1000000007);
		}
	}
}