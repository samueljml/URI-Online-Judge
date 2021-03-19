import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdTestes = Integer.parseInt(scan.nextLine());

		while (qtdTestes-- > 0) {
			Time time1 = new Time();
			Time time2 = new Time();

			// 1º Partida
			time1.addGolsMandante(scan.nextInt());
			scan.next();
			time2.addGolsVisitante(scan.nextInt());
			// 2º Partida
			time2.addGolsMandante(scan.nextInt());
			scan.next();
			time1.addGolsVisitante(scan.nextInt());

			if (time1.gols > time2.gols)
				System.out.println("Time 1");
			else if (time1.gols < time2.gols)
				System.out.println("Time 2");
			else {
				if (time1.golsMandante == time2.golsMandante)
					System.out.println("Penaltis");
				else if (time1.golsVisitante > time2.golsVisitante) {
					System.out.println("Time 1");
				} else
					System.out.println("Time 2");
			}
		}
		scan.close();
	}

	public static class Time {
		int gols = 0;
		int golsMandante = 0;
		int golsVisitante = 0;

		public void addGolsMandante(int gols) {
			golsMandante += gols;
			this.gols += gols;
		}

		public void addGolsVisitante(int gols) {
			golsVisitante += gols;
			this.gols += gols;
		}
	}
}