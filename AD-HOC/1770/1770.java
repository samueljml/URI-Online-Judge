import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int qtdMusicasAlbum = scan.nextInt();
            int qtdMusicasPlaylist = scan.nextInt();
            int[] musicasAlbum = nextArray(scan, qtdMusicasAlbum);
            Set<Integer> musicasPlaylist = new HashSet<>();
            boolean naoTemTodasAsFaixas = true;
            int soma = 0;

            for(int i=0; i<qtdMusicasPlaylist; i++) {
                int musicaId = scan.nextInt();

                if(naoTemTodasAsFaixas) {
                    soma += musicasAlbum[musicaId-1];
                    musicasPlaylist.add(musicaId);

                    if(temTodasAsFaixas(musicasPlaylist, qtdMusicasAlbum)) {
                        naoTemTodasAsFaixas = false;
                    }
                }
            }
            if(naoTemTodasAsFaixas) System.out.println("-1");
            else System.out.println(soma);
        }
    }

    private static boolean temTodasAsFaixas(Set<Integer> set, int qtdMusicasAlbum) {
        return set.size() == qtdMusicasAlbum;
    }

    private static int[] nextArray(Scanner scan, int lenght) {
        int[] array = new int[lenght];

        for(int i=0; i<lenght; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
}