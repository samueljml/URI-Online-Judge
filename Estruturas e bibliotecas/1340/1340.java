import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int qtdTestes = scan.nextInt();
			Estrutura estrutura = new Estrutura();

			while (qtdTestes-- > 0) {
				int comando = scan.nextInt();
				int valor = scan.nextInt();

				if (comando == 1) {
					estrutura.add(valor);
				} else {
					estrutura.remove(valor);
				}
			}
			System.out.println(estrutura.getEstruturaDeDados());
		}
		scan.close();
	}
	
	public static class Estrutura {
		int quantidadeValores = 0;
		Stack<Integer> pilha = new Stack<>();
		Queue<Integer> fila = new LinkedList<>();
		Queue<Integer> prioridade = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		public void add(int valor) {
			pilha.add(valor);
			fila.add(valor);
			prioridade.add(valor);
			quantidadeValores++;
		}
		
		public void remove(int valor) {		
			if (valor == pilha.peek()) {
				pilha.pop();
			} if (valor == fila.peek()) {
				fila.remove();
			} if (valor == prioridade.peek()) {
				prioridade.poll();
			}
			quantidadeValores--;
		}

		public String getEstruturaDeDados() {
			if(isImpossivel()) return "impossible";
			if(notSure()) return "not sure";
			if(isPrioridade()) return "priority queue";
			if(isPilha()) return "stack";
			return "queue";
		}
		
		public boolean isImpossivel() {
			return !isPrioridade() && !isFila() && !isPilha();
		}
		
		public boolean notSure() {
			int quantidadeEstruturas = 0;
			if(isPrioridade()) quantidadeEstruturas++;
			if(isPilha()) quantidadeEstruturas++;
			if(isFila()) quantidadeEstruturas++;
			
			if(quantidadeEstruturas > 1) return true;
			return false;
		}
		
		private boolean isPrioridade() {
			return prioridade.size() == quantidadeValores;
		}

		private boolean isPilha() {
			return pilha.size() == quantidadeValores;
		}

		private boolean isFila() {
			return fila.size() == quantidadeValores;
		}
	}
}