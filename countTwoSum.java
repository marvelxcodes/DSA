import java.util.*;

/**
 * countTwoSum
 */
public class countTwoSum {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 5, 4, 5, 4, 5, 6, 8, 6 };
        int t = 10;

        System.out.println(countOfPairs(arr, t));
    }

    static int countOfPairs(int[] arr, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = map.getOrDefault(arr[i] - t, 0);
            x += curr;
            map.put(t - arr[i], curr+1);
        }

        return x;
    }
}
