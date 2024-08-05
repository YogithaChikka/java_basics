package JspidersPractice.Switch;
import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        System.out.println("Enter the month: ");
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
        switch (season) {
            case "March":
            case "April":
            case "May":
            case "June":
                System.out.println(" It is summer season");
                break;
            case "July":
            case "August":
            case "September":
            case "October":
                System.out.println(" It is rainy season");
                break;
            case "November":
            case "December":
            case "January":
            case "February":
                System.out.println("It is winter season");
                break;
        }
    }
}
