import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun5Words {
    /* Code gets 5 words from the user, puts them in an array,
        and prints the array elements to the screen. */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] userArray = new String[5];

        System.out.println("Enter 5 words");

        for(int i = 0; i < userArray.length; i++) {
            userArray[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(userArray));
    }
}
