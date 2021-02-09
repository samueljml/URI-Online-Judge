import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main
{
    public static class Entrada implements Comparable<Entrada>{
        public int valor;
        public int frequencia;
        
        public Entrada (int valor) {
            this.valor = valor;
            this.frequencia = 1;
        }
        
        public boolean estaNaLista (List<Entrada> lista, int valor) {
            for(Entrada e: lista){
                if(e.valor == valor){
                    e.frequencia++;
                    return true;
                } 
            }
            return false;
        }
        
        @Override
        public int compareTo(Entrada e){
            if(this.valor < e.valor) return -1;
            else if (this.valor > e.valor) return +1;
            return 0;
        }
    }
    
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Entrada> entradas = new ArrayList();
		
		int quantidadeDeInput = scan.nextInt();
		
		while(quantidadeDeInput-- > 0){
		    
		    Entrada e = new Entrada(scan.nextInt());
		    
		    if(!e.estaNaLista(entradas, e.valor)){
		        entradas.add(e);
		    }
		}
		
		Collections.sort(entradas);
		
		entradas.forEach(e -> System.out.println(e.valor + " aparece " + e.frequencia + " vez(es)"));
	}
}