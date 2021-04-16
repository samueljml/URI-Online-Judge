import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args){
 
        Scanner scan = new Scanner(System.in);	
        
        while(scan.hasNext()) {
        	String texto = scan.nextLine().replaceAll(" ,", ",").replaceAll(" \\.", ".");
        	System.out.println(texto);
        }
 
    }
}