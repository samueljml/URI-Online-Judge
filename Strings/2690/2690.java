import java.util.Scanner;
 
public class Main {
	
	static int total = 0;
 
    public static void main(String[] args){
 
        Scanner scan = new Scanner(System.in);	
        int qtdSenhas = Integer.parseInt(scan.nextLine());
        
        while(qtdSenhas-- > 0) {
        	String linha = scan.nextLine().replaceAll(" ", "");
        	
        	linha = linha.replaceAll("[akuGQ]", "0");
        	linha = linha.replaceAll("[blvIS]", "1");
        	linha = linha.replaceAll("[cmwEOY]", "2");
        	linha = linha.replaceAll("[dnxFPZ]", "3");
        	linha = linha.replaceAll("[eoyJT]", "4");
        	linha = linha.replaceAll("[fpzDNX]", "5");
        	linha = linha.replaceAll("[gqAKU]", "6");
        	linha = linha.replaceAll("[hrCMW]", "7");
        	linha = linha.replaceAll("[isBLV]", "8");
        	linha = linha.replaceAll("[jtHR]", "9");
        	
        	System.out.println(linha.length());
        	if(linha.length() > 13) {
        		linha = linha.substring(0, 12);
        	}
        	
        	System.out.println(linha);
        }
    }
}