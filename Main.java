// FIRST VS LAST (15-03-2024) [for loop-1 Assignment problems 1]											      
      
      
import java.util.Scanner;
public class ScalerAssignments
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
      
      
// MULTIPLES OF 4 (19-03-2024) [for loop-1 Assignment problems 2]									      
      
      
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

      
      
// FROM TOP TO BOTTOM (19-03-2024) [for loop-1 Assignment problems 3]										      
      
      
       int N = sc.nextInt();

//        /*  FOR LOOP  */

//      (My method)
        for (int i = 1; i <= N ; i++) {
            System.out.print(i + " ");
        }

                             
                             
// FROM DOWN TO TOP (19-03-2024) [for loop-1 Assignment problems 4]								      
									                             
                            
       int N = sc.nextInt();

//        /*  FOR LOOP  */

//      (My method)
        for (int i = N; i >= 1 ; i--) {
            System.out.print(i + " ");
        }
      
      
      
// SUMMATION GAME (19-03-2024) [for loop-1 Assignment problems 5]       
      
