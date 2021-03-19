import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdCandidatos = scan.nextInt();
		int totalParticipantes = 0;

		while (qtdCandidatos-- > 0)
			totalParticipantes += scan.nextInt();
		
		System.out.println(totalParticipantes);
	}
}