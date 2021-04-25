import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int qtdUsuarios = scan.nextInt();
			scan.nextInt(); // Não é necessário
			scan.nextLine();
			Set<String> nomesDeUsuario = new HashSet<>();
			
			for (int i = 0; i < qtdUsuarios; i++) {
				String nome = scan.nextLine();
				
				nomesDeUsuario.add(getIniciais(nome.toCharArray()));
			}
			int quantidadeUsuariosIguais = qtdUsuarios - nomesDeUsuario.size();
			System.out.println(quantidadeUsuariosIguais);
		}
	}
	
	public static String getIniciais(char[] caracteres) {
		boolean esperandoInicial = true;
		String iniciais = "";
		
		for (char c : caracteres) {
			if(c != ' ') {
				if(esperandoInicial) {
					iniciais += c;
					esperandoInicial = false;
				}
			}
			else {
				esperandoInicial = true;
			}
		}
		return iniciais;
	}
}