import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean noFinal = true;
		
		while(scan.hasNext()) {
			char[] caracteres = scan.nextLine().toCharArray();
			StringBuilder texto = new StringBuilder();
			int index = 0;
			
			for(char caractere : caracteres) {
				if(caractere == '[') {
					noFinal = false;
					index = 0;
				}
				else if(caractere == ']') noFinal = true;
				else {
					if(noFinal) texto.append(caractere);
					else texto.insert(index++, caractere);
				}
			}
			if(texto.length() > 0) System.out.println(texto);
		}
	}
}