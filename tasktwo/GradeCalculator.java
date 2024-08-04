package tasktwo;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSubjects;
        System.out.println("                   TASK TWO                       ");
        System.out.println(" ");
        System.out.println("              Student Grade System                  ");
        System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
        // Input: number of subjects
        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();
        
        // Initialize arrays for subjects' marks and grades
        int[] marks = new int[numSubjects];
        String[] subjectGrades = new String[numSubjects];
        
        // Input: marks obtained in each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            subjectGrades[i] = getGrade(marks[i]);
        }
        
        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        
        // Determine overall grade
        String overallGrade = getGrade(averagePercentage);
        
        // Display results
        System.out.println("Results:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Overall Grade: " + overallGrade);
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Subject " + (i + 1) + " Grade: " + subjectGrades[i]);
        }
        
        scanner.close();
    }
    
    private static String getGrade(double percentage) {
        if (percentage >= 91) {
            return "O (Outstanding)";
        } else if (percentage >= 81) {
            return "A+ (Excellent)";
        } else if (percentage >= 71) {
            return "A (Very Good)";
        } else if (percentage >= 61) {
            return "B+ (Good)";
        } else if (percentage >= 56) {
            return "B (Average)";
        } else if (percentage >= 50) {
            return "C (Satisfactory)";
        } else {
            return "RA (Fail)";
        }
    }
}