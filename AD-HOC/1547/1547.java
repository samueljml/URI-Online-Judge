import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdTestes = scan.nextInt();
		int ganhadorId = 0;
		
		while(qtdTestes-- > 0) {
			int menorDiferenca = 101;
			int qtdAlunos = scan.nextInt();
			int numeroSorteado = scan.nextInt();
			
			for(int i=0; i<qtdAlunos; i++) {
				int diferenca = Math.abs(scan.nextInt() - numeroSorteado);
				
				if(diferenca < menorDiferenca) {
					menorDiferenca = diferenca;
					ganhadorId = i+1;
				}
			}
			System.out.println(ganhadorId);
		}
		scan.close();
	}
}