import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int total = 0;
			int qtdPerguntas = scan.nextInt();
			int frequencia = scan.nextInt();
			HashMap<Integer, Integer> dicionario = new HashMap<>();
			
			if(qtdPerguntas == 0 && frequencia == 0) break;
			
			while(qtdPerguntas-- >0) {
				int num = scan.nextInt();
				int repeticoes = 1;
				if(dicionario.containsKey(num)) {
					repeticoes += dicionario.get(num);
				}
				dicionario.put(num, repeticoes);
			}
			
			for(int key : dicionario.keySet()) {
				int repeticoes = dicionario.get(key);
				if(repeticoes >= frequencia) {
					total += 1;
				}
			}
			System.out.println(total);
		}
		scan.close();
	}
}