import java.util.Scanner;

public class Week13Assignment2FINALS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("enter five numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int highest = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }

        System.out.println("\nthe highest is: " + highest);

        System.out.println("\nthe difference from the highest are:");
        for (int num : numbers) {
            int difference = highest - num;
            System.out.println(highest + " - " + num + " = " + difference);
        }

        scanner.close();
    }
}