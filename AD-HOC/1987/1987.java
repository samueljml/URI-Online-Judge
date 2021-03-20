import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int qtdDigitos = scan.nextInt();
			char[] digitos = scan.next().toCharArray();
			int algarismosSomados = 0;
			
			for(int i=0; i<qtdDigitos; i++) {
				algarismosSomados += digitos[i] - 48;
			}
			if(algarismosSomados%3 == 0) System.out.println(algarismosSomados + " sim");
			else System.out.println(algarismosSomados + " nao");
		}
		scan.close();
	}
}