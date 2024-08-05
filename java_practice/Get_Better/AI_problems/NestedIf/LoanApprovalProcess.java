package JspidersPractice.NestedIf;

import java.util.Scanner;

public class LoanApprovalProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Credit Score: ");
        int creditScore = sc.nextInt();
        if (creditScore >= 700) {
            System.out.println("Qualified for income verification");
            System.out.println("Enter monthly income: ");
            int monthlyIncome = sc.nextInt();
            if (monthlyIncome >= 5000) {
                System.out.println("Qualified for collateral verification");
                System.out.println("Enter Collateral value: ");
                int collateralValue = sc.nextInt();
                if (collateralValue >= 100000) {
                    System.out.println("Approve the loan");
                }
                else {
                    System.out.println("Loan not approved");
                }
            }
            else {
                System.out.println("Not qualified for collateral verification");
            }
        }
        else {
            System.out.println("Not qualified for income verification");
        }
    }
}
