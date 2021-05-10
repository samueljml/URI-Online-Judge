import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdTestes = scan.nextInt();

        while(qtdTestes-- > 0) {
            int numero = scan.nextInt();
            System.out.printf("%d\n", (int) Math.ceil(numero/2.0));
        }
    }
}