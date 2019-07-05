import java.util.Scanner;

public class MonthConverterIf {
    // This program converts a number entered by the user into a month.

    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 12");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("January");
        }else if (num == 2) {
            System.out.println("February");
        }else if (num == 3) {
            System.out.println("March");
        }else if (num == 4) {
            System.out.println("April");
        }else if (num == 5) {
            System.out.println("May");
        }else if (num == 6) {
            System.out.println("June");
        }else if (num == 7) {
            System.out.println("July");
        }else if (num == 8) {
            System.out.println("August");
        }else if (num == 9) {
            System.out.println("September");
        }else if (num == 10) {
            System.out.println("October");
        }else if (num == 11) {
            System.out.println("November");
        }else if (num == 12) {
            System.out.println("December");
        }else {
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
    }
}
