import java.util.Scanner;

public class AmbigousCase {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        double A = keyboard.nextDouble() * Math.PI / 180;
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();

        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        if (A < Math.PI/2) {

            if (a < h) {

                System.out.println("no solution");

            } else if (a == h) {

                System.out.println("right triangle");

            } else if (a > b) {

                System.out.println("one triangle");

            } else if (h < a && a < b) {

                System.out.println("two triangles");

            }

        } else if (A > Math.PI/2) {

            if (a < b || a == h) {

                System.out.println("no triangle");

            } else if (a > b) {

                System.out.println("one triangle");

            }
        }
    }
}




