import java.util.*;

/**
 * missingNumber
 */
public class missingNumber {

    public static void main(String[] args) {
        int[] x = { 3, 6, 1, 4, 2, 7 };

        System.out.println(missing(x));
    }

    public static int missing(int[] x) {

        int result = x[0];
        for (int i = 1; i <= x.length+1;i++) {
            result ^= i;
        }

        for(int i = 1; i < x.length; i++) {
            result ^= x[i];
        }

        return result;
    }
}
