import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String nomePais = scan.next();
			HashMap<String, String> dicionario = new HashMap<>();
			setDicionario(dicionario);
			
			if(dicionario.containsKey(nomePais)) {
				System.out.println(dicionario.get(nomePais));
			}
			else {
				System.out.println("--- NOT FOUND ---");
			}
			
		}
	}
	
	public static void setDicionario(HashMap<String, String> dicionario) {
	    dicionario.put("brasil","Feliz Natal!");
	    dicionario.put("alemanha","Frohliche Weihnachten!");
	    dicionario.put("austria","Frohe Weihnacht!");
	    dicionario.put("coreia","Chuk Sung Tan!");    
	    dicionario.put("espanha","Feliz Navidad!");
	    dicionario.put("grecia","Kala Christougena!");
	    dicionario.put("estados-unidos","Merry Christmas!");
	    dicionario.put("inglaterra","Merry Christmas!");
	    dicionario.put("australia","Merry Christmas!");
	    dicionario.put("portugal","Feliz Natal!");
	    dicionario.put("suecia","God Jul!");
	    dicionario.put("turquia","Mutlu Noeller");
	    dicionario.put("argentina","Feliz Navidad!");
	    dicionario.put("chile","Feliz Navidad!");
	    dicionario.put("mexico","Feliz Navidad!");
	    dicionario.put("antardida","Merry Christmas!");
	    dicionario.put("canada","Merry Christmas!");  
	    dicionario.put("irlanda","Nollaig Shona Dhuit!");
	    dicionario.put("belgica","Zalig Kerstfeest!");
	    dicionario.put("italia","Buon Natale!");
	    dicionario.put("libia","Buon Natale!");
	    dicionario.put("siria","Milad Mubarak!");
	    dicionario.put("marrocos","Milad Mubarak!");
	    dicionario.put("japao","Merii Kurisumasu!");  
	}
}
