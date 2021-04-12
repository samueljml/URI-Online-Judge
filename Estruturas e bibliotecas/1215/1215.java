import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<String> listaDePalavras = new TreeSet<>();
		
		while(scan.hasNext()) {
			String[] palavras = scan.nextLine().toLowerCase().split("[^a-z]+");
			for(String palavra : palavras){
				listaDePalavras.add(palavra);
			}
		}
		listaDePalavras.remove("");
		
		for(String palavra : listaDePalavras) {
			System.out.println(palavra);
		}
	}
}