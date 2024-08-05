package JspidersPractice.NestedIf;

public class UniversityAdmissions {
    public static void main(String[] args) {
        float gpa = 3.6f;
        if (gpa >= 3.5) {
            System.out.println("Qualified for entrance exam");
            int entranceScore = 76;
            if (entranceScore >= 75) {
                System.out.println("Qualified for interview");
                int interviewScore = 81;
                if (interviewScore >= 80) {
                    System.out.println("Admitted to University");
                }
                else {
                    System.out.println("Not admitted to University :( ");
                }
            }
            else {
                System.out.println("Disqualified for interview");
            }
        }
        else {
            System.out.println("Disqualified for entrance exam");
        }
    }
}
