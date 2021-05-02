import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tree tree = new Tree();
		boolean modificated = true;
		
		while (scan.hasNext()) {
			String comando = scan.next();
			
			if(comando.length() == 1) {
				char value = scan.next().charAt(0);
				
				if(comando.equals("I")) {
					modificated = true;
					tree.add(value);	
				}
				else {
					if(tree.exists(value)) {
						System.out.println(value + " existe");
					}
					else {
						System.out.println(value + " nao existe");
					}
				}
			}
			else {
				if(modificated) {
					tree.clearLists();
					tree.setTransversalOrders(tree.root);
					modificated = false;
				}
				if(comando.equals("INFIXA")) {
					tree.printByTraversalOrder(tree.infixo);
				}
				else if(comando.equals("PREFIXA")) {
					tree.printByTraversalOrder(tree.prefixo);
				}
				else {
					tree.printByTraversalOrder(tree.posfixo);
				}
			}			
		}
		scan.close();
	}
	
	public static class Tree {
		Node root;
		List<Character> infixo = new ArrayList<>();
		List<Character> prefixo = new ArrayList<>();
		List<Character> posfixo = new ArrayList<>();

		public void add(char value) {
			Node next = root;
			Node previous = root;
			
			if(root == null) {
				root = new Node(value);
				return;
			}
			
			while(next != null) {
				previous = next;
				next = (value < next.value) ? next.left : next.right;
			}
			
			if(value < previous.value) {
				previous.left = new Node(value);
			}
			else {
				previous.right = new Node(value);
			}
		}
		
		public boolean exists(char value) {
			Node node = root;
			
			while(node != null) {
				if(node.value == value) {
					return true;
				}
				
				if(value < node.value) {
					node = node.left;
				}
				else {
					node = node.right;
				}
			}
			return false;
		}

		public void clearLists() {
			infixo = new ArrayList<>();
			prefixo = new ArrayList<>();
			posfixo = new ArrayList<>();
		}

		public void printByTraversalOrder(List<Character> listOrder) {
			Iterator<Character> it = listOrder.iterator();
			System.out.print(it.next());
			
			while(it.hasNext()) {
				System.out.print(" " + it.next());
			}
			System.out.println();		
		}
		
		public void setTransversalOrders (Node node) {			
			prefixo.add(node.value);
			
			if(node.left != null) {
				setTransversalOrders(node.left);
			}
			infixo.add(node.value);
			
			if(node.right != null) {
				setTransversalOrders(node.right);
			}
			posfixo.add(node.value);
		}
	}
	
	public static class Node {
		char value;
		Node left = null;
		Node right = null;
		
		Node (char value) {
			this.value = value;
		}
	}
}