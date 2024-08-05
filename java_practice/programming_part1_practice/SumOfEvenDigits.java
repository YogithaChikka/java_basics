package JavaPractice;
import java.util.*;

public class SumOfEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int sum = 0;
        while (a > 0) {
            int ld = a % 10;
            if (ld % 2 == 0) {
                sum += ld;
            }
            a /= 10;
        }
        System.out.println("Sum is: " + sum);
    }
}
