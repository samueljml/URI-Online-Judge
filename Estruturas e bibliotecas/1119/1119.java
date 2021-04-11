import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int qtdAlunos = scan.nextInt();
			int stepsRight = scan.nextInt();
			int stepsLeft = scan.nextInt()*-1;
			MainNode mainNode = new MainNode (new Node(1));
			boolean first = true;
			
			if(qtdAlunos == 0 && stepsRight == 0 && stepsLeft == 0) break;
			
			for(int numeroCandidato=2; numeroCandidato<=qtdAlunos; numeroCandidato++) {
				mainNode.add(new Node(numeroCandidato));
			}
			
			Node onLeft = mainNode.first;
			Node onRight = mainNode.first.previous;
			
			if(MainNode.length == 1) {
				onRight = mainNode.first;
			}
			
			while(MainNode.length > 0) {
				if(!first) System.out.print(",");
				
				onRight = mainNode.getNextIn(onRight, stepsRight);
				onLeft = mainNode.getNextIn(onLeft, stepsLeft);
				
				if(onRight.value == onLeft.value) {
					onRight = mainNode.removeNodeAndGetNext(onRight, -1);
					onLeft = mainNode.getNextIn(onLeft, 1);
				}
				else {
					onRight = mainNode.removeNodeAndGetNext(onRight, -1);
					onLeft = mainNode.removeNodeAndGetNext(onLeft, 1);
				}
				first = false;
			}
		}
	}
	
	public static class MainNode {
		Node first;
		static int length = 1;
		
		MainNode (Node first) {
			this.first = first;
			length = 1;
		}
		
		public Node removeNodeAndGetNext(Node node, int steps) {
			Node toRemove = node;
			printNodeValue(node);
			node = getNextIn(node, steps);
			remove(toRemove);
			return node;
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
			if(steps > 0) {
				for(int i=0; i<steps; i++) {
					if(node.next == null) {
						break;
					}
					node = node.next;
				}
			}
			else {
				steps *= -1;
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
		
		public void printNodeValue(Node node) {
			if(node.value > 9) System.out.print(" ");
			else System.out.print("  ");
			
			if(length <= 1) {
				System.out.println(node.value);
			}
			else {
				System.out.print(node.value);
			}
		}
	}
	
	public static class Node {
		int value;
		Node next = this;
		Node previous = this;
		
		Node (int  value) {
			this.value = value;
		}
	}
}