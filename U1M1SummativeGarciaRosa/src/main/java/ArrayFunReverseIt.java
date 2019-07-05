import java.util.Arrays;

public class ArrayFunReverseIt {
    /* Code declares the following array [1, 2, 3, 4, 5],
       creates another array of equal length, and fills that array with values
       from the original array but in reverse order. Finally, the code prints
       the contents of both arrays to the screen. */

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("The first array: " + Arrays.toString(arr1));

        int[] arr2 = {arr1[4], arr1[3], arr1[2], arr1[1], arr1[0]};
        System.out.println("The second array: " + Arrays.toString(arr2));


     /* without Arrays.toString
        System.out.println("The first array:");
        int[] arr1 = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("The second array:");
        int[] arr2 = {arr1[4], arr1[3], arr1[2], arr1[1], arr1[0]};
        for(int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        } */
    }
}
