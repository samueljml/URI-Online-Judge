import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static final int quantidadelinhas = 4;
    
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String f = "", l= "";
		String resultado = "";
		List<String> colunas = new ArrayList<>();
		
		for(int i=0; i<quantidadelinhas; i++){
		    String linha = scan.nextLine();
		    f += linha.charAt(0);
		    l += linha.charAt(linha.length()-1);
		    
		    if(i==0) {
		        for(int index=1; index < linha.length()-1; index++){
		            colunas.add(String.valueOf(linha.charAt(index))); 
		        }
		    }
		    else {
		        for(int index=1; index < linha.length()-1; index++){
		            colunas.set(index-1, colunas.get(index-1)+linha.charAt(index));
		        }
		    }
		}
		
		int fValue = Integer.parseInt(f);
		int lValue = Integer.parseInt(l);
		
		for(int i = 0; i<colunas.size(); i++) {
		    int valor = Integer.parseInt(colunas.get(i));
		    resultado += (char) ((fValue * valor + lValue)%257);
		}
	    System.out.println(resultado);
	}
}
