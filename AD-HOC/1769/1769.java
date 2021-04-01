import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			char[] cpf = scan.next().replaceAll("[^0-9]", "").toCharArray();
			
			
			if(validarCPF(cpf)) System.out.println("CPF valido");
			else System.out.println("CPF invalido");
		}
	}

	private static int getNum(char asc) {
		return asc - 48;
	}
	
	private static boolean validarCPF(char[] cpf) {
		int total1 = 0, total2 = 0;
		
		for(int i=0; i<9; i++) {
			total1 += getNum(cpf[i]) * (i+1);
			total2 += getNum(cpf[i]) * (9-i);
		}
		
		if(getNum(cpf[9]) == total1%11%10) {
			if(getNum(cpf[10]) == total2%11%10) {
				return true;
			}
		}
		return false;
	}
}