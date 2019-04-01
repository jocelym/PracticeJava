import java.util.Scanner;

public class QuadraticFormula {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();

        System.out.println((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a));
        System.out.println((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a));

    }
}



