import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			int minimoInteiroPossivel, aux;
			int maior = scan.nextInt();
			int menor = scan.nextInt();
			
			if(maior == 0 && menor == 0) return;
			
			if(menor > maior) {
				aux = menor;
				menor = maior;
				maior = aux;
			}
			
			aux = maior - menor;
			minimoInteiroPossivel = menor - aux;
			
			System.out.println(minimoInteiroPossivel);
		}
	}
}