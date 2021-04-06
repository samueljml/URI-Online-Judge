import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int numeroVagoes = scan.nextInt();
			char[] vagoes = new char[numeroVagoes];
			List<Character> ordem = new ArrayList<>();
			Stack<Character> pilha = new Stack<>();
			String saida = "";
			
			if(numeroVagoes == 0) break;
			
			for(int i=0; i<numeroVagoes; i++) {
				vagoes[i] = scan.next().charAt(0);
			}
			for(int i=0; i<numeroVagoes; i++) {
				ordem.add(scan.next().charAt(0));
			}
			
			Iterator<Character> it = ordem.iterator();
			char next = it.next();
			
			for(int i=0; i<numeroVagoes; i++) {
				pilha.push(vagoes[i]);
				saida += "I";
				
				while(!pilha.empty() && pilha.peek().equals(next)) {
					saida += "R";
					pilha.pop();
					if(it.hasNext()) {
						next = it.next();
						continue;
					}
					break;
				}
			}
			
			if(it.hasNext()) saida += " Impossible";
			
			System.out.println(saida);
		}
	}
}