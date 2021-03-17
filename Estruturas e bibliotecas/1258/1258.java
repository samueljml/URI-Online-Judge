import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int casoId = 0;

		while (true) {
			int qtdCamisetas = Integer.parseInt(scan.nextLine());
			Camisetas camisetas = new Camisetas();

			if(qtdCamisetas == 0) break;
			if(casoId++ > 0) System.out.println();
			
			for(int i=0; i<qtdCamisetas; i++) {
				String nome = scan.nextLine();
				String[] linha = scan.nextLine().split(" ");
				String cor = linha[0];
				char tamanho = linha[1].charAt(0);
		
				camisetas.add(cor, nome, tamanho);
			}
			camisetas.mostrarTodas();
		}
		scan.close();
	}
	
	public static class Camisetas {
		private TreeMap<String, List<String>> camisasP = new TreeMap<>();
		private TreeMap<String, List<String>> camisasM = new TreeMap<>();
		private TreeMap<String, List<String>> camisasG = new TreeMap<>();
		
		public void add(String cor, String nome, char tamanho) {
		    TreeMap<String, List<String>> camisas = getListaCamisas(tamanho);
		    List<String> lista = new ArrayList<>();
		    
		    if(camisas.containsKey(cor))
		        lista = camisas.get(cor);
		        
		    lista.add(nome);
		    
		    camisas.put(cor, lista);
		}
		
		public TreeMap<String, List<String>> getListaCamisas (char tamanho) {
		    if(tamanho == 'P') return camisasP;
		    if(tamanho == 'M') return camisasM;
		    return camisasG;
		}
		
		public void mostrarTodas() {
		    String[] keys = {"branco", "vermelho"};
		    char[] tamanhos = {'P', 'M', 'G'};
		    
		    for(String key : keys) {
		        for(char tamanho: tamanhos) {
		            TreeMap<String, List<String>> camisas = getListaCamisas(tamanho);
		            List<String> lista = new ArrayList<>();
		            
		            if(camisas.containsKey(key))
		                lista = camisas.get(key);
		            
		            Collections.sort(lista);
		            
		            for(int i=0; i<lista.size(); i++) {
		                System.out.println(key + " " + tamanho + " " + lista.get(i));
		            }
		        }
		    }
		}
	}
}