import java.util.Scanner;

public class Main {
	
	static final char TANQUE_COM_AGUA = 'A';
	static final char TANQUE_CONTAMINADO = 'T';
	static final char TANQUE_FOI_CONTAMINADO = 'F';
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {			
			int linhas = scan.nextInt();
			int colunas = scan.nextInt();
			int[][] matriz = new int[linhas][colunas];
			
			if(linhas == 0 && colunas == 0) break;
			lerMatriz(scan, matriz);
			
			for (int l = 0; l < linhas; l++) {
				for (int c = 0; c < colunas; c++) {
					if(matriz[l][c] == TANQUE_CONTAMINADO) {
						verificarTanquesAdjacente(matriz, l, c);
					}
				}
			}
			
			for (int[] tanques : matriz) {
				for (int tanque : tanques) {
					if(tanque == TANQUE_FOI_CONTAMINADO) tanque = TANQUE_CONTAMINADO;
					System.out.printf("%c", tanque);
				}
				System.out.println();
			}
			System.out.println();
		}
		scan.close();
	}
	
	public static void lerMatriz(Scanner scan, int[][] matriz) {
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		
		for (int l = 0; l < linhas; l++) {
			char[] caractere = scan.next().toCharArray();
			for (int c = 0; c < colunas; c++) {
				matriz[l][c] = caractere[c];
			}
		}
	}
	
	public static void verificarTanquesAdjacente(int[][] matriz, int l, int c) {

		verificarAdjacente(matriz, l+1, c);
		verificarAdjacente(matriz, l-1, c);
		verificarAdjacente(matriz, l, c+1);
		verificarAdjacente(matriz, l, c-1);
	}
	
	public static void verificarAdjacente(int[][] matriz, int l, int c) {
		try {
			if(matriz[l][c] == TANQUE_COM_AGUA) {
				matriz[l][c] = TANQUE_FOI_CONTAMINADO;
				verificarTanquesAdjacente(matriz, l, c);
			}
		} catch (Exception e) {}
	}
}