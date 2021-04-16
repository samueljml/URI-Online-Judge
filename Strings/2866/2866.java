import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args){
 
        Scanner scan = new Scanner(System.in);	
        int qtdTestes = scan.nextInt();
        
        while(scan.hasNext()) {
        	String textoDecodificado = new StringBuilder(scan.next().replaceAll("[A-Z]", "")).reverse().toString();
        	System.out.println(textoDecodificado);
        }
 
    }
}