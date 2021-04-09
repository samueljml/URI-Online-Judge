import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			TreeMap<Integer, String> carnes = new TreeMap<>();
			int qtdCarnes = scan.nextInt();
			String saida = "";
			
			while(qtdCarnes-- > 0) {
				String carne = scan.next();
				int validade = scan.nextInt();
				
				carnes.put(validade, carne);
			}
			
			for(Integer key : carnes.keySet()) {
				saida += carnes.get(key) + " ";
			}
			
			System.out.println(saida.substring(0, saida.length()-1));
		}
	}
}