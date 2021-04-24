import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qtdMin = 1000000;
		String linha = scan.nextLine().replaceAll("[^!uoyevlI]", "");
		
		int length = linha.length();
		
		String[] caracteresNecessarios = {"!", "u", "o", "y", "e", "v", "l", "I"};
		
		for(String c : caracteresNecessarios){
			linha = linha.replaceAll("[" + c + "]", "");
			int newLength = linha.length();
			int qtd = length - newLength;
			
			if(c.equals("o")){
				qtd /= 2;
			}
			if(qtd < qtdMin){
				qtdMin = qtd;
			}
			if(qtd == 0) break;
			
			length = newLength;
		}
		System.out.println(qtdMin);
	}
}