package JspidersPractice.NestedIf;

import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your GPA: ");
        float gpa = sc.nextFloat();
        if (gpa >= 3.8) {
            System.out.println("Qualified for extracurricular evaluation");
            System.out.println("Enter number of extracurricular activities participated: ");
            int NoOfActivities = sc.nextInt();
            if (NoOfActivities >= 3) {
                System.out.println("Qualified for community service evaluation");
                System.out.println("Enter number of hours of community service: ");
                int NoOfHours = sc.nextInt();
                if (NoOfHours >= 100) {
                    System.out.println("Scholarship is awarded");
                }
                else {
                    System.out.println("Scholarship is not awarded");
                }
            }
            else {
                System.out.println( "Not qualified for community service evaluation");
            }
        }
        else {
            System.out.println("Not qualified for extracurricular evaluation");
        }
    }
}

