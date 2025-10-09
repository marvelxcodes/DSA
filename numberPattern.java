import java.util.*;

/**
 * numberPattern
 */
public class numberPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = i; j <= n; j++) {
                for (int k = j; k <= n; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
