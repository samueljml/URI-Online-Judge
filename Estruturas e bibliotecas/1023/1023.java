import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main
{
	public static int numeroDaCidade = 1;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.0000");

		while(true) {
		    
		    int quantidadeDeImoveis = scan.nextInt();		    
		    if(quantidadeDeImoveis == 0) break;
		    if(numeroDaCidade > 1) System.out.println();
		    
		    TreeMap<Integer, Integer> consumoImovel = new TreeMap<>();
		    float totalMoradores = 0;
		    float totalConsumo = 0;
		
    		while(quantidadeDeImoveis-- > 0) {

    			int qtdMoradores = scan.nextInt();
    			int consumoPorImovel = scan.nextInt();
    			int consumoMedio = consumoPorImovel / qtdMoradores;
    			
    			totalConsumo += consumoPorImovel;
    			totalMoradores += qtdMoradores;
                
    			if(consumoImovel.containsKey(consumoMedio)) {
    				consumoImovel.put(consumoMedio, consumoImovel.get(consumoMedio) + qtdMoradores);
    			}
    			else consumoImovel.put(consumoPorImovel/qtdMoradores, qtdMoradores);
    		}
    		
			String saidaMediaConsumo = "";
			
			for(Map.Entry<Integer, Integer> entry : consumoImovel.entrySet()) {
				saidaMediaConsumo += (entry.getValue() + "-" + entry.getKey() + " ");
			}
			
			String consumoMedio = df.format((totalConsumo / totalMoradores));
			
			consumoMedio = consumoMedio.substring(0, consumoMedio.length() - 2);
			saidaMediaConsumo = saidaMediaConsumo.substring(0, saidaMediaConsumo.length()-1);
			
			System.out.printf("Cidade# %d:\n", numeroDaCidade++);
			System.out.println(saidaMediaConsumo);
			System.out.printf("Consumo medio: %s m3.\n", consumoMedio);
		}
		scan.close();
	}
}