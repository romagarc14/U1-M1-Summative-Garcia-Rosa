import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunUserArray {
   /* Code reads 5 ints from the user,
       puts them in an array,
       and prints the array elements to the screen. */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers");

        int[] userArray = new int[5];
        for(int i = 0; i < userArray.length; i++ ) {
            userArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(userArray));
    }
}
