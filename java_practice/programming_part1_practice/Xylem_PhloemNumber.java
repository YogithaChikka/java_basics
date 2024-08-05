package java_practice;
import java.util.*;

public class Xylem_PhloemNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int eSum = 0;
        int mSum = 0;
        int ld = num % 10;
        num = num / 10;

        while (num > 9) {
            int n = num % 10;
            mSum = mSum + n;
            num /= 10;
        }
        eSum = ld + num;
        if (eSum == mSum)
        {
            System.out.println("Xylem number");
        }
        else
        {
            System.out.println("Phloem number");
        }
    }
}
