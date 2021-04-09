import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int maiorLength = 0;
		String vencedor = "";	
		Set<String> participantesYes = new TreeSet<>();
		List<String> participantesNo = new ArrayList<>();
		
		while(true) {
			String nome = scan.next();
			
			if(nome.equals("FIM")) break;
			
			String opcao = scan.next();
			
			if(opcao.equals("YES")) {
				participantesYes.add(nome);
				
				if(nome.length() > maiorLength) {
					vencedor = nome;
					maiorLength = nome.length();
				}
			}
			else {
				participantesNo.add(nome);
			}
		}
		Collections.sort(participantesNo);
		
		for(String participante : participantesYes) {
			System.out.println(participante);
		}
		for(String participante : participantesNo) {
			System.out.println(participante);
		}
		System.out.println("\nAmigo do Habay:");
		System.out.println(vencedor);
	}
}