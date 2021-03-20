import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tamanhoLista = scan.nextInt();
		int [] lista = new int [tamanhoLista-1];
		int numeroAusente;
		
		for(int i=0; i<tamanhoLista-1; i++) {
			lista[i] = scan.nextInt();
		}
		Arrays.sort(lista);
		
		for(numeroAusente=1; numeroAusente<tamanhoLista; numeroAusente++) {
			if(lista[numeroAusente-1] != numeroAusente) break;
		}
		
		System.out.println(numeroAusente);
	}
}