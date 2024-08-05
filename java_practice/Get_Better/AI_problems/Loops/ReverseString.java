//package JspidersPractice.Loops;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
       String s = sc.nextLine();

//       Empty string to get the reversed string
        String rev = "";

//        'i' = s.length() - 1 bcoz String index starts from 0
//        Eg: dog
//            012  => s.length() = 3
//        charAt(3) -> StringIndexOutOfBounds
        for (int i = s.length() - 1; i >= 0 ; i--) {
            rev += s.charAt(i);
        }
        System.out.println("Reversed word : " + rev);
    }
}
