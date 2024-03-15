import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {

       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();

//        /*  FOR LOOP  */

        for (int i = 1; i <= T ; i++) {
            int N = sc.nextInt();
            int ld = 0;
            int fd = 0;
            ld = N%10;
            for (; N > 0 ; N/=10) {
                fd = N%10;
            }
            System.out.println(fd+" "+ld);
        }
    }
}