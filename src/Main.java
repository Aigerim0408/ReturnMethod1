import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sozkaitaruu(sc.nextInt()));
    }

    public static String sozkaitaruu(int a) {
        String soz = "Tak san";
        String soz1 = "Jup san";
        if (a % 2 == 1) {
            return soz;
        } else
            return soz1;
    }
}
