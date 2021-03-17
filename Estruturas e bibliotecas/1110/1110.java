import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int numeroDeCartas = scan.nextInt();
			Deque<Integer> pilha = new ArrayDeque<Integer>();
			String cartasDescartadas = "Discarded cards:";
			
			if(numeroDeCartas == 0) break;
			
			for(int numero=numeroDeCartas; numero>=1; numero--) {
				pilha.add(numero);
			}
			
			while(pilha.size() > 1) {
				cartasDescartadas += " " + pilha.removeLast() + ",";
				pilha.addFirst(pilha.removeLast());
			}
			
			if(numeroDeCartas >= 2) cartasDescartadas = cartasDescartadas.substring(0, cartasDescartadas.length()-1);
			
			System.out.println(cartasDescartadas);
			System.out.println("Remaining card: " + pilha.getFirst());
		}
	}
}