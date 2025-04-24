import java.util.Arrays;
public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        recursiveBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0 ; i < n -1 ; i++) {
            boolean swapped = false;
            for (int j = 0 ; j < (n - i - 1) ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) return;
        }
    }

}
