import java.util.*;
    public class StudentGradeCalculator{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int totalMarks = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Enter marks of subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        float average = (float) totalMarks/n;
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 35) {
            grade = 'D';
        } else {
            grade = 'F'; 
        }
        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + average + "%");
        System.out.println("Grade = " + grade);
    }
}

Output:-
Enter number of subjects: 5
Enter marks of subject 1 (out of 100): 54
Enter marks of subject 2 (out of 100): 65
Enter marks of subject 3 (out of 100): 89
Enter marks of subject 4 (out of 100): 43
Enter marks of subject 5 (out of 100): 56

----- RESULT -----
Total Marks = 307
Average Percentage = 61.4%
Grade = C
