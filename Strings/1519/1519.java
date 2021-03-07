import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			String linha = scan.nextLine();
			if(linha.equals(".")) break;
			
			String[] palavras = linha.split(" ");
			TreeMap<Character, List<String>> abreviacoes = new TreeMap<>();

			adicionarAbreviacoes(abreviacoes, palavras);
			escolherMelhoresAbreviacoes(abreviacoes);

			System.out.println(getNovaFrase(abreviacoes, palavras));
			System.out.println(abreviacoes.size());
			for(Character caractere : abreviacoes.keySet()) {
				System.out.println(caractere + ". = " + abreviacoes.get(caractere).get(0));
			}
		}
		
		scan.close();
	}
	
	public static String getNovaFrase(TreeMap<Character, List<String>> abreviacoes, String[] palavras) {
		String novaFrase = "";
		
		for(int i=0; i<palavras.length; i++) {
			Character caractere = palavras[i].charAt(0);
			if(i > 0) novaFrase += " ";
			
			if(abreviacoes.containsKey(caractere) && palavras[i].equals(abreviacoes.get(caractere).get(0))) {
				novaFrase += (caractere + ".");
				continue;
			}
			novaFrase += palavras[i];
		}
		return novaFrase;
	}

	public static void adicionarAbreviacoes(TreeMap<Character, List<String>> abreviacoes, String[] palavras) {
		for (int i = 0; i < palavras.length; i++) {

			String palavra = palavras[i];
			if(palavra.length() <= 2) continue;
			
			List<String> list = new ArrayList<>();
			Character caractere = palavra.charAt(0);	

			if (abreviacoes.containsKey(caractere)) {
				list = abreviacoes.get(caractere);
			}
			list.add(palavra);
			
			abreviacoes.put(caractere, list);
		}
	}
	
	public static void escolherMelhoresAbreviacoes(TreeMap<Character, List<String>> abreviacoes) {
		
		for (List<String> listaPalavras : abreviacoes.values()) {
			
			if(listaPalavras.size() > 1) {
				
				Map<String, Integer> ganhoPorAbreviacao = getGanhoPorAbreviacao(listaPalavras);
				String palavra = getMelhorAbreviacao(ganhoPorAbreviacao);
				
				List<String> lista = new ArrayList<>();
				lista.add(palavra);
				
				abreviacoes.put(palavra.charAt(0), lista);
			}
		}
	}
	
	public static Map<String, Integer> getGanhoPorAbreviacao(List<String> listaPalavras) {
		Map<String, Integer> ganhoPorAbreviacao = new HashMap<>();
		
		for(int i=0; i<listaPalavras.size(); i++) {
			
			String palavra = listaPalavras.get(i);
			Integer ganho = palavra.length() - 2;
			
			if(ganhoPorAbreviacao.containsKey(palavra)) {
				ganho += ganhoPorAbreviacao.get(palavra);
			}
			ganhoPorAbreviacao.put(palavra, ganho);
		}
		return ganhoPorAbreviacao;
	}
	
	public static String getMelhorAbreviacao(Map<String, Integer> ganhoPorAbreviacao) {
		String palavra = "";
		int maiorGanho = 0;
		
		for(String key : ganhoPorAbreviacao.keySet()) {
			int ganho = ganhoPorAbreviacao.get(key);
			
			if(ganho > maiorGanho) {
				maiorGanho = ganho;
				palavra = key;
			}
		}
		return palavra;
	}
}