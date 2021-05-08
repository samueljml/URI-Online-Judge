import java.util.Scanner;

public class Main {
	
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int qtdTestes = entrada.nextInt();
		
		while(qtdTestes-- > 0) {
			Sequencia.set(entrada.next());
			int qtdSubsequencias = entrada.nextInt();
			
			while(qtdSubsequencias-- > 0) {
				String subsequencia = entrada.next();
				
				if(Sequencia.temSubsequencia(subsequencia)) {
					System.out.println("Yes");
				}
				else { 
					System.out.println("No");
				}
			}
		}
		entrada.close();
	}
	
	public static class Sequencia {
		private static String texto;
		private static int index;
		
		public static void set(String entrada) {
			texto = entrada;
		}

		public static boolean temSubsequencia(String subsequencia) {
			char[] caracteres = subsequencia.toCharArray();
			index = 0;
			
			for (char c : caracteres) {
				if(naoContem(c)) {
					return false;
				}
				index++;
			}
			return true;
		}
		public static boolean naoContem(char c) {
			index = texto.indexOf(c, index);
			
			if(index == -1) return true;
			return false;
		}
	}
}