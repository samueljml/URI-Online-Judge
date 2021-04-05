import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int qtdTrem	= scan.nextInt();
			
			if(qtdTrem == 0) break;
			
			while(true) {
				Stack<Integer> pilha = new Stack<>();
				int next = qtdTrem;
				String saida = "No";
				int[] vagoes = new int[qtdTrem];
				
				vagoes[qtdTrem-1] = scan.nextInt();
				if(vagoes[qtdTrem-1] == 0) break;
				
				for(int i=qtdTrem-2; i>=0; i--) {
					vagoes[i] = scan.nextInt();
				}
				
				for(int i=0; i<qtdTrem; i++) {
					pilha.add(vagoes[i]);
					
					while(!pilha.empty() && pilha.peek() == next) {
						pilha.pop();
						next--;
						if(next == 0) {
							saida = "Yes";
							i = qtdTrem;
						}
					}
				}
				System.out.println(saida);
			}
			System.out.println();
		}
	}
}