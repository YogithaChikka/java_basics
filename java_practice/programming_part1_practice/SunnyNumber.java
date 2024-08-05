package java_practice;
import java.util.*;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int nextNum = num + 1;
        boolean isSunnyNumber = false;
        for (int i = 1; i * i <= nextNum ; i++) {
            if (num % i == 0)
            {
                isSunnyNumber = true;
            }
        }
        if (isSunnyNumber)
        {
            System.out.println("Sunny number");
        }
        else
        {
            System.out.println("Not a sunny number");
        }
    }
}
