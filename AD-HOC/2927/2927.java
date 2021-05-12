import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdAlunos = scan.nextInt();
        int qtdComputadoes = scan.nextInt();
        int qtdComputadoresQueimados = scan.nextInt();
        int qtdComputadoresSemCompilador = scan.nextInt();
        int qtdComputadoresFuncionais = qtdComputadoes - qtdComputadoresQueimados - qtdComputadoresSemCompilador;

        if(qtdComputadoresFuncionais <= qtdAlunos) {
            if(qtdComputadoresQueimados > qtdComputadoresSemCompilador/2) {
                System.out.println("Caio, a culpa eh sua!");
            }
            else {
                System.out.println("Igor bolado!");
            }
        }
        else {
            System.out.println("Igor feliz!");
        }
    }
}
