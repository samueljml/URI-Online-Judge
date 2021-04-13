import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			String[] valores = scan.nextLine().split("[+=]");
			int resultado;
			
			if(!valores[0].matches("[0-9]+")) {
				resultado = Integer.parseInt(valores[2]) - Integer.parseInt(valores[1]);
			}
			else if(!valores[1].matches("[0-9]+")) {
				resultado = Integer.parseInt(valores[2]) - Integer.parseInt(valores[0]);
			}
			else {
				resultado = Integer.parseInt(valores[1]) + Integer.parseInt(valores[0]);
			}
			System.out.println(resultado);
		}
	}
}