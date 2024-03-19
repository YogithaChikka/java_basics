import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {

       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();

//        /*  FOR LOOP  */

//      (My method)
        for (int i = 1; i*4 <= N ; i++) {
            System.out.print(i*4 + " ");
        }

//      (Scaler method)
        for (int i = 1; i <= N ; i++) {
            if (i%4==0)
                System.out.print(i + " ");
        }
    }
}