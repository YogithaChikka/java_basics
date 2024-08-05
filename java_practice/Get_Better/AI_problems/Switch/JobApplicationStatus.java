package JspidersPractice.Switch;
import java.util.Scanner;

public class JobApplicationStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Application status: ");
        String status = sc.nextLine();
        switch (status) {
            case "Accepted":
                System.out.println("Your application is accepted");
                break;
            case "Rejected":
                System.out.println("Your application is rejected");
                break;
            case "Under Review":
                System.out.println("Your application is under review");
                break;
            case "Interview Scheduled":
                System.out.println("Interview is scheduled");
                break;
            default:
                System.out.println("Application not received");
        }
    }
}
