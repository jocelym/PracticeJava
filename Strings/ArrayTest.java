import java.util.Scanner;

public class ArrayTest {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        String[] userArr = new String[10];
        while (input != 4) {

            if (input == 1) {
                for (int i = 0; i < 10; i++) {
                     userArr[i] = keyboard.nextLine();
                }

            } else if (input == 2) {
                System.out.println(userArr);

            } else if (input == 3) {
                System.out.println(userArr[keyboard.nextInt()]);
            }
        }
    }
}


