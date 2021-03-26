import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			String frase = scan.nextLine();
			char[] vogais = {'a', 'e', 'i', 'o', 'u'};
			char[] simbolos = {'@','&', '!', '*', '#'};
			
			for(int i=0; i<5; i++) {
				frase = frase.replace(simbolos[i], vogais[i]);
			}
			System.out.println(frase);
		}
	}
}