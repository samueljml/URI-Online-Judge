import java.util.Scanner;
import java.util.LinkedList;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int regioes, i;
		
		while(true) {
		    
		    regioes = scan.nextInt();
		
    		if(regioes == 0) return;
    		
    		LinkedList<Integer> regiao = new LinkedList(); 
    		
    		for (i=0; i<regioes; i++) {
    		    regiao.add(i+1);
    		}
    		
    		for (i=1; ; i++) {
    		    if(validarSalto(i, (LinkedList) regiao.clone())) break;
    		}
    		
    		System.out.println(i);
		}
	}
	
	public static boolean validarSalto (int salto, LinkedList<Integer> regioes) {
	    
	   int index = 0;

	   while(regioes.size() > 1) {

	       if(regioes.remove(index) == 13) return false;
	       index += salto - 1;
	       if(index >= regioes.size()) index = (index%regioes.size());
	   } 
	    return true;
	} 
}