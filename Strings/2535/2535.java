import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args){
 
        Scanner scan = new Scanner(System.in);	
        
        while(scan.hasNext()) {
        	String linha = scan.nextLine();
        	if(linha.length() == 0) continue;
        	int numeroFilhotes = Integer.parseInt(linha);
        	int totalFilhotes = 0;
        	
        	for(int i=0; i<numeroFilhotes; i++) {
        		if(i>0) scan.nextLine();
        		String especie = scan.nextLine();
        		String raca = scan.nextLine();
        		String nome = scan.nextLine();
        		
        		if(especie.equals("cachorro")) {
        			if(nome.matches("\\w+ \\w+.*")) {
        				String[] nomes = nome.split(" ");
    				
    					for(String n : nomes) {
        					if(n.charAt(0) == raca.charAt(0)) {
        						totalFilhotes++;
        						break;
        					}
        				}
        			}
        		}
        	}
        	System.out.println(totalFilhotes);
        }
    }
}