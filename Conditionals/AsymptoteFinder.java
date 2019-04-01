import java.util.Scanner;

public class AsymptoteFinder {

    public static void main(String arg[]) {

        Scanner keyboard = new Scanner(System.in);

        int m = keyboard.nextInt();
        int n = keyboard.nextInt();

        if (m == n) {

            System.out.println("Horizantal");

        } else if (n > m) {

            System.out.println("X-axis");

        } else if (m - n == 1) {

            System.out.println("Linear");

        } else if (m - n == 2) {

            System.out.println("Quadratic");

        } else if (m - n == 3) {

            System.out.println("Cubic");

        } else if (m - n == 4) {

            System.out.println("Quartic");

        } else if (m - n == 5) {

            System.out.println("Quintic");


        } else if (m - n == 6) {

            System.out.println("Sextic");

        } else if (m - n == 7) {

            System.out.println("Septic");

        } else if (m - n == 8) {

            System.out.println("Octic");

        } else if (m - n == 9) {

            System.out.println("Nonic");

        } else if (m - n == 10) {

            System.out.println("Decic");

        }
    }
}





