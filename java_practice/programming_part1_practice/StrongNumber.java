package JavaPractice;
import java.util.*;

public class StrongNumber {
//   a number is considered as a strong number if you take each digit, calculate its factorial, and sum of all those factorials is same as the original number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int fact = 1;
            int ld = temp % 10;
            for (int i = ld; i > 0; i--) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (num == sum) {
            System.out.println("Strong number");
        }
        else {
            System.out.println("Not a strong number");
        }

    }
}
