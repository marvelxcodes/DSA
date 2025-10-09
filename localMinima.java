import java.util.*;

/**
 * localMinima
 */
public class localMinima {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findLocalMinima(arr));
        sc.close();
    }

    public static int findLocalMinima(int[] arr) {
        int min = 0;
        int max = arr.length - 1;

        while (max >= min) {
            int mid = min + (max - min) / 2;

            if (mid == 0 && arr[mid+1] > arr[mid] || mid==arr.length-1 && arr[mid-1] > arr[mid]) {
                return mid;
            }

            if (arr[mid] < arr[mid-1] && arr[mid] < arr[mid + 1]) {
                return mid;
            }

            if (arr[mid - 1] < arr[mid + 1]) {
                max = mid-1;
            } else {
                min = mid+1;
            }

        }
        return -1;
    }
}
