import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numeroDeBilhetesOriginais, numeroDePessoasPresentes;
		
		while(true) {
		    
		    numeroDeBilhetesOriginais = scan.nextInt();
		    numeroDePessoasPresentes = scan.nextInt();
		    
		    if(numeroDeBilhetesOriginais == 0 && numeroDePessoasPresentes == 0) return;
    		
    		int numeroDoBilhete;
    		List<Bilhete> bilhetes = new ArrayList();
    		
    		while (numeroDePessoasPresentes-- > 0){
    		    
    		    numeroDoBilhete = scan.nextInt();
    		    
    		    if(Bilhete.bilheteValido(bilhetes, numeroDoBilhete)) {
                    bilhetes.add(new Bilhete(numeroDoBilhete));
    		    }
    		    else {
    		        Bilhete.addNumeroDuplicado(numeroDoBilhete);
    		    }
    		}
    		
    		System.out.println(Bilhete.getNumeroDeBilhetesDuplicados());
    		Bilhete.limparNumerosDuplicados();
		}
	}
	
	public static class Bilhete {
	    private static Set<Integer> numerosDuplicados = new HashSet(); 
	    private int numero;
	    
	    public Bilhete (int numero) {
	        this.numero = numero;
	    }
	    public static int getNumeroDeBilhetesDuplicados(){
	        return numerosDuplicados.size();
	    }
	    public static void limparNumerosDuplicados(){
	        numerosDuplicados.clear();
	    }
	    public static boolean bilheteValido (List<Bilhete> lista, int numero) {
	        Iterator<Bilhete> it = lista.iterator();
	        
	        while(it.hasNext()) {
	            if(it.next().numero == numero) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void addNumeroDuplicado (int numero) {
	        numerosDuplicados.add(numero);
	    }
	}
}