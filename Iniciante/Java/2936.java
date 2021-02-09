import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    int totalGramasDeMandioca = 225;
	    int[] gramasPorPorcao = { 300, 1500, 600, 1000, 150 };
		
		Scanner scan = new Scanner(System.in);
		
		for (int convidadoId=0; convidadoId<5; convidadoId++) {
		    
		    int quantidadeDeMandiocas = scan.nextInt();
		    totalGramasDeMandioca += quantidadeDeMandiocas * gramasPorPorcao[convidadoId];
		} 
		
		System.out.println(totalGramasDeMandioca);
	}
}