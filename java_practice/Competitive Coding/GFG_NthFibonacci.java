package java_practice;
import java.util.*;

public class NthFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        if (n == 0 || n == 1) {
            System.out.println(n);
        }
        else {
            for (int i = 2; i <= n; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println(sum);
        }

    }
}
