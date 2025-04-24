import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
         int[] arr = {13,46,24,52,20,9};
         insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0 ; i < n - 1 ; i++) {
            int j = i + 1;
            while ( j > 0 && arr[j - 1] > arr[j]) {
                swap(arr , j);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }

}
