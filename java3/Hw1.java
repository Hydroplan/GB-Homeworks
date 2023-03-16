import java.util.Arrays;

public class Main {

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            rightArr[i - mid] = arr[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int nLeft = leftArr.length;
        int nRight = rightArr.length;
        int i = 0, j = 0, k = 0;
        while (i < nLeft && j < nRight) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < nLeft) {
            arr[k++] = leftArr[i++];
        }
        while (j < nRight) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 7, 1, 3, 9, 6, 5, 6};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}