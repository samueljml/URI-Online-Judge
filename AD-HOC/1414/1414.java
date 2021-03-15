import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int timesParticipantes = scan.nextInt();
			int qtdPartidas = scan.nextInt();
			int totalPontos = 0;

			if (timesParticipantes == 0 && qtdPartidas == 0)
				break;

			for (int i = 0; i < timesParticipantes; i++) {
				scan.next();
				totalPontos += scan.nextInt();
			}
			
			int empates = qtdPartidas - (totalPontos - (qtdPartidas * 2));

			System.out.println(empates);
		}
		scan.close();
	}
}