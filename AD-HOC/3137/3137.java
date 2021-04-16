import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int total = 0;
		
		for(int i=1;  i<=p; i++) {
			total += Math.floor(Math.log10(i)) + 1;
		}
		System.out.println(total);
	}
}