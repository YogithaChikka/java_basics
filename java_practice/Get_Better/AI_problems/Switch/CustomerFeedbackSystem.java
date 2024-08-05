package JspidersPractice.Switch;
import java.util.Scanner;

public class CustomerFeedbackSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your response: ");
        String response = sc.nextLine();
        switch (response) {
            case "Excellent":
                System.out.println("Customer feedback - Excellent");
                break;
            case "Good":
                System.out.println("Customer feedback - Good");
                break;
            case "Average":
                System.out.println("Customer feedback - Average");
                break;
            case "Poor":
                System.out.println("Customer feedback - Poor");
                break;
            case "Terrible":
                System.out.println("Customer feedback - Terrible");
                break;
            default:
                System.out.println("Invalid response");
        }
    }
}
