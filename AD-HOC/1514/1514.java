import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int qtdParticipantes = scan.nextInt();
			int qtdProblemas = scan.nextInt();

			if (qtdParticipantes == 0 && qtdProblemas == 0)
				break;

			Competicao competicao = new Competicao();

			for (int l = 0; l < qtdParticipantes; l++) {
				for (int c = 0; c < qtdProblemas; c++) {
					competicao.setValor(scan.nextInt(), l, c);
				}
			}
			System.out.println(competicao.getNumeroCaracteristicasAlcancadas());
		}
		scan.close();
	}

	public static class Competicao {
		HashMap<Integer, Integer> problemas = new HashMap<>();
		HashMap<Integer, Integer> participantes = new HashMap<>();

		public int getNumeroCaracteristicasAlcancadas() {
			int total = 0;
			boolean ninguemResolveuTodos = true;
			boolean todosResolveramAoMenosUmProblema = true;
			boolean nenhumProblemaResolvidoPorTodos = true;
			boolean todoProblemaFoiResolvidoPeloMenosPorUmaPessoa = true;

			for (int i = 0; i < participantes.size(); i++) {
				if (participantes.get(i) == problemas.size())
					ninguemResolveuTodos = false;
				else if (participantes.get(i) < 1)
					todosResolveramAoMenosUmProblema = false;
			}
			for (int i = 0; i < problemas.size(); i++) {
				if (problemas.get(i) == participantes.size())
					nenhumProblemaResolvidoPorTodos = false;
				else if (problemas.get(i) < 1)
					todoProblemaFoiResolvidoPeloMenosPorUmaPessoa = false;
			}

			if (ninguemResolveuTodos)
				total++;
			if (nenhumProblemaResolvidoPorTodos)
				total++;
			if (todosResolveramAoMenosUmProblema)
				total++;
			if (todoProblemaFoiResolvidoPeloMenosPorUmaPessoa)
				total++;

			return total;
		}

		public void setValor(int valor, int linha, int coluna) {
			setValorDicionario(problemas, coluna, valor);
			setValorDicionario(participantes, linha, valor);
		}

		public void setValorDicionario(HashMap<Integer, Integer> lista, int key, int valor) {
			int resolvidos = 0;
			if (lista.containsKey(key)) {
				resolvidos += lista.get(key);
			}
			lista.put(key, resolvidos + valor);
		}
	}
}