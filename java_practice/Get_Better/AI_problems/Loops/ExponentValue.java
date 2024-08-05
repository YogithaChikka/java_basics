package JspidersPractice.Loops;
import java.util.*;

public class ExponentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number: ");
        int base = sc.nextInt();
        System.out.println("Enter power number: ");
        int power = sc. nextInt();
        int exp = 1;
        for (int i = 1; i <= power; i++) {
            exp = exp * base;
        }
        System.out.println("The answer is: " + exp);
    }
}
