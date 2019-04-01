import java.util.Scanner;

public class HeronsFormula {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        double area = (Math.sqrt(4 * Math.pow(a, 2) * Math.pow(b, 2) - Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)), 2)))/4;

        System.out.println(area);

    }
}




