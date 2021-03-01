import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		String linha;
		
		while(scan.hasNext()) {
			
			Calçado.setNumeração(scan.nextByte());
			Calçado.updateNumeroCasoDeTeste();
			scan.nextLine();
			linha = scan.nextLine();
			
			for(int i=0; i<linha.length();) {
				short numero = Short.valueOf(linha.substring(i, i+2));
				char genero = linha.charAt(i+3);
				Calçado.addPar(numero, genero);
				i+=5;
			}
			
			Calçado.mostrarMensagem();
			Calçado.reset();
		}
		scan.close();
	}
	
	public static class Calçado {
		private static int caso = 0;
		private static short numeração;
		private static int calçadosFemininos = 0;
		private static int calçadosMasculinos = 0;
		
		public static void setNumeração(short numeração) {
			Calçado.numeração = numeração;
		}
		public static void updateNumeroCasoDeTeste() {
			caso++;
		}
		public static void addPar(short numero, char genero) {
			if(numero == numeração) {
				if(genero == 'F') calçadosFemininos++;
				else calçadosMasculinos++;
			}
		}
		public static void mostrarMensagem () {
			if(caso>1) System.out.println();
			System.out.println("Caso " + caso + ":");
			System.out.println("Pares Iguais: " + (calçadosFemininos + calçadosMasculinos));
			System.out.println("F: " + calçadosFemininos);
			System.out.println("M: " + calçadosMasculinos);
		}
		public static void reset() {
			calçadosFemininos = 0;
			calçadosMasculinos = 0;
		}
	}
}