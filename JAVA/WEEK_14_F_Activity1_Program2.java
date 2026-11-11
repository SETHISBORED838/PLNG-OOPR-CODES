import java.util.Scanner;

public class WEEK_14_F_Activity1_Program2 {
    public static void main(String[] args) {

        String[] names = {"Notebook", "Pen", "Folder", "USB"};
        int[] reorder = {5, 10, 5, 2};
        int[] target = {20, 30, 20, 10};
        
        int[] stock = new int[names.length];
        int[] suggestedOrder = new int[names.length];
        boolean[] flagged = new boolean[names.length];
        
        Scanner scanner = new Scanner(System.in);
        
        int totalStock = 0;
        int totalSuggestedOrder = 0;
        
        for (int i = 0; i < names.length; i++) {
            while (true) {
                System.out.print("Enter current stock for " + names[i] + ": ");
                if (scanner.hasNextInt()) {
                    int inputStock = scanner.nextInt();

                    if (inputStock < 0 || inputStock > 10000) {
                        System.out.println("Invalid input! Stock must be between 0 and 10000. Try again.");
                    } else {
                        stock[i] = inputStock;
                        totalStock += inputStock;
                        break; 
                    }
                } else {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    scanner.next(); 
                }
            }
            

            if (stock[i] <= reorder[i]) {
                flagged[i] = true;

                suggestedOrder[i] = target[i] - stock[i];
                totalSuggestedOrder += suggestedOrder[i];
            } else {
                flagged[i] = false;
                suggestedOrder[i] = 0;
            }
        }

        System.out.printf("%-12s | %-12s | %-12s | %-12s | %-10s | %-16s\n", 
                "Product", "Current Stock", "Reorder Lvl", "Target Lvl", "Status", "Suggested Order");
       
        for (int i = 0; i < names.length; i++) {
            String status = flagged[i] ? "FLAGGED" : "OK";
            System.out.printf("%-12s | %-12d | %-12d | %-12d | %-10s | %-16d\n", 
                    names[i], stock[i], reorder[i], target[i], status, suggestedOrder[i]);
        }
        
        System.out.println("Total Units in Stock: " + totalStock);
        System.out.println("Total Suggested Order Units: " + totalSuggestedOrder);
        
        scanner.close();
    }
}
