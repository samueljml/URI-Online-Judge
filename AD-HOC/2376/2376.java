import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Character[] caracteres = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};
		List<Character> lista = new ArrayList<>(Arrays.asList(caracteres));
		
		while(lista.size() > 1) {
			for(int i=0; i<lista.size(); i++) {
				int n1 = scan.nextInt();
				int n2 = scan.nextInt();
				
				if(n1 > n2) 
					lista.remove(i+1);
				else 
					lista.remove(i);
			}
		}
		System.out.println(lista.get(0));
	}
}