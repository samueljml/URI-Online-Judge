import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int qtdCriancas = scan.nextInt();
			
			if(qtdCriancas == 0) break;
			
			MainNode mainNode = new MainNode (new Node(scan.next(), scan.nextInt()));
			
			for(int i=1; i<qtdCriancas; i++) {
				mainNode.add(new Node(scan.next(), scan.nextInt()));
			}
			
			Node node = mainNode.first;
			int movimentoAtual = node.value;
			int sentido = 1;
			
			int testeID = 1;
			
			while(MainNode.length > 1) {
				
				node = mainNode.getNextIn(node, movimentoAtual);
				movimentoAtual = node.value;
				
				if(movimentoAtual%2 == 1) {
					node = node.previous;
					mainNode.remove(node.next);
				}
				else{
					node = node.next;
					mainNode.remove(node.previous);
				}
			}
			
			System.out.println("Vencedor(a): " + node.name);
		}
	}
	
	public static class MainNode {
		Node first;
		static int length = 1;
		
		MainNode (Node first) {
			this.first = first;
			length = 1;
		}

		public void add(Node node) {
			Node last = first.previous;
			length++;
			
			first.previous = node;
			last.next = node;
			node.previous = last;
			node.next = first;
		}
		
		public Node getNextIn(Node node, int steps) {
			steps %= length;
			
			if(steps%2 == 0) {
				for(int i=0; i<steps; i++) {
					if(node.next == null) {
						break;
					}
					node = node.next;
				}
			}
			else {
				for(int i=0; i<steps; i++) {
					if(node.previous == null) {
						break;
					}
					node = node.previous;
				}
			}
			return node;   
		}
		
		public void remove(Node node) {
			length--;
			if(length == 0) {
				return;
			}
			node.previous.next = node.next;
			node.next.previous = node.previous;
		}
	}
	
	public static class Node {
		int value;
		String name;
		Node next = this;
		Node previous = this;
		
		Node (String name, int value) {
			this.name = name;
			this.value = value;
		}
	}
}