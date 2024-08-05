// package JavaPractice;
import java.util.*;

public class SpyNumber {
//    Sum and product of digits of a number is equal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int pro = 1;
        while (num > 0) {
            int ld = num % 10;
            sum += ld;
            pro *= ld;
            num /= 10;
        }
        if (sum == pro) {
            System.out.println("Spy number");
        }
        else {
            System.out.println("Not a spy number");
        }
    }
}
