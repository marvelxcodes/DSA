import java.util.*;

/**
 * firstRepeatingElement
 */
public class firstRepeatingElement {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 2, 5, 3, 1, 2, 9 };
        System.out.println(firstRepeating(arr));

    }

    static int firstRepeating(int[] a) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                return a[i];
            }
            set.add(a[i]);
        }

        return -1;
    }
}
