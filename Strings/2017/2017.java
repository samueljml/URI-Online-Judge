import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner scan = new Scanner(System.in);
    	char[] linha = scan.nextLine().toCharArray();
    	int diferencaMaxima = Integer.parseInt(scan.nextLine());
    	
    	int menorDiferencaValida = 101;
    	int stringId = 0;
    	
    	for(int caso=0; caso<5; caso++) {
    		char[] linha2 = scan.nextLine().toCharArray();
    		int count = 0;
    		
    		for(int i=0; i<linha.length; i++) {
    			if(linha[i] != linha2[i]) count++;
    			if(count > diferencaMaxima) {
    				count = -1;
    				break;
    			}
    		}
    		
    		if(count != -1 && count < menorDiferencaValida) {
    			menorDiferencaValida = count;
    			stringId = caso+1;
    		}
    	}
    	
    	if(menorDiferencaValida != 101) {
    		System.out.println(stringId);
    		System.out.println(menorDiferencaValida);
    	}
    	else {
    		System.out.println("-1");
    	}
    }
}