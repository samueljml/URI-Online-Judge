import java.util.ArrayList;
import java.util.HashMap;
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
			System.out.printf("Case %d:\n", caseId);
			tree.printByLevel();
		}
		scan.close();
	}
	
	public static class Tree {
		Node root;
		HashMap<Integer, List<Integer>> valuesByLevel = new HashMap<>();
		
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
		
		public void listByValue (Node node, int level) {
			List<Integer> values = getValueByLevel(level);
			
			values.add(node.value);
			valuesByLevel.put(level, values);
			
			if(node.left != null) { 
				listByValue(node.left, level+1);
			}
			if(node.right != null) {
				listByValue(node.right, level+1);
			}
		}
		
		public List<Integer> getValueByLevel(int level) {
			if(valuesByLevel.containsKey(level)) {
				return valuesByLevel.get(level);
			}
			return new ArrayList<>();
		}
		
		public void printByLevel() {			
			listByValue(root, 1);
			System.out.print(root.value);

			valuesByLevel.forEach((level, values) -> {
				if(level != 1) {
					for (int value : values) {
						System.out.print(" " + value);
					}
				}
			});
			System.out.println("\n");
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