import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
		    
		    String input = scan.nextLine();
    		String ordemTeclado = new String("`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./");
    		StringBuilder resultado = new StringBuilder();
    		
    		for(int i=0; i<input.length(); i++){
    		    char caractere = input.charAt(i);
    		    
    		    if(caractere == ' ') {
    		        resultado.append(caractere);
    		        continue;
    		    }
    		    
    		    int index;
    		    for(index=0; index<ordemTeclado.length(); index++){
        		    if(ordemTeclado.charAt(index) == caractere) break;
        		}
        		resultado.append(ordemTeclado.charAt(index-1));
    		}
    		System.out.println(resultado);
		}
	}
}