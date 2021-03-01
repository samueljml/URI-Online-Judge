import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static int chamadas;
	public static int resultado;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int casosDeTeste = scan.nextInt();
		
		while(casosDeTeste-- > 0) {
			int num = scan.nextInt();
			
			chamadas = -1;
			resultado = 0;
			resultado = fibonaci(num);
			
			System.out.println("fib("+num+") = " + chamadas + " calls = " + resultado);
		}

	}
	
	public static int fibonaci (int num) {
		
		if(num < 0) {
			return 0;
		}
		else if(num<=1){
			chamadas++;
			return num;
		}
		
		chamadas++;
		
		return fibonaci(num-1) + fibonaci(num-2);
	}
}