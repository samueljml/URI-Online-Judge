import java.util.Scanner;
 
public class Main {
	
	static int total = 0;
 
    public static void main(String[] args){
 
        Scanner scan = new Scanner(System.in);	
        int qtdTestes = scan.nextInt();
        
        while(qtdTestes-- > 0) {
        	String[] valores = scan.next().split("x");
        	
        	if(valores[0].equals(valores[1])) {
        		int val = Integer.parseInt(valores[0]);
        		
        		for(int i=5; i<=10; i++) {
        			System.out.println(val + " x " + i + " = " + i*val);
        		}
        	}
        	else {
        		int v1 = Integer.parseInt(valores[0]);
        		int v2 = Integer.parseInt(valores[1]);
        		
        		for(int i=5; i<=10; i++) {
        			System.out.println(v1 + " x " + i + " = " + i*v1 + " && " + v2 + " x " + i + " = " + i*v2);
        		}
        	}
        }
    }
}