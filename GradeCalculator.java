import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        
        // Assuming three subjects for this example
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();
        
        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();
        
        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();

        // Calculate Total Marks
        int totalMarks = subject1 + subject2 + subject3;

        // Calculate Average Percentage
        double averagePercentage = totalMarks / 3.0; // Assuming three subjects

        // Grade Calculation
        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
