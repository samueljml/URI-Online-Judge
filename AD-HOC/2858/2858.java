import java.util.Scanner;
 
public class Main {
	
    public static void main(String[] args){
 
        Scanner scan = new Scanner(System.in);	
        
        int menor = scan.nextInt();
        int maior = scan.nextInt();
        
        if(menor > maior) {
        	int aux = menor;
        	menor = maior;
        	maior = aux;
        }
        
        int qtdMovimentos = 0;
        int posAtual = 0;
        
        if(menor == 1) {
        	System.out.println(1);
        }
        else if(maior%menor == 0 || mdc(menor, maior) != 1) {
        	System.out.println("IMPOSSIVEL");
        }
        else 
        {
        	while(true) {
        		qtdMovimentos++;
            	if(posAtual < 0) {
            		posAtual += menor;
            	}
            	else {
            		posAtual -= maior;
            	}
            	if(Math.abs(posAtual) == 1) {
            		break;
            	}
            }
            System.out.println(qtdMovimentos);

        }
    }
    
    private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
}