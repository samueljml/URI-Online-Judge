import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int maximoLetras = 11;

		while (true) {
			int qtdAlunos = scan.nextInt();
			char[][] alunos = new char[qtdAlunos][maximoLetras];
			int[] forca = new int[qtdAlunos];

			if (qtdAlunos == 0)
				break;

			for (int i = 0; i < qtdAlunos; i++) {

				alunos[i] = scan.next().toCharArray();

				for (int j = 0; j < alunos[i].length; j++) {
					forca[i] += alunos[i][j];
				}
			}

			int index = buscaBinaria(forca, qtdAlunos / 2);

			if (index != -1)
				System.out.println(alunos[index]);
			else
				System.out.println("Impossibilidade de empate.");
		}
	}

	private static int buscaBinaria(int[] forca, int alunoId) {		
		long forcaTime1, forcaTime2;
		int limiteMin = 0;
		int limiteMax = forca.length;
		
		while(limiteMin <= limiteMax) {
			forcaTime1 = getForcaTime(forca, 0, alunoId+1, alunoId+1);
			forcaTime2 = getForcaTime(forca, alunoId+1, forca.length, alunoId);
			
			if (forcaTime1 == forcaTime2) {
				return alunoId;
			} 
			
			if(forcaTime1 < forcaTime2) {
				limiteMin = alunoId+1;
			}
			else if(forcaTime1 > forcaTime2) {
				limiteMax = alunoId-1;
			}
			alunoId = limiteMin + (limiteMax - limiteMin)/2;
		}
		return -1;
	}

	private static long getForcaTime(int[] forca, int min, int max, int alunoId) {
		long forcaTime = 0;
		
		for (int i = min; i < max; i++) {
			forcaTime += forca[i] * Math.abs(alunoId - i);
		}
		return forcaTime;
	}
}