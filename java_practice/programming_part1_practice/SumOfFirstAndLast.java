package JavaPractice;
import java.util.*;

public class SumOfFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int ld = num % 10;
        sum += ld;
        while (num > 0) {
            ld = num % 10;
            num /= 10;
        }
        sum += ld;
        System.out.println(sum);
    }
}
