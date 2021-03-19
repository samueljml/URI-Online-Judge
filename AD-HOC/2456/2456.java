import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> numerosCrescentes = new ArrayList<>();
		List<Integer> numerosDecrescentes = new ArrayList<>();
		int[] cartas = new int[5];
		char tipoOrdenacao = 'N';
		
		cartas[0] = scan.nextInt();
		numerosCrescentes.add(cartas[0]);
		numerosDecrescentes.add(cartas[0]);
		
		for(int i=1; i<5; i++) {
			cartas[i] = scan.nextInt();
			if(cartas[i] > cartas[i-1]) numerosCrescentes.add(cartas[i]);
			if(cartas[i] < cartas[i-1]) numerosDecrescentes.add(cartas[i]);
		}
		if(numerosCrescentes.size() == 5) tipoOrdenacao = 'C';
		else if(numerosDecrescentes.size() == 5) tipoOrdenacao = 'D';
		
		System.out.println(tipoOrdenacao);
	}
}