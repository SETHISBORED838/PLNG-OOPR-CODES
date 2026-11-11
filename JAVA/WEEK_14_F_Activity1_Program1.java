import java.util.Scanner;

public class WEEK_14_F_Activity1_Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numStudents = 0;
        while (true) {
            System.out.print("Enter the number of students (1-50): ");
            if (scanner.hasNextInt()) {
                numStudents = scanner.nextInt();
                if (numStudents >= 1 && numStudents <= 50) {
                    break;
                }
            } else {
                scanner.next(); 
            }
            System.out.println("Invalid number of students. Please enter a value between 1 and 50.");
        }

        int[] scores = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            while (true) {
                System.out.print("Enter score for Student " + (i + 1) + " (0-100): ");
                if (scanner.hasNextInt()) {
                    int score = scanner.nextInt();

                    if (score >= 0 && score <= 100) {
                        scores[i] = score;
                        break;
                    }
                } else {
                    scanner.next(); 
                }
                System.out.println("Invalid input. Please enter a score from 0 to 100.");
            }
        }

        int totalSum = 0;
        int highestScore = scores[0];
        int lowestScore = scores[0];
        int passingCount = 0;
        int failingCount = 0;

        for (int i = 0; i < numStudents; i++) {
            int currentScore = scores[i];
     
            totalSum += currentScore;

            if (currentScore > highestScore) {
                highestScore = currentScore;
            }

            if (currentScore < lowestScore) {
                lowestScore = currentScore;
            }

            if (currentScore >= 75) {
                passingCount++;
            } else {
                failingCount++;
            }
        }

        double averageScore = (double) totalSum / numStudents;

        System.out.println("\n--- Statistical Summary ---");
        System.out.printf("Average Score: %.2f\n", averageScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Passing Scores (>= 75): " + passingCount);
        System.out.println("Failing Scores (< 75): " + failingCount);

        System.out.print("Student(s) tied for the highest score: ");
        boolean first = true;
        for (int i = 0; i < numStudents; i++) {
            if (scores[i] == highestScore) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print("Student " + (i + 1));
                first = false;
            }
        }
        System.out.println();
        
        scanner.close();


    }
}
