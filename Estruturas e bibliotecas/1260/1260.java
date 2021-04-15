import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<TreeMap<String, Integer>> lista = new ArrayList<>();
		TreeMap<String, Integer> dicionario = new TreeMap<>();
		List<Float> qtdEspecies = new ArrayList<>();
		float especies = 0;
		
		Integer.parseInt(scan.nextLine());

		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
			
			if(linha.length() == 0) {
				if(dicionario.size() > 0) {
					lista.add(dicionario);
					qtdEspecies.add(especies);
				}
				
				dicionario = new TreeMap<>();
				especies = 0;
				continue;
			}
			
			especies++;
			int qtd = 1;
		
			if(dicionario.containsKey(linha)) {
				qtd += dicionario.get(linha);
			}
			dicionario.put(linha, qtd);
		}
		
		scan.close();
		
		if(dicionario.size() > 0) {
			lista.add(dicionario);
			qtdEspecies.add(especies);
		}
		
		Iterator<TreeMap<String, Integer>> it = lista.iterator();
		
		int i =0;
		while(it.hasNext()) {
			dicionario = it.next();
			if(i > 0) System.out.println();
			
			for(String key : dicionario.keySet()) {
				int qtd = dicionario.get(key);
				float porcentagem = (float) qtd/qtdEspecies.get(i) * 100;
				System.out.printf("%s %.4f\n", key, porcentagem);
			}
			i++;
		}
	}
}