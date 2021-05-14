import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Time time1 = new Time(scan.nextInt(), scan.nextInt(), scan.nextInt());
        Time time2 = new Time(scan.nextInt(), scan.nextInt(), scan.nextInt());

        int result = Time.compare(time1, time2);

        if (result == 1) System.out.println("C");
        else if (result == -1) System.out.println("F");
        else System.out.println("=");
    }

    public static class Time {
        int saldo;
        int pontos;

        Time(int vitorias, int empates, int saldo) {
            this.saldo = saldo;
            this.pontos = vitorias * 3 + empates;
        }

        public static int compare(Time time1, Time time2) {

            if (time1.pontos > time2.pontos) {
                return 1;
            }
            else if (time1.pontos < time2.pontos) {
                return -1;
            }

            if (time1.saldo > time2.saldo) {
                return 1;
            }
            else if (time1.saldo < time2.saldo) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }
}
