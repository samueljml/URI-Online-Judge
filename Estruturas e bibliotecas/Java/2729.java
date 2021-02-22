import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		short casosDeTeste = scan.nextShort();
		scan.nextLine();

		while (casosDeTeste-- > 0) {

			String[] produtos = scan.nextLine().split(" ");
			Set<String> listaDeCompras = new TreeSet<String>();

			adicionaProdutosNaLista(listaDeCompras, produtos);

			exibirListaDeCompras(listaDeCompras);

		}
		scan.close();
	}

	public static void adicionaProdutosNaLista(Set<String> listaDeCompras, String[] produtos) {

		for (int i = 0; i < produtos.length; i++) {
			listaDeCompras.add(produtos[i]);
		}
	}

	public static void exibirListaDeCompras(Set<String> listaDeCompras) {

		Iterator<String> it = listaDeCompras.iterator();
		while (it.hasNext()) {
			String produto = it.next();
			if (it.hasNext())
				System.out.print(produto + " ");
			else
				System.out.println(produto);
		}
	}
}