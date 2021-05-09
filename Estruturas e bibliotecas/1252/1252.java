import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		while (true) {
			List<Valor> listaNumeros = new ArrayList<>();
			int qtdNumeros = scan.nextInt();
			int mod = scan.nextInt();

			System.out.println(qtdNumeros + " " + mod);
			if (qtdNumeros == 0 && mod == 0)
				break;

			while (qtdNumeros-- > 0) {
				int numero = scan.nextInt();
				listaNumeros.add(new Valor(numero, mod));
			}
			Collections.sort(listaNumeros);

			for (Valor valor : listaNumeros) {
				System.out.println(valor.numero);
			}
		}
	}

	private static class Valor implements Comparable<Valor> {
		int numero;
		int resto;

		Valor(int numero, int mod) {
			this.numero = numero;
			resto = numero % mod;
		}

		@Override
		public int compareTo(Main.Valor anterior) {
			if (anterior.resto < this.resto)
				return +1;
			if (anterior.resto > this.resto)
				return -1;

			if (anterior.isImpar() && this.isPar())
				return +1;
			else if (anterior.isPar() && this.isImpar())
				return -1;

			if (this.isImpar()) {
				if (anterior.numero > this.numero)
					return +1;
				return -1;
			}
			else {
				if (anterior.numero > this.numero)
					return -1;
				return +1;
			}
		}

		public boolean isImpar() {
			return numero % 2 != 0;
		}

		public boolean isPar() {
			return numero % 2 == 0;
		}
	}
}