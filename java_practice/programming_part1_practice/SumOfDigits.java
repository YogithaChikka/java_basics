package JavaPractice;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int sum = 0;
        while (a > 0) {
            int ld = a % 10;
            sum += ld;
            a /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
