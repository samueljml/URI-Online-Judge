import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		
		 int[][] precoPorFaixaDeConsumo = { {100, 30, 10}, {5, 2, 1}};
		 int consumo = scan.nextInt();
		 int valorConta = 0;
		
		 for(int i=0; i<3; i++) {
			 int faixaDeConsumo = precoPorFaixaDeConsumo[0][i];
			 int preco = precoPorFaixaDeConsumo[1][i];
			
			 if(consumo > faixaDeConsumo) {
				 valorConta += (consumo-faixaDeConsumo)*preco;
				 consumo = faixaDeConsumo;
			 }
		 }
		 valorConta += 7;
		
		 System.out.println(valorConta);
    }
}