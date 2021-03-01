import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		int casosDeTeste = scan.nextInt();
		
		while(casosDeTeste-- > 0) {
						
			Set<Integer> set = new HashSet<Integer>();
			int numeroDeCarneirinhos = scan.nextInt();
			
			while(numeroDeCarneirinhos-- > 0) {
				set.add(scan.nextInt());
			}
			System.out.println(set.size());
		}
		scan.close();
	}
}