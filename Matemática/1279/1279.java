import java.util.Scanner;
import java.math.BigInteger; 

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int casoId = 0;
		
		while(scan.hasNext()) {
		    BigInteger ano = scan.nextBigInteger();
		    boolean bissexto = ano.mod(ano.valueOf(4)).intValue() == 0 && ano.mod(ano.valueOf(100)).floatValue() != 0 || ano.mod(ano.valueOf(400)).intValue() == 0;
		    boolean huluculu = ano.mod(ano.valueOf(15)).intValue() == 0;
		    boolean bulukuluDay = ano.mod(ano.valueOf(55)).intValue() == 0 && bissexto;
		    
		    if(casoId++ > 0) System.out.println();
		    
		    if (!bissexto && !huluculu){
		        System.out.println("This is an ordinary year.");
		        continue;
		    }
		    
		    if(bissexto) {
		        System.out.println("This is leap year.");
		    }
		    if(huluculu) {
		        System.out.println("This is huluculu festival year.");
		    }
		    if(bulukuluDay) {
		        System.out.println("This is bulukulu festival year.");
		    }
		}
	}
}