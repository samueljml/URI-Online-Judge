import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			char[]vogais = scan.nextLine().toCharArray();
			String frase = scan.nextLine();
			int totalVogais = 0;
			
			for(int i=0; i<vogais.length; i++) {
				int index = frase.indexOf(Character.toString(vogais[i]));
				while(index != -1) {
					
					totalVogais++;
					index = frase.indexOf(Character.toString(vogais[i]), index+1);
				}
			}
			System.out.println(totalVogais);
		}
	}
}