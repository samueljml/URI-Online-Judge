import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Imagem img = new Imagem(scan.nextInt(), scan.nextInt());
		int clicks = 0;

		img.readMatriz(scan);
		scan.close();

		for (int l = 0; l < img.linhas; l++) {
			for (int c = 0; c < img.colunas; c++) {
				if (img.pixelVazioPintado(l, c)) {
					List<PixelIndex> pixelVaziosAdjacentes = new ArrayList<>();
					PixelIndex pi = new PixelIndex(l, c);
					pixelVaziosAdjacentes.add(pi);

					for (int i = 0; i < pixelVaziosAdjacentes.size(); i++) {
						pi = pixelVaziosAdjacentes.get(i);
						
						if(img.pixelVazioPintado(pi.l+1, pi.c)) pixelVaziosAdjacentes.add(new PixelIndex(pi.l+1, pi.c));
						if(img.pixelVazioPintado(pi.l-1, pi.c)) pixelVaziosAdjacentes.add(new PixelIndex(pi.l-1, pi.c));
						if(img.pixelVazioPintado(pi.l, pi.c+1)) pixelVaziosAdjacentes.add(new PixelIndex(pi.l, pi.c+1));
						if(img.pixelVazioPintado(pi.l, pi.c-1)) pixelVaziosAdjacentes.add(new PixelIndex(pi.l, pi.c-1));
					}
					clicks++;
				}
			}
		}
		System.out.println(clicks);
	}

	public static class Imagem {
		private final char PIXEL_VAZIO = '.';
		private final char PIXEL_PINTADO = 'o';
		private final int linhas;
		private final int colunas;
		private int[][] matriz;

		Imagem(int linhas, int colunas) {
			this.linhas = linhas;
			this.colunas = colunas;
			matriz = new int[linhas][colunas];
		}

		public void readMatriz(Scanner scan) {
			for (int l = 0; l < linhas; l++) {
				String linha = scan.next();
				for (int c = 0; c < colunas; c++) {
					matriz[l][c] = linha.charAt(c);
				}
			}
		}

		public boolean pixelVazioPintado(int l, int c) {
			try{
				if(matriz[l][c] == PIXEL_VAZIO) {
					matriz[l][c] = PIXEL_PINTADO;
					return true;
				}
				return false;
			}
			catch (Exception e) {
				return false;
			}
		}
		
		public void pintarPixel(PixelIndex pi) {
			matriz[pi.l][pi.c] = PIXEL_PINTADO;
		}

	}

	public static class PixelIndex {
		int l;
		int c;

		PixelIndex(int l, int c) {
			this.l = l;
			this.c = c;
		}
	}
}