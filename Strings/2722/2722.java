import java.util.Scanner;
 
public class Main {
	
	static int total = 0;
 
    public static void main(String[] args){
 
        Scanner scan = new Scanner(System.in);	
        int qtdTestes = Integer.parseInt(scan.nextLine());
        
        while(qtdTestes-- > 0) {
        	char[] linha1 = scan.nextLine().toCharArray();
        	char[] linha2 = scan.nextLine().toCharArray();
        	int i=0;
        	
        	while(i+1<linha1.length-2){
        		System.out.printf("%c%c", linha1[i], linha1[i+1]);
        		if(i+1 < linha2.length) {
        			System.out.printf("%c%c", linha2[i], linha2[i+1]);
        		}
        		i+=2;
        	}
        	
        	while(i+1<linha1.length) {
        		System.out.printf("%c%c", linha1[i], linha1[i+1]);
        		if(i+1 < linha2.length) {
        			System.out.printf("%c%c", linha2[i], linha2[i+1]);
        		} else {
        			System.out.printf("%c", linha2[i]);
        		}
        		i+=2;
        	}
        	System.out.println();
        }
    }
}