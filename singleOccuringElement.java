import java.util.*;

/**
 * singleOccuringElement
 */
public class singleOccuringElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 3, 3, 1, 1, 8, 8, 10, 10, 6, 2, 2, 4, 4 };

        System.out.println(find(arr));
    }

    static int find(int[] arr) {
        int min = 0;
        int max = arr.length;

        while (max >= min) {
            int mid = min + (max - min) / 2;

            if (arr[mid + 1] != arr[mid] && arr[mid - 1] != arr[mid]) {
                return arr[mid];
            }

            if (arr[mid] == arr[mid + 1]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1;
    }
}
