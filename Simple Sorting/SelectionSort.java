import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0 ; i < n - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < n ; j++) {
                if (arr[j] < arr[minElementIndex])
                    minElementIndex = j;
            }
            int temp = arr[minElementIndex];
            arr[minElementIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
