import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int qtdDigitos = Integer.parseInt(scan.nextLine());
			
			if(qtdDigitos == 0) break;
			
			char tipo = scan.nextLine().charAt(0);
			String saida = "";
			String[][] tabela = {{".*", "*.", "*.", "**", "**", "*.", "**", "**", "*.", ".*"},
								 {"**", "..", "*.", "..", ".*", ".*", "*.", "**", "**", "*."}};
			
			if(tipo == 'S') {
				String entrada = scan.nextLine();
				int[] numeros = new int[qtdDigitos];
				
				for(int i=0; i<qtdDigitos; i++)
					numeros[i] = (int) entrada.charAt(i) - 48;
				
				for(int linha=0; linha<2; linha++) {
				    for(int i=0; i<qtdDigitos-1; i++) {
    					saida += tabela[linha][numeros[i]] + " ";
    				}
				    saida += tabela[linha][numeros[qtdDigitos-1]] + "\n";
				}
				
				for(int i=0; i<qtdDigitos-1; i++){
				    saida += ".. ";
				}
				saida += "..";
			}
			else {
			    String[][] valores = new String[2][qtdDigitos];
			    
                for(int linha=0; linha<2; linha++) {
                    int i = 0;
                    String[] entradas = scan.nextLine().split(" ");
                    
                    for(String entrada : entradas) {
                        valores[linha][i++] = entrada;
                    }
                }
                scan.nextLine();
                
                for(int i=0; i<qtdDigitos; i++) {
                    for(int numero = 0; numero<=9; numero++) {
                    	
                        if(valores[0][i].equals(tabela[0][numero])) {
                            if(valores[1][i].equals(tabela[1][numero])) {
                                saida += numero;
                                break;
                            }
                        }
                    }
                }
			}
			System.out.println(saida);
		}
		scan.close();
	}
}