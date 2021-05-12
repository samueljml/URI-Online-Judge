import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int metadeTamanhoBaralho = scan.nextInt()/2;
        int contador = 1, posicaoZero = 1, pos;
        scan.close();

        while (true) {
            contador++;

            if(posicaoZero < metadeTamanhoBaralho) {
                pos = posicaoZero;
                posicaoZero = pos*2+1;
            }
            else {
                pos = posicaoZero - metadeTamanhoBaralho;
                if (pos == 0) {
                    break;
                }
                posicaoZero = pos * 2;
            }
        }
        System.out.println(contador);
    }
}