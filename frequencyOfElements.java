import java.util.*;

public class frequencyOfElements {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 5, 2, 5, 3, 1, 2, 9 };
        int[] q = { 3, 5, 1 , 8 };

        int[] r = frequency(arr, q);

        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
    }
    static int[] frequency(int[] arr, int[] q) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int curr = map.getOrDefault(arr[i], 0);
            map.put(arr[i], curr+1);
        }

        for (int i = 0; i < q.length; i++) {
            q[i] = map.getOrDefault(q[i], 0);
        }

        return q;
    }
}
