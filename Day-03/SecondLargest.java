public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 7, 5 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println(" Largest: " + largest + " Second " + secondLargest);
    }
}
