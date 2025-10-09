import java.util.*;

public class countOfDuplicateElements {

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 3, 6, 5, 5, 2, 3 };

        int r = count(arr);

        System.out.println(r);
    }

    static int count(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int curr = map.getOrDefault(arr[i], 0);
            map.put(arr[i], curr+1);
        }

        int val = 0;
        for (int i : map.keySet()) {
            if (map.get(i) > 1) {
                int n = map.get(i);
                val += (n * (n - 1)) / 2;
            }
        }

        return val;
    }
}
