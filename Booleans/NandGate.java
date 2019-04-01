import java.util.Scanner;

public class NandGate{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean a = keyboard.nextBoolean();
        boolean b = keyboard.nextBoolean();

        boolean c = a == false && b == false || a == false && b == true || a == true && b == false;

        System.out.println(c);
    }
}


