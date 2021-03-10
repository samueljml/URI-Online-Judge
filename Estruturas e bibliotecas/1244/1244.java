import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
      
      Scanner scan = new Scanner(System.in);
      int casosDeTeste = Integer.parseInt(scan.nextLine());
      
      while(casosDeTeste-- > 0) {
          String palavras[]  = scan.nextLine().split(" ");
          Arrays.sort(palavras, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.length() - s1.length();
            }
          });
          System.out.print(palavras[0]);
          for(int index=1; index<palavras.length; index++) {
              System.out.print(" " + palavras[index]);
          }
          System.out.println();
      }
    }
}