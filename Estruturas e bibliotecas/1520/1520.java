import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int tamanho;
			int qtdIntervalos = scan.nextInt();
			int[] quantidadePorTamanho = new int[101];

			while (qtdIntervalos-- > 0) {
				int min = scan.nextInt();
				int max = scan.nextInt();

				for (tamanho = min; tamanho <= max; tamanho++) {
					quantidadePorTamanho[tamanho]++;
				}
			}

			tamanho = scan.nextInt();

			if (quantidadePorTamanho[tamanho] == 0) {
				System.out.println(tamanho + " not found");
			} else {
				int index = 0;

				for (int tam = 0; tam < 101; tam++) {

					if (tam == tamanho) {
						System.out.print(tam + " found from " + index);

						while (--quantidadePorTamanho[tam] > 0) {
							index++;
						}
						System.out.println(" to " + index);
						break;
					}
					while (quantidadePorTamanho[tam]-- > 0) {
						index++;
					}
				}
			}
		}
	}
}