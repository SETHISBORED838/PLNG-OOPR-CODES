import java.util.Scanner;

public class ACTIVITY1OOPR {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            double java, c , database, average;

            System.out.println("--GRADE CALCULATOR--");

            System.out.print("Enter Your Java Programming Score: ");
            java = sc.nextDouble();
            
            System.out.print("Enter Your C Programming Score: ");
            c = sc.nextDouble();
            
            System.out.print("Enter Your Database Programming Score: ");
            database = sc.nextDouble();
            
            average = (java + c + database) / 3;
            
            System.out.println("Your Average is: " + average);

            if (average >= 90)
                System.out.println("-- Your Grade is: A --");
            else if (average >= 80)
                System.out.println("-- Your Grade is: B --");
            else if (average >= 75)
                System.out.println("-- Your Grade is: C --");
            else
                System.out.println("-- Your Grade is: F --");

                
        }
    }
}