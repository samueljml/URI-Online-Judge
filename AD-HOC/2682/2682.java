import java.util.Locale;
import java.util.Scanner;
 
public class Main {
	
    public static void main(String[] args){
 
    	Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);	
        
        int valorAnterior = 0;
        int proximo = 0;
        boolean fimDeTeste = false;
        
        while(scan.hasNext()) {
        	int valor =  scan.nextInt();
        	
        	if(!fimDeTeste) {
        		if(valor < valorAnterior) {
        			proximo = valorAnterior+1;
        			fimDeTeste = true;
        		}
        		valorAnterior = valor;
        	}
        }
        
        if(!fimDeTeste) {
        	proximo = valorAnterior+1;
        }
        
        System.out.println(proximo);
    }
}