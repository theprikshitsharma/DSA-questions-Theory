import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        mergeSort(arr , 0 , n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr , int start , int end) {

        if (start == end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr , start , mid);
        mergeSort(arr , mid + 1 , end);

        mergingBothParts(arr , start , mid , end);
    }

    private static void mergingBothParts(int[] arr , int start , int mid , int end) {
        int start2 = mid + 1;

        while (start <= mid && start2 <= end) {
            if (arr[start] <= arr[start2]) {
                start++;
            }
            else {  
                int value = arr[start2];
                int idx = start2;

                while (idx != start) {
                    arr[idx] = arr[idx - 1];
                    idx--;
                }

                arr[start] = value;
                start++;
                mid++;
                start2++;

            }
        }
    } 

}
