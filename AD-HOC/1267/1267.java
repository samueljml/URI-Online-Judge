import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int numeroAlumni = scan.nextInt();
			int numeroJantares = scan.nextInt();
			String saida = "no";

			if (numeroAlumni == 0 && numeroJantares == 0)
				break;

			int[] alunos = new int[numeroAlumni];

			for (int jantares = 0; jantares < numeroJantares; jantares++) {
				for (int i = 0; i < numeroAlumni; i++) {
					alunos[i] += scan.nextInt();
				}
			}

			for (int i = 0; i < numeroAlumni; i++) {
				if (alunos[i] == numeroJantares) {
					saida = "yes";
				}
			}

			System.out.println(saida);
		}
		scan.close();
	}
}