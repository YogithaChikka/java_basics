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



// EASY POWER (22-03-2024) [for loop-1 Additional problems 4]      
  
      
// import java.util.Scanner;
// public class ScalerAssignments
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();

// //        /*  FOR LOOP  */

//         int ans = 1;
//         for (int i = 1; i <= B; i++) {
//             ans *= A;
//         }
//         System.out.println(ans);
//     }
// }



// MULTIPLICATION TABLE (22-03-2024) [for loop-1 Additional problems 5]                              

                              
// import java.util.Scanner;
// public class ScalerAssignments
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();

// //        /*  FOR LOOP  */

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(A + " * " + i + " = " + (A*i));
//         }
//     }
// } 



// COUNT FACTORS (23-03-2024) [for loop-2 Assignment problems 1]      

      
// import java.util.Scanner;
// public class ScalerAssignments
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();

// //        /*  FOR LOOP  */

//         int count = 0;
//         for (int i = 1; i <= N; i++) {
//             if (N%i==0) {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// } 
                              
                              
                              
// IS IT PRIME? (23-03-2024) [for loop-2 Assignment problems 2]
                              
                              
// import java.util.Scanner;
// public class ScalerAssignments
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();

// //        /*  FOR LOOP  */

//         int countPrime = 0;
//         for (int i = 1; i <= A; i++) {
//             if (A % i == 0) {
//                 countPrime++;
//             }
//         }
//         if (countPrime==2) {
//             System.out.println("YES");
//         }
//         else {
//             System.out.println("NO");
//         }
//     }
// }



// IS IT PERFECT? (24-03-2024) [for loop-2 Assignment problems 3]      


// import java.util.Scanner;
// public class ScalerAssignments
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();

// //        /*  FOR LOOP  */

//         for (int i = T; i > 0; i--) {
//             int N = sc.nextInt();
//             int sumDivisors = 0;
//             for (int j = 1; j <= N/2 ; j++) {
//                 if (N%j==0) {
//                     sumDivisors+=j;
//                 }
//             }
//             if (sumDivisors==N) {
//                 System.out.println("Yes");
//             }
//             else {
//                 System.out.println("No");
//             }
//         }
//     }
// }



// SUM OF ODDS (24-03-2024) [for loop-2 Assignment problems 4]                                   

                                   
// import java.util.Scanner;
// public class ScalerAssignments
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();

// //        /*  FOR LOOP  */

//         int oddSum = 0;
//         for (int i = 1; i <= A; i++) {
//             if (i%2!=0) {
//                 oddSum+=i;
//             }
//         }
//         System.out.println(oddSum);
//     }
// }



// PRINT THE PRIMES (25-03-2024) [for loop-2 Additional problems 1]      
            
 
// import java.util.Scanner;
// public class ScalerAssignments
// {
//     public static void main(String[] args)
//     {

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();

// //        /*  FOR LOOP  */

//         for (int i = 2; i <= N ; i++) {
//             int count = 0;
// //            for (int j = 2; j <= i-1; j++) 
//             for (int j = 2; j <= Math.sqrt(i) ; j++) {
//                 if (i%j==0) {
//                     count++;
//                     break;
//                 }
//             }
//             if (count==0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }