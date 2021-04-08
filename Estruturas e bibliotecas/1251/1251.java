import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casoDeTeste = 1;
		
		while(scan.hasNext()) {
			char[] caracteres = scan.nextLine().toCharArray();
			
			List<Caracter> lista = new ArrayList<>();
			HashMap<Integer, Integer> aux = new HashMap<>();
			
			for(char caracter : caracteres) {
				int valor = caracter;
				int frequencia = 1;
				
				if(aux.containsKey(valor)) {
					frequencia += aux.get(valor);
				}
				aux.put(valor, frequencia);
			}
			
			for(Integer valor : aux.keySet()) {
				lista.add(new Caracter(valor, aux.get(valor)));
			}

			Collections.sort(lista);
			
			Iterator<Caracter> it = lista.iterator();
			
			if(casoDeTeste++ > 1) {
				System.out.println();
			}
			
			while(it.hasNext()) {
				Caracter caractere = it.next();
				System.out.println(caractere.valor + " " + caractere.frequencia);
			}
		}
	}
	
	public static class Caracter implements Comparable<Caracter> {
		int valor;
		int frequencia;
		
		Caracter (int valor, int frequencia) {
			this.valor = valor;
			this.frequencia = frequencia;
		}
		
		public int getFrequencia() {
			return frequencia;
		}

		@Override
		public int compareTo(Main.Caracter caractere) {

			if(this.frequencia < caractere.frequencia) return -1;
			else if(this.frequencia > caractere.frequencia) return +1;
			else if(this.valor > caractere.valor) return -1;
			else return +1;
		}
	}
}
