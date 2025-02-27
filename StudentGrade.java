import java.util.*;

public class StudentGrade {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Subjects: ");
        int subjectCount = input.nextInt();
        float sum = 0;
        int marks[] = new int[subjectCount];
        System.out.println("Enter your Marks: ");
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Subject " + (i + 1) + " :");
            marks[i] = input.nextInt();
            sum += marks[i];
        }
        float average = sum / subjectCount;
        System.out.println("Total Marks Obtained: " + (int) sum + "/" + (subjectCount * 100));
        System.out.println("Average Percentage: " + average + "%");
        if (average > 90)
            System.out.println("Grade: O");
        else if (average > 80)
            System.out.println("Grade: A+");
        else if (average > 75)
            System.out.println("Grade: A");
        else if (average > 70)
            System.out.println("Grade: B+");
        else if (average > 60)
            System.out.println("Grade: B");
        else if (average >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }
}