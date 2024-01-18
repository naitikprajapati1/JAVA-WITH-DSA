public class SearchElement {
    public static void searchElem(int[] arr, int find) {
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == find) {
                System.out.println("Array find at  index " + i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 21, 23, 45, 67 };
        int find = 23;
        searchElem(arr, find);
    }
}
