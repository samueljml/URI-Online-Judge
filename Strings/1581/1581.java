import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int casosDeTeste = scan.nextInt();

		while (casosDeTeste-- > 0) {

			byte numeroPessoas = scan.nextByte();
			HashSet<String> idiomaNativo = new HashSet<String>();

			while (numeroPessoas-- > 0) {
				idiomaNativo.add(scan.next());
			}

			if (idiomaNativo.size() > 1)
				System.out.println("ingles");
			else {
				Iterator<String> it = idiomaNativo.iterator();
				System.out.println(it.next());
			}
		}
		scan.close();
	}
}