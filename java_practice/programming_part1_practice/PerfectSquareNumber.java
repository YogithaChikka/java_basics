package java_practice;
import java.util.*;
public class PerfectSquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPerfectNumber = false;
        for (int i = 1; i * i <= num ; i++) {
            if (num % i == 0)
            {
                isPerfectNumber = true;
            }
        }
        if (isPerfectNumber)
        {
            System.out.println("Perfect square number");
        }
        else
        {
            System.out.println("Not perfect square number");
        }
    }
}
