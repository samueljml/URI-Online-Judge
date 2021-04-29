import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casoId = 1;
		int qtdTestes = scan.nextInt();
		
		while(qtdTestes-- > 0) {
			MainNode mainNode = new MainNode (new Node(1));
			int qtdPessoas = scan.nextInt();
			int salto = scan.nextInt();
			
			for(int i=2; i<=qtdPessoas; i++) {
				mainNode.add(new Node(i));
			}
			Node node = mainNode.last;	
			
			while(MainNode.length > 1) {
				node = mainNode.getNextIn(node, salto);
				mainNode.remove(node);
			}
			System.out.printf("Case %d: %d\n", casoId++, node.next.value);
		}
	}

	public static class MainNode {
		Node first;
		Node last;
		Node previous;
		static int length = 1;
		
		MainNode (Node first) {
			this.first = first;
			this.last = first;
			length = 1;
		}

		public void add(Node node) {
			length++;
			last.next = node;
			node.next = first;
			last = node;
		}
		
		public Node getNextIn(Node node, int saltos) {
			while(saltos-->0) {
				previous = node;
				node = node.next;
			}
			return node;
		}
		
		public void remove(Node node) {
			length--;
			previous.next = node.next;
		}
	}
	
	public static class Node {
		int value;
		Node next = this;
		
		Node (int value) {
			this.value = value;
		}
	}
}