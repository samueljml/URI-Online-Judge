import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static int casoId = 1;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			Subsequencia subsequencia = new Subsequencia(scan.next(), scan.next());
			subsequencia.calcular(); 
			subsequencia.imprimirResultado();
		}
		scan.close();
	}
	
	public static class Subsequencia {
		int qtdSubSequencias = 0;
		int posUltimaSubsequencia;
		String sequencia;
		String subSequencia;
		
		public Subsequencia (String subSequencia, String sequencia) {
			this.sequencia = sequencia;
			this.subSequencia = subSequencia;
		}
		
		public void calcular() {
			int ultimoIndex = 0;
			
			while(true) {
				ultimoIndex = sequencia.indexOf(subSequencia, ultimoIndex);
				
				if(ultimoIndex == -1) break;
				
				qtdSubSequencias++;
				posUltimaSubsequencia = ultimoIndex + 1;
				ultimoIndex += 1;
			}
		}
		
		public void imprimirResultado () {
			System.out.println("Caso #" + (casoId++) + ":");
			if(qtdSubSequencias == 0) System.out.println("Nao existe subsequencia\n");
			else {
				System.out.println("Qtd.Subsequencias: " + qtdSubSequencias);
				System.out.println("Pos: " + posUltimaSubsequencia + "\n");
			}
		}
	}
}