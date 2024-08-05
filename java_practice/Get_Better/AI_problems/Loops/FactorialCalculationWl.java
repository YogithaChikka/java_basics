package JspidersPractice.Loops;
import java.util.*;

public class FactorialCalculationWl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int factorial = 1;
//       Storing num value in a variable to prevent it from changing
        int i = num;
        while (i > 0) {
            factorial *= i;
//       As 'i' value is stored as num, the 'i' value should decrease until it is greater than 0
            i--;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
