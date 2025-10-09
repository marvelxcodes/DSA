import java.util.*;

/**
 * countOfDistictInSubarray
 */
public class countOfDistictInSubarray {

    public static void main(String[] args) {
        int[] a = { 3, 2, 1, 3, 5, 6, 2, 5, 5, 7 };
        int s = 4;

        int[] x = countFaster(a, s);

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    static int[] count(int[] a, int s) {
        int[] result = new int[a.length - s + 1];

        for (int i = 0; i < a.length - s + 1; i++) {
            HashSet<Integer> x = new HashSet<Integer>();
            for (int j = i; j < i + s; j++) {
                x.add(a[j]);
            }
            result[i] = x.size();
        }

        return result;
    }
    static int[] countFaster(int[] a, int s) {
        int[] result = new int[a.length - s + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < s; i++) {
            map.put(a[i], map.getOrDefault(a[i],0) + 1);
        }
        result[0] = map.size();

        int i = 1, e = s;

        while (e < a.length) {
            if (map.get(a[i]) > 1) {
                map.put(a[i], map.get(i) - 1);
            } else {
                map.remove(a[i]);
            }
            map.put(a[e], map.getOrDefault(a[e], 0) + 1);
            
            result[i] = map.size();
            i++;
            e++;
        }

        return result;
    }
}
