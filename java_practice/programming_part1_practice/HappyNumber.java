package java_practice;
import java.util.*;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 9)
        {
            while (num > 0)
            {
                int ld = num % 10;
                sum = sum + (ld * ld);
                num /= 10;
            }
            num = sum;
        }
        if (sum == 1)
        {
            System.out.println("Happy number");
        }
        else {
            System.out.println("Not happy number");
        }
    }
}
