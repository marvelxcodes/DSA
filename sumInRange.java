import java.util.*;

/**
 * sumInRange
 */
public class sumInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pfArray = prefixArray(arr);

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(getSum(a,b, pfArray));
        }

        sc.close();
    }

    public static int[] prefixArray(int[] arr) {
        int[] result = new int[arr.length];
        int curr = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = curr+arr[i];
            curr += arr[i];
        }
        return result;
    }

    public static int getSum(int i, int j, int[] prefixArr ) {
        return prefixArr[i] - prefixArr[j];
    }
}
