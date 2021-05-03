import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		
		for (int caseId = 1; caseId <= tests; caseId++) {
			int valuesAmount = scan.nextInt();
			Tree tree = new Tree(new Node(scan.nextInt()));

			while(valuesAmount-- > 1) {
				tree.add(scan.nextInt());
			}			
			tree.setTransversalOrders(tree.root);
			
			System.out.printf("Case %d:\n", caseId);
			tree.printByTraversalOrder("Pre.: ", tree.prefixo);
			tree.printByTraversalOrder("In..: ", tree.infixo);
			tree.printByTraversalOrder("Post: ", tree.posfixo);
			System.out.println();
		}
		scan.close();
	}
	
	public static class Tree {
		Node root;
		List<Integer> infixo = new ArrayList<>();
		List<Integer> prefixo = new ArrayList<>();
		List<Integer> posfixo = new ArrayList<>();
		
		Tree (Node root) {
			this.root = root;
		}

		public void add(int value) {
			Node next = root;
			Node previous = root;
			
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
		
		public void printByTraversalOrder(String order, List<Integer> listOrder) {
			Iterator<Integer> it = listOrder.iterator();
			System.out.print(order + it.next());
			
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
		int value;
		Node left = null;
		Node right = null;
		
		Node (int value) {
			this.value = value;
		}
	}
}