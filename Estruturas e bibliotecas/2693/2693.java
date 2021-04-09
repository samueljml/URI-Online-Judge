import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int qtdAlunos = scan.nextInt();
			List<Estudante> estudantes = new ArrayList<>();
			
			while(qtdAlunos-- > 0) {
				estudantes.add(new Estudante(scan.next(), scan.next().charAt(0), scan.nextInt()));
			}
			Collections.sort(estudantes);
			
			for(Estudante estudante : estudantes) {
				System.out.println(estudante.nome);
			}
		}
	}
	
	public static class Estudante implements Comparable<Estudante>{
		String nome;
		char regiao;
		int distancia;
		
		public Estudante(String nome, char regiao, int distancia) {
			super();
			this.nome = nome;
			this.regiao = regiao;
			this.distancia = distancia;
		}

		@Override
		public int compareTo(Main.Estudante estudante) {
			if(this.distancia < estudante.distancia) return -1;
			else if(this.distancia > estudante.distancia) return 1;
			else {
				if(this.regiao < estudante.regiao) return -1;
				else if(this.regiao > estudante.regiao) return 1;
				else {
					if(this.nome.compareTo(estudante.nome) < 0) return -1;
					else if(this.nome.compareTo(estudante.nome) > 0) return 1;
					return 0;
				}
			}
		}
	}
}