import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		String linha;
		
		while(scan.hasNext()) {
			
			Cal�ado.setNumera��o(scan.nextByte());
			Cal�ado.updateNumeroCasoDeTeste();
			scan.nextLine();
			linha = scan.nextLine();
			
			for(int i=0; i<linha.length();) {
				short numero = Short.valueOf(linha.substring(i, i+2));
				char genero = linha.charAt(i+3);
				Cal�ado.addPar(numero, genero);
				i+=5;
			}
			
			Cal�ado.mostrarMensagem();
			Cal�ado.reset();
		}
		scan.close();
	}
	
	public static class Cal�ado {
		private static int caso = 0;
		private static short numera��o;
		private static int cal�adosFemininos = 0;
		private static int cal�adosMasculinos = 0;
		
		public static void setNumera��o(short numera��o) {
			Cal�ado.numera��o = numera��o;
		}
		public static void updateNumeroCasoDeTeste() {
			caso++;
		}
		public static void addPar(short numero, char genero) {
			if(numero == numera��o) {
				if(genero == 'F') cal�adosFemininos++;
				else cal�adosMasculinos++;
			}
		}
		public static void mostrarMensagem () {
			if(caso>1) System.out.println();
			System.out.println("Caso " + caso + ":");
			System.out.println("Pares Iguais: " + (cal�adosFemininos + cal�adosMasculinos));
			System.out.println("F: " + cal�adosFemininos);
			System.out.println("M: " + cal�adosMasculinos);
		}
		public static void reset() {
			cal�adosFemininos = 0;
			cal�adosMasculinos = 0;
		}
	}
}