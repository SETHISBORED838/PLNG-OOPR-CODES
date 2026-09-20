import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Activity1Week5 {
 public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = br.readLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        System.out.print("Enter third word: ");
        String word3 = sc.nextLine();

        System.out.println(word1 + " " + word2 + " " + word3);
    }
}