import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int qtdNumeros = scan.nextInt();
			int total = 0;
			String[] numeros = new String[qtdNumeros];
			
			for(int i=0; i<qtdNumeros; i++) {
				numeros[i] = scan.next();
			}
			Arrays.sort(numeros);
			
			for(int i=1; i<qtdNumeros; i++) {
				char [] anterior = numeros[i].toCharArray();
				char [] atual = numeros[i-1].toCharArray();
				
				for(int j=0; j<anterior.length; j++) {
					if(anterior[j] == atual[j]) {
						total++;
					} else
						break;
				}
			}
			System.out.println(total);
		}
	}
}