import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String equacao = "";

		while(!equacao.equals("0+0=0")) {
			equacao = scan.nextLine();
			String[] valores = new StringBuilder(equacao).reverse().toString().replace("+", "=").split("=");
			int soma = Integer.parseInt(valores[0]);
			int n1 = Integer.parseInt(valores[1]);
			int n2 = Integer.parseInt(valores[2]);
			
			System.out.println((n1 + n2 == soma) ? "True" : "False");
		}
	}
}