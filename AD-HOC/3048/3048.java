import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;
        int proximoEsperado = 1;

        int tamanhoSequencia = scan.nextInt();

        while(tamanhoSequencia-- > 0) {
            int numero = scan.nextInt();

            if(numero==proximoEsperado) {
                total++;
                if(proximoEsperado == 1) proximoEsperado = 2;
                else proximoEsperado = 1;
            }
        }
        System.out.println(total);
    }
}