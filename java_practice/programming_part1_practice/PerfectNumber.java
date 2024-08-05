package JavaPractice;
import java.util.*;

public class PerfectNumber {
//    Sum of factors should be equal to number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < a ; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (sum == a) {
            System.out.println(a + " is a perfect number");
        }
        else {
            System.out.println(a + " is not a perfect number");
        }
    }
}
