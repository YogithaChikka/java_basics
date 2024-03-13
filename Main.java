import java.util.Scanner;
public class ScalerAssignments
{
    public static void main(String[] args)
    {

       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();

//        /*   WHILE LOOP  */

        int oddIndexSum = 0;
        int evenIndexSum = 0;
//      calculating the index digit from right to left
        int index = 1;
        while (N>0) {
            int ld = N % 10;
            N/=10;
            if (index % 2 == 0) {
                evenIndexSum += ld;
            }
            else {
                oddIndexSum += ld;
            }
            index++;
        }
        System.out.println("Sum of Odd Index Digit : " + oddIndexSum);
        System.out.println("Sum of Even Index Digit : " + evenIndexSum);
    }
}