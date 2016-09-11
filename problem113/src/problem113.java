import java.util.Scanner;

/**
 * Created by Brian Martinez on 9/11/2016.
 */
public class problem113 {
    static Scanner console = new Scanner(System.in);

    public static void main(String [] args) throws Exception
    {
        int num1, num2, num3 = 0;

        // Input the two numbers
        System.out.println("Input your first number.");
        num1 = console.nextInt();

        System.out.println("Input your second number.");
        num2 = console.nextInt();

        System.out.println("Input your third number.");
        num3 = console.nextInt();

        if (num1 == num2 && num1 == num3)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
