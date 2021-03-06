import java.util.Scanner;

public class Main
{
    public static short numeroDaInstancia = 1;
    public static enum PrimeiroErro { time1, time2, empate };
    
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		short casosDeTeste = Short.parseShort(scan.nextLine());

		while(casosDeTeste-- > 0) {
		    
		    char[] original = scan.nextLine().toCharArray();
		    char[] time1 = scan.nextLine().toCharArray();
		    char[] time2 = scan.nextLine().toCharArray();
		    
		    TelefoneSemFio jogo = new TelefoneSemFio();
		    jogo.gerarPontos(time1, time2, original);
		    
		    String resultado = jogo.getResultado();
		    
		    System.out.println("Instancia " + numeroDaInstancia++);
		    System.out.println(resultado + "\n");
		}
	}
	
	public static class TelefoneSemFio {
	    
	    public byte totalPontosTime1 = 0;
        public byte totalPontosTime2 = 0;
	    public PrimeiroErro primeiroErro = PrimeiroErro.empate;
	    
	    public void gerarPontos(char[] time1, char[] time2, char[] original){
	        boolean firstError = false;
    	    for(byte i=0; i<time1.length; i++) {
    	       
    	        if(time1[i] == time2[i]) {
    	            if(time1[i] == original[i]) {
    	                totalPontosTime1++;
    	                totalPontosTime2++;
    	            }
    	        }
    	        else {
    	            if(time1[i] == original[i]) {
    	                totalPontosTime1++;
    	                setPrimeiroErro(PrimeiroErro.time1);
    	            }
    	            else if(time2[i] == original[i]) {
    	                totalPontosTime2++;
    	                setPrimeiroErro(PrimeiroErro.time2);
    	            }
    	        }
    	    }
	    }
	    
	    public void setPrimeiroErro(PrimeiroErro erro) {
	        if(primeiroErro == PrimeiroErro.empate) {
	            primeiroErro = erro;
	        }
	    }
	    
	    public String getResultado(){
	    
    	    if(totalPontosTime1 > totalPontosTime2) return "time 1";
    	    else if(totalPontosTime2 > totalPontosTime1) return "time 2";
    	    else {
    	        if(primeiroErro == PrimeiroErro.time1) return "time 1";
    	        else if(primeiroErro == PrimeiroErro.time2) return "time 2";
    	        else return "empate";
    	    }
    	}
	    
	}
}
