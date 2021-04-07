import java.util.Scanner;
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int qtdPalavras = scan.nextInt();
		int qtdDescricoes = scan.nextInt();
		int total = 0;
		HashMap<String, Integer> dicionario = new HashMap<>();
		
		for(int i=0; i<qtdPalavras; i++) {
		    dicionario.put(scan.next(), scan.nextInt());
		}

		for(int i=0; i<qtdDescricoes; i++) {
		    while(true) {
		        String palavra = scan.next();
    		   
    		    if(palavra.equals(".")) break;
    		    
    		    if(dicionario.containsKey(palavra)) {
    		        total += dicionario.get(palavra);
    		    }
		    }
		    System.out.println(total);
		    total = 0;
		}
	}
}