import java.util.Scanner;
 
public class Main {
	
    public static void main(String[] args){
 
        Scanner scan = new Scanner(System.in);	
        
        while(scan.hasNext()) {
        	int numero = scan.nextInt();
        	int max = (int) Math.sqrt(numero);
        	
        	if(podeSerRepresentado(numero,  max)) {
        		System.out.println("YES");
        	}
        	else {
        		System.out.println("NO");
        	}
        	
        }
    }
    public static boolean podeSerRepresentado(int numero, int max) {
    	for(int i=max; i>=0 ; i--) {
    		for(int j=0; j-1!=i; j++) {
    			int total = i*i + j*j;
    			if(total == numero) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
}