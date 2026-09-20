import java.util.Scanner;

public class activity2 {
    public static void main(String[] args) {      

        Scanner input = new Scanner(System.in);

        System.out.println("1. == Choose ==");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Increment");
        System.out.println("7. Decrement");

        System.out.print("Choose: ");
        int choice = input.nextInt();

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        if (choice == 1) {
            System.out.println(a + b);
        }
        else if (choice == 2) {
            System.out.println(a - b);
        }
        else if (choice == 3) {
            System.out.println(a * b);
        }
        else if (choice == 4) {
            System.out.println(a / b);
        }
        else if (choice == 5) {
            System.out.println(a % b);
        }
        else if (choice == 6) {
            System.out.println(++a);
        }
        else if (choice == 7) {
            System.out.println(--a);
        }

        input.close();
    }
}
