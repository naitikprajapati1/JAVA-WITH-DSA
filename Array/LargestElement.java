import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestElement {
    // bruteforce approach
    // tc=>o(nlogn)

    // public static int findLargestElement(int[] arr) {
    // Arrays.sort(arr);
    // return arr[arr.length - 1];
    // }

    public static int findLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 0 };
        System.out.println("Largest element in array is " +
                findLargestElement(arr));
    }
}
