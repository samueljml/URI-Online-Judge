import java.util.Scanner;
 
public class Main {
	
    public static void main(String[] args){
 
    	Scanner scan = new Scanner(System.in);
    	
    	int qtdPessoas = scan.nextInt();
    	int qtdMinPessoas = scan.nextInt();
    	
    	while(qtdPessoas-- > 0) {
    		int tempoDeAtraso = scan.nextInt();
    		
    		if(tempoDeAtraso <= 0) qtdMinPessoas--;
    	}
    	
    	if(qtdMinPessoas > 0) System.out.println("NO");
    	else System.out.println("YES");
    }
}