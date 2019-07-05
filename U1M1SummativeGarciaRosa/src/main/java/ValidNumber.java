import java.util.Scanner;

public class ValidNumber {
    // This program prompts the user for a number between 1 and 10 and keeps asking until the entered number is in range.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int x = scanner.nextInt();

        while(x < 1 || x > 10){
            System.out.println("You must enter a number between 1 and 10, please try again.");
            x = scanner.nextInt();
        }
        System.out.println(x);
    }
}
