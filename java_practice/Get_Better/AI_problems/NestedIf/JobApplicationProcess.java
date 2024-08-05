package JspidersPractice.NestedIf;

import java.util.Scanner;

public class JobApplicationProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your experience: ");
        int exp = sc.nextInt();
        if (exp >= 3) {
            System.out.println("Qualified for written test");
            System.out.println("Enter written test score: ");
            int writtenScore = sc.nextInt();
            if (writtenScore >= 70) {
                System.out.println("Qualified for technical interview");
                System.out.println("Enter your interview score: ");
                int interviewScore = sc.nextInt();
                if (interviewScore >= 75) {
                    System.out.println("Qualified for HR interview");
                    System.out.println("Enter your HR interview score: ");
                    int hriScore = sc.nextInt();
                    if (hriScore >= 81) {
                        System.out.println("Congo! You got the job");
                    }
                    else {
                        System.out.println("You didn't get the job");
                    }
                }
                else {
                    System.out.println("Not qualified for HR interview");
                }
            }
            else {
                System.out.println("Not qualified for technical interview");
            }
        }
        else {
            System.out.println("Not qualified for written test");
        }
    }
}
