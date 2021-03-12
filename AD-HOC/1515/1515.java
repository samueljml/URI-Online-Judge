import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			byte casosDeTeste = scan.nextByte();
			if(casosDeTeste == 0) break;
			
			short menorAno = 5000;
			String primeiroPlaneta = "";
			
			while(casosDeTeste-- > 0) {
				
				String planeta = scan.next();
				short anoRecebido = scan.nextShort();
				short anosParaChegar = scan.nextShort();
				short anoDeEnvio = (short) (anoRecebido - anosParaChegar);
				
				if(anoDeEnvio < menorAno) {
					menorAno = anoDeEnvio;
					primeiroPlaneta = planeta;
				}
			}
			System.out.println(primeiroPlaneta);
		}
		scan.close();
	}
}