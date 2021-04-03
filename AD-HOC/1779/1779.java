import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdTestes = scan.nextInt();
		int casoId = 1;
		
		while(qtdTestes-- > 0) {
			int qtdProvas = scan.nextInt();
			int[] notas = new int[qtdProvas];
			int intervalo = 0;
			List<Integer> intervalos = new ArrayList<>();
			
			letNotas(notas, scan);
			int maiorNota = getMaiorNota(notas);
			
			
			for(int i=0; i<qtdProvas; i++) {
				if(notas[i] == maiorNota) {
					intervalo++;
				}
				else {
					if(intervalo > 0) {
						intervalos.add(intervalo);
					}
					intervalo = 0;
				}
			}
			if(intervalo > 0) {
				intervalos.add(intervalo);
			}
			
			Collections.sort(intervalos);
			
			System.out.printf("Caso #%d: %d\n", casoId++, intervalos.get(intervalos.size()-1));
		}
	}

	private static void letNotas(int[] notas, Scanner scan) {
		for(int i=0; i<notas.length; i++) {
			notas[i] = scan.nextInt();
		}
	}

	private static int getMaiorNota(int[] notas) {
		int maiorNota = 0;
		
		for(int nota : notas) {
			if(nota > maiorNota) {
				maiorNota = nota;
			}
		}
		
		return maiorNota;
	}
}