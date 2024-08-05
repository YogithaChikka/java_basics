package JspidersPractice.Loops;
import java.util.*;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            System.out.print(sum + ", ");
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}
