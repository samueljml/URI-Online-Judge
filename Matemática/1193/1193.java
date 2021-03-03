import java.util.Scanner;

public class Main {
	
	public static int caseValue = 1;
	
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
		int casosDeTeste = scanner.nextInt();
		
		while(casosDeTeste-- > 0) {
			
			String valor = scanner.next();
			int baseDeEntrada = getBaseDeEntrada(scanner.next());
			int[] basesDeSaida = {10, 16, 2};
			
			System.out.printf("Case %d:\n", caseValue++);
			
			for(byte i = 0; i<3; i++) {
				if(basesDeSaida[i] != baseDeEntrada) mostrarBaseConvertida(valor, baseDeEntrada, basesDeSaida[i]);
			}
			System.out.println();
		}
	}
	
	public static int getBaseDeEntrada(String base) {
		
		if(base.equals("bin")) return 2;
		else if(base.equals("dec")) return 10;
		else return 16;
	}	
	
	public static String getBase(int base) {
		
		if(base == 2) return "bin";
		else if(base == 10) return "dec";
		else return "hex";
	}
	
	public static void mostrarBaseConvertida(String valor, int baseDeEntrada, int baseDeSaida) {
		String valorConvertido = Integer.toString( Integer.parseInt(valor, baseDeEntrada), baseDeSaida);
		String base = getBase(baseDeSaida);
		
		System.out.println(valorConvertido + " " + base);
	} 
}