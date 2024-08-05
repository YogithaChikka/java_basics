package java_practice;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(PrimeChecker(number));
    }
    public static int PrimeChecker(int N) {
        if (N == 1) {
            return 0;
        }
        for (int i = 2; i * i <= N ; i++) {
            if (N % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
