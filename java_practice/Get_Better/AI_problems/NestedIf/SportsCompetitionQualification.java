package JspidersPractice.NestedIf;

import java.util.Scanner;

public class SportsCompetitionQualification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of wins by a team in preliminary round: ");
        int r1 = sc.nextInt();
        if (r1 >= 5) {
            System.out.println("Qualified for quarterfinals");
            System.out.println("Enter number of wins by a team in quarterfinals round: ");
            int r2 = sc.nextInt();
            if (r2 >= 2) {
                System.out.println("Qualified for semifinals");
                System.out.println("Enter number of wins by a team in semifinals: ");
                int r3 = sc.nextInt();
                if (r3 >= 1) {
                    System.out.println("Qualified for finals");
                }
                else {
                    System.out.println("Not qualified for finals");
                }
            }
            else {
                System.out.println("Not qualified for semifinals");
            }
        }
        else {
            System.out.println("Not qualified for quarterfinals");
        }
    }
}
