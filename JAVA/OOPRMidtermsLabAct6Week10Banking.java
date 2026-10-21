import java.util.InputMismatchException;
import java.util.Scanner;

public class OOPRMidtermsLabAct6Week10Banking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        boolean settingInitialBalance = true;

        System.out.println("-----[ Welcome to BDO!]-----");
        
        // Loop for initial balance input validation
        while (settingInitialBalance) {
            try {
                System.out.print("@ Enter your balance: ");
                balance = scanner.nextInt();
                if (balance < 0) {
                    System.out.println("[ERROR!] Initial balance cannot be negative");
                } else {
                    settingInitialBalance = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("[ERROR!] Invalid input Please enter a valid whole number.");
                scanner.next(); // Clear the invalid input from scanner buffer
            }
        }

        int choice = 0;
        // Main program loop
        while (choice != 3) {
            System.out.println("\n-------------------------------------------------------------------------");
            System.out.println("@ Select an option:");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Exit");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("Enter choice: ");

            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1: // Withdraw
                        System.out.println("\n@ How much amount you want to withdraw from your account?");
                        System.out.print("Amount: ");
                        int withdrawAmount = scanner.nextInt();

                        if (withdrawAmount <= 0) {
                            System.out.println("[ERROR] Withdrawal amount must be greater than 0.");
                        } else if (withdrawAmount > balance) {
                            System.out.println("[ERROR] Insufficient funds! Your current balance is only: " + balance);
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Transaction Successful! Your new balance is: " + balance);
                        }
                        break;

                    case 2: // Deposit
                        System.out.println("\n@ How much amount you want to deposit in your account?");
                        System.out.print("Amount: ");
                        int depositAmount = scanner.nextInt();

                        if (depositAmount <= 0) {
                            System.out.println("[ERROR] Deposit amount must be greater than 0.");
                        } else {
                            balance += depositAmount;
                            System.out.println("Transaction Successful! Your new balance is: " + balance);
                        }
                        break;

                    case 3: // Exit
                        System.out.println("\nbye bye!");
                        break;

                    default: // Invalid menu choice (e.g., entering 4 or 99)
                        System.out.println("[ERROR] Invalid choice! Please select 1, 2, or 3.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("[ERROR] Invalid input! Please enter a valid number.");
                scanner.next(); // Clear the invalid input from scanner buffer
            }
        }

        scanner.close();
    }
}
