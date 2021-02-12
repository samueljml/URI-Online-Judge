import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numeroDeBotasIndividuais;
		
		while(scan.hasNext()){

    	    List<Bota> botas = new ArrayList();
    		numeroDeBotasIndividuais = scan.nextInt();
    		int numero;
    		char par;
    			
    		while (numeroDeBotasIndividuais-- > 0){
    			    
    			numero = scan.nextInt();
    			par = scan.next().charAt(0);
    			    
    			Bota bota = Bota.getSapato(botas, numero);
    				
    			if(bota == null) {
    				botas.add(new Bota(numero, par));
    			}
    			else{
    				bota.addPar(par);
    			}
    		}
    		
    		System.out.println(Bota.getTotal(botas));
		}
	}
	public static class Bota {
		public int numero;
		private int paresEsquerdo=0;
		private int paresDireito=0;
		
		public Bota (int numero, char par){
		    this.numero = numero;
		    addPar(par);
		}
		public void addPar(char par){
			if(par == 'D') paresDireito++;
			else paresEsquerdo++;
		}
		public static Bota getSapato(List<Bota> lista, int numero) {
		    
		    Iterator<Bota> it = lista.iterator();
		    while(it.hasNext()){
		        Bota bota = it.next();
		        if(bota.numero == numero) {
		            return bota;
		        }
		    }
		    return null;
		}
		public static int getTotal(List<Bota> lista) {
		    int total = 0;
		    Iterator<Bota> it = lista.iterator();
		    
		    while(it.hasNext()){
		        Bota bota = it.next();
		        
		        while(bota.paresEsquerdo>0 && bota.paresDireito>0){
    				bota.paresEsquerdo--;
    				bota.paresDireito--;
    				total++;
			    }
		    }
		    
		    return total;
		}
	}
}