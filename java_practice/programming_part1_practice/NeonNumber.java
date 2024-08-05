package java_practice;
import java.util.*;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n*n;
        int sum = 0;
        while (temp > 0)
        {
            int ld = temp % 10;
            sum = sum + ld;
            temp /= 10;

        }
        if (n == sum)
        {
            System.out.println("Neon number");
        }
        else
        {
            System.out.println("Not a neon number");
        }
    }
}
