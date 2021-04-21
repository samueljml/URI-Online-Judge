import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
	
    public static void main(String[] args){
 
    	int[][] tabuleiro = new int [8][8];
    	inserirBuracos(tabuleiro);
        Scanner scan = new Scanner(System.in);	
           
        int numeroMovimentos = scan.nextInt();
        
    	List<Integer> movimentos = new ArrayList<>();
        
        for (int i = 0; i < numeroMovimentos; i++) {
			movimentos.add(scan.nextInt());
		}
        
        Posicao pos = new Posicao(4, 3);
        int totalMovimentos = 0;
        
        for (int movimento : movimentos) {
        	getProximaPoicao(pos, movimento);
        	totalMovimentos++;
        	
        	if(tabuleiro[pos.x][pos.y] == 1) {
         		break;
         	}
		}
        
        System.out.println(totalMovimentos);
    }
    
    public static void inserirBuracos(int[][] tabuleiro) {
		tabuleiro[1][3] = 1;
		tabuleiro[2][3] = 1;
		tabuleiro[2][5] = 1;
		tabuleiro[5][4] = 1;
	}
    
    public static void getProximaPoicao(Posicao pos, int movimento) {
    	if(movimento == 1) {
    		pos.x += 1;
    		pos.y += 2;
    	}
    	else if(movimento == 2) {
    		pos.x += 2;
    		pos.y += 1;
    	}
    	else if(movimento == 3) {
    		pos.x += 2;
    		pos.y -= 1;
    	}
    	else if(movimento == 4) {
    		pos.x += 1;
    		pos.y -= 2;
    	}
    	else if(movimento == 5) {
    		pos.x -= 1;
    		pos.y -= 2;
    	}
    	else if(movimento == 6) {
    		pos.x -= 2;
    		pos.y -= 1;
    	}
    	else if(movimento == 7) {
    		pos.x -= 2;
    		pos.y += 1;
    	}
    	else {
    		pos.x -= 1;
    		pos.y += 2;
    	}
    }
    
    public static class Posicao {
		public int x;
    	public int y;
    	
		public Posicao(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
    }
}