import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			Tabuleiro jogo = new Tabuleiro();
			jogo.setJogadores(scanner.nextByte());
			jogo.setNumeroQuadrados(scanner.nextShort());
			
			if(jogo.fimDaEntrada()) break;
			
			for (byte i = 0; i < 3; i++) {
				jogo.setArmadilhas(i, scanner.nextInt());
			}

			int numeroRolagens = scanner.nextInt();

			while (numeroRolagens-- > 0) {

				int d1 = scanner.nextInt();
				int d2 = scanner.nextInt();

				int qtdPulos = d1 + d2;

				jogo.atualizaPosicao(qtdPulos);
			}

			System.out.println(jogo.getVencedorId() + 1);
		}
		scanner.close();
	}

	public static class Tabuleiro {
		private int jogadorId = 0;
		private int vencedorId = 0;
		private short numeroQuadrados;
		private int[] armadilhas = new int[3];
		private List<Jogador> jogadores = new ArrayList<>();
		
		public short getNumeroQuadrados() {
			return numeroQuadrados;
		}

		public void setArmadilhas(byte index, int value) {
			armadilhas[index] = value;
		}

		public boolean fimDaEntrada() {
			return (numeroQuadrados == 0 && jogadores.size() == 0);
		}

		public void atualizaPosicao(int qtdPulos) {
			
			Jogador jogador = jogadores.get(jogadorId);
			
			while(jogador.isAmaldicoado()) {
				jogador.setMaldicao(false);
				jogador = getProximoPlayer();
			}
			jogadores.get(jogadorId).mover(this, qtdPulos);
			setJogadorId(++jogadorId);
		}
		
		public void setJogadorId(int jogadorId) {
			if(jogadorId == jogadores.size()) jogadorId = 0;
			this.jogadorId = jogadorId;
		}

		public void setJogadores(short numJogadores) {
			while (numJogadores-- > 0) {
				jogadores.add(new Jogador());
			}
		}

		public void setNumeroQuadrados(short numQuadrados) {
			numeroQuadrados = numQuadrados;
		}

		public boolean caiuNaArmadilha(int posicao) {
			for (int i = 0; i < 3; i++) {
				if (armadilhas[i] == posicao) {
					return true;
				}
			}
			return false;
		}

		public Jogador getProximoPlayer() {
			
			setJogadorId(++jogadorId);
			return jogadores.get(jogadorId);
		}

		public int getVencedorId() {
			return vencedorId;
		}

		public void setVencedorId() {
			if(vencedorId == 0) {
				vencedorId = jogadorId;
			}
		}
	}

	public static class Jogador {
		private boolean amaldicoado = false;
		private int posicao;

		public void setMaldicao(boolean amaldicoado) {
			this.amaldicoado = amaldicoado;
		}

		public boolean isAmaldicoado() {
			return amaldicoado;
		}

		public void mover(Tabuleiro tabuleiro, int pulos) {
			posicao += pulos;
			if (tabuleiro.caiuNaArmadilha(posicao))
				amaldicoado = true;
			else if(posicao > tabuleiro.getNumeroQuadrados())
				tabuleiro.setVencedorId();
		}

		public boolean naArmadilha() {
			return amaldicoado;
		}

		public int getPosicao() {
			return posicao;
		}
	}
}