import java.util.*;

/**
 * palindromeRecurrsion
 */
public class palindromeRecurrsion {

    public static void main(String[] args) {
        String x = "malayalam";
        System.out.println(isPallindrome(x, 0));
    }

    public static boolean isPallindrome(String s, int i) {
        if (s.length() / 2 < i) return true;
        if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
            return isPallindrome(s, i+1);
        }
        return false;
    }
}
