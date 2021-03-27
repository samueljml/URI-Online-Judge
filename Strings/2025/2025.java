import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final String nomeCorreto = "Joulupukki";
		int qtdLinhas = Integer.parseInt(scan.nextLine());
		
		while(qtdLinhas-- > 0) {
			String fraseOriginal = scan.nextLine();	
			String fraseAlterada = fraseOriginal.toString();
			
			int index = -8;
			
			while(true) {
				index += 8;
				index = fraseOriginal.indexOf("oulupukk", index);
				if(index == -1) break;
				
				if(index == 0 || fraseOriginal.charAt(index-1) == ' ') {
					continue;
				}
				
				String nome = fraseOriginal.substring(index-1, index+9);
				fraseAlterada = fraseAlterada.replace(nome, nomeCorreto);
			}
			
			System.out.println(fraseAlterada);
		}
	}
}