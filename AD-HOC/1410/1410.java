import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int qtdAtacantes = scan.nextInt();
			int qtdDefensores = scan.nextInt();

			if (qtdAtacantes == 0 && qtdDefensores == 0)
				break;

			int[] atacantes = getArray(scan, qtdAtacantes);
			int[] defensores = getArray(scan, qtdDefensores);

			Arrays.sort(atacantes);
			Arrays.sort(defensores);

			if (atacantes[0] < defensores[1])
				System.out.println("Y");
			else
				System.out.println("N");
		}
		scan.close();
	}

	public static int[] getArray(Scanner scan, int qtd) {
		int[] jogadores = new int[qtd];
		
		for (int i = 0; i < qtd; i++) {
			jogadores[i] = scan.nextInt();
		}
		return jogadores;
	}
}