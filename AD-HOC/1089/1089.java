import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numeroDeAmostras;
		
		while(true) {
		    
		    numeroDeAmostras = scan.nextInt();
		
    		if(numeroDeAmostras == 0) return;
    		
    		List<Integer> listaDeAmostras = LoopMusical.getListaDeAmostras(numeroDeAmostras, scan);
    		
    		System.out.println(LoopMusical.getNumeroDePicos(listaDeAmostras));
		}
	}
	
	public static class LoopMusical {
	    
	    private enum Direcoes {
	        subindo,
	        descendo
	    };
	    private static Direcoes direcao;
	    
	    public static List<Integer> getListaDeAmostras (int numeroDeAmostras, Scanner scan) {
	    
    	    List<Integer> listaDeAmostras = new ArrayList();
    	    
    	    while(numeroDeAmostras-- > 0) {
        	    listaDeAmostras.add(scan.nextInt());
        	}
        	return listaDeAmostras;
	    }
	    
	    public static int getNumeroDePicos (List<Integer> lista) {
	        
	        Iterator<Integer> it = lista.iterator();
	        int totalPicos = 0;
	        int anterior;
	        int atual = it.next();
	        
	        Direcoes ultimaDirecao = (lista.get(lista.size()-1) < atual) ? Direcoes.subindo : Direcoes.descendo;
	        direcao = ultimaDirecao; 
	        
	        while (it.hasNext()) {
	            anterior = atual;
	            atual = it.next();
	            
	            if(mudouDirecao(anterior, atual, direcao)) {
	                totalPicos++;
	                direcao = getNovaDirecao(direcao);
	            }
	        }
	        
	        if(direcao != ultimaDirecao) totalPicos++;
	        
	        return totalPicos;
	    }
	    
	    public static boolean mudouDirecao (int anterior, int atual, Direcoes direcao) {
	        
	        if(direcao == Direcoes.subindo && anterior > atual) {
	            return true;	       
	        }
	        else if(direcao == Direcoes.descendo && anterior < atual) {
	            return true;
	        }
	        return false;
	    }
	    
	    public static Direcoes getNovaDirecao (Direcoes direcao) {
	        
	        if(direcao == Direcoes.subindo) {
	            return Direcoes.descendo;	       
	        }
	        return Direcoes.subindo;
	    }
	}

}