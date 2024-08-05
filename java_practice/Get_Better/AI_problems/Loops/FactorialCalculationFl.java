package JspidersPractice.Loops;
import java.util.*;

public class FactorialCalculationFl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int factorial = 1;
        int num = sc.nextInt();
        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
