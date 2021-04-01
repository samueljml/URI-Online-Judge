import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dimensoes container = new Dimensoes(scan.nextLong(), scan.nextLong(), scan.nextLong());
		Dimensoes navio = new Dimensoes(scan.nextLong(), scan.nextLong(), scan.nextLong());
		
		System.out.println(navio.getQuantidadeMaximaDeTransporte(container));
	}
	
	public static class Dimensoes {
		long comprimento;
		long largura;
		long altura;
		
		Dimensoes (long largura, long comprimento, long altura) {
			this.largura = largura;
			this.comprimento = comprimento;
			this.altura = altura;
		}
		
		public long getQuantidadeMaximaDeTransporte(Dimensoes dimensoes) {
			
			return (this.largura / dimensoes.largura) * (this.altura / dimensoes.altura) * (this.comprimento / dimensoes.comprimento);
		}
	}
}