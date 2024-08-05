package JavaPractice;
import java.util.*;

public class ArmstrongNumber {
//   Armstrong number: The sum of its own digits each raised to the power of the number of digits.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

//      As num varies in the loop, assigning the num value to 'a'
        int a = num;

//     1. Counting the number of digits
        int count = 0;
        while (a > 0) {
            a /= 10;
            count ++;
        }

//      2. Extracting each ld
        a = num;
        int sum = 0;
        while (a > 0) {
            int digit = a % 10;

//        3. exponential for that ld
            int power = 1;
            for (int i = 0; i < count ; i++) {
                power = power * digit;
            }
//          Adding the power to sum
            sum += power;
            a /= 10;
        }

//      4. Checking if original num is equal to sum
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        }
        else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}