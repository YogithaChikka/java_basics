// FIRST VS LAST (15-03-2024) [for loop-1 Assignment problems 1]											      
      
      
// import java.util.Scanner;
// public class Loops
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();

// //        /*  FOR LOOP  */

//         for (int i = 1; i <= T ; i++) {
//             int N = sc.nextInt();
//             int ld = 0;
//             int fd = 0;
//             ld = N%10;
//             for (; N > 0 ; N/=10) {
//                 fd = N%10;
//             }
//             System.out.println(fd+" "+ld);
//         }
//     }
// }      
      
      
// MULTIPLES OF 4 (19-03-2024) [for loop-1 Assignment problems 2]									      
      
      
// import java.util.Scanner;
// public class Loops
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();

// //        /*  FOR LOOP  */
        
// //      (My method)
//         for (int i = 1; i*4 <= N ; i++) {
//             System.out.print(i*4 + " ");
//         }

// //      (Scaler method)
//         for (int i = 1; i <= N ; i++) {
//             if (i%4==0)
//                 System.out.print(i + " ");
//         }
//     }
// }
      
      
// FROM TOP TO BOTTOM (19-03-2024) [for loop-1 Assignment problems 3]										      
      
      
// import java.util.Scanner;
// public class Loops
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();

// //        /*  FOR LOOP  */

//         for (int i = 1; i <= N ; i++) {
//             System.out.print(i + " ");
//         }
//     }
// }
                             
                             
//    FROM DOWN TO TOP (19-03-2024) [for loop-1 Assignment problems 4]								      
									                             
                             
                                                         
// import java.util.Scanner;
// public class Loops
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();

// //        /*  FOR LOOP  */

//         for (int i = N; i >= 1 ; i--) {
//             System.out.print(i + " ");
//         }
//     }
// }
      
      
      
//  SUMMATION GAME (19-03-2024) [for loop-1 Assignment problems 5]       
      
      
// import java.util.Scanner;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();

// //        /*  FOR LOOP  */

//         int sum = 0;
//         for (int i = 1; i <= N ; i++) {
//             sum += i;
//         }
//         System.out.print(sum);
//     }
// }


                                                          
// PALINDROMIC INTEGER (21-03-2024) [for loop-1 Additional problems 1]                             
                             
                             
// import java.util.Scanner;
// public class ScalerAssignments
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();

// //        /*  FOR LOOP  */

//         int num = A;
//         int rev = 0;
//         int ld = 0;
//         for (; A > 0; A/=10) {
//              ld = A%10;
//             rev = rev * 10 + ld;
//         }

//         if (num==rev) {
//             System.out.println("Yes");
//         }
//         else {
//             System.out.println("No");
//         }
//     }
// }    



// ODD GAME (21-03-2024) [for loop-1 Additional problems 2]      
      
            
// import java.util.Scanner;
// public class ScalerAssignments
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();

// //        /*  FOR LOOP  */

//         for (int i = 1; i <= N; i++) {
//             if (i%2!=0) {
//                 System.out.print(i + " ");
//             }
//         }

//     }
// }         



// EVEN GAME (21-03-2024) [for loop-1 Additional problems 3]                              
                              
                              
// import java.util.Scanner;
// public class ScalerAssignments
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();

// //        /*  FOR LOOP  */

//         for (int i = 1; i <= N; i++) {
//             if (i%2==0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }