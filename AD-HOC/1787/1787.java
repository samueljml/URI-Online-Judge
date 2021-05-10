import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int numeroRodadas = scan.nextInt();
            int[] pontos = new int[3];
            int[] integrantes = new int[3];
            int maior;
            int maiorId;

            if(numeroRodadas == 0) break;

            while(numeroRodadas-- > 0) {
                maior = -1;
                maiorId = -1;

                for (int i=0; i<3; i++) {
                    integrantes[i] = scan.nextInt();

                    if(integrantes[i] > maior) {
                        maior = integrantes[i];
                        maiorId = i;
                    }

                    if(isPotenciaDe2(integrantes[i])) {
                        pontos[i]++;
                    }
                }
                if(isPotenciaDe2(integrantes[maiorId])){
                    pontos[maiorId]++;
                }
            }

            maior = -1;
            maiorId = -1;
            int qtd = 0;
            for(int i=0; i<3; i++) {
                if(pontos[i] > maior) {
                    maior = pontos[i];
                    maiorId = i;
                }
            }

            for(int i=0; i<3; i++) {
                if(pontos[i] == maior) {
                    qtd++;
                }
            }

            if(qtd == 1) {
                switch (maiorId) {
                    case 0: System.out.println("Uilton");
                        break;
                    case 1: System.out.println("Rita");
                        break;
                    case 2: System.out.println("Ingred");
                        break;
                }
            }
            else {
                System.out.println("URI");
            }
        }
    }

    public static boolean isPotenciaDe2(int n)
    {
        int min = (int)(Math.log(n) / Math.log(2));

        return (Math.pow(2, min+1) == n || Math.pow(2, min) == n);
    }
}