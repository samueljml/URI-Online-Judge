import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdTestes = scan.nextInt();
		
		while(qtdTestes-- > 0) {
			String hamekameka = scan.next();
			String resultado = "k";
			int primeiraSequencia = hamekameka.substring(1, hamekameka.indexOf('m')).length();
			int segundaSequencia = hamekameka.substring(hamekameka.indexOf('k')+1, hamekameka.length()-2).length();
			int quantidadeA = primeiraSequencia*segundaSequencia;
			
			while(quantidadeA-- > 0) {
				resultado += "a";
			}
			System.out.println(resultado);
		}
	}
}