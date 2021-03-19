import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdTestes = Integer.parseInt(scan.nextLine());

		while (qtdTestes-- > 0) {
			int qtdInstrucoes = Integer.parseInt(scan.nextLine());
			int posicaoFinal = 0;
			String[] instrucoes = new String[qtdInstrucoes];

			for (int i=0; i<qtdInstrucoes; i++) {
				String instrucao = scan.nextLine();

				while (instrucao != null) {
					
					if (instrucao.length() == 4) 
						posicaoFinal--;
					else if (instrucao.length() == 5)
						posicaoFinal++;
					else {
						String[] linha = instrucao.split(" ");
						int indexInstrucao = Integer.parseInt(linha[2]);
						instrucao = instrucoes[indexInstrucao-1];
						continue;
					}
					instrucoes[i] = instrucao;
					instrucao = null;
				}
			}
			System.out.println(posicaoFinal);
		}
		scan.close();
	}
}