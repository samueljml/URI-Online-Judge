import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdCelulas = scan.nextInt();
		int[] celulas = new int[qtdCelulas];
		int[] newCelulas = new int[qtdCelulas];
		
		for(int i=0; i<qtdCelulas; i++) {
			celulas[i] = scan.nextInt();
				
			if(celulas[i] == 1) {
				newCelulas[i]++;
				if(i>0) newCelulas[i-1]++;
				if(i<qtdCelulas-1) newCelulas[i+1]++;
			}
		}
		
		for(int i=0; i<qtdCelulas; i++) {
			System.out.println(newCelulas[i]);
		}
	}
}