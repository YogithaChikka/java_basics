import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {

       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();

//        /*  FOR LOOP  */

//      (My method)
        for (int i = N; i >= 1 ; i--) {
            System.out.print(i + " ");
        }
    }
}