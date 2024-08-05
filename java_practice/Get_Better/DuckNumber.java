package JavaPractice;
import java.util.Scanner;

public class DuckNumber {
//     Positive non-zero number that contains zero in it - Duck Number
//     The digit zero should not be present at the starting of the number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String s = sc.nextLine();

//        1. Check if first num is 0, then not duck number
        if (s.charAt(0) == '0') {
            System.out.println(s + " is not a duck number");
        }
        else {
             boolean isDuckNumber = false;
//        2. Check if other number has 0
            for (int i = 1; i < s.length() ; i++) {
                if (s.charAt(i) == '0') {
                    isDuckNumber = true;
                    break;
                }
            }
            if (isDuckNumber) {
                System.out.println(s + " is a duck number");
            }
            else {
                System.out.println(s + " is not a duck number");
            }
        }
    }
}
