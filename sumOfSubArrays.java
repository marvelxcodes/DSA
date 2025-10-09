import java.util.*;

/*
 1
 3
 6
*/
public class sumOfSubArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int curr = 0;
            for (int j = i; j <= n; j++) {
                System.out.println(j + curr - i);
            }
            curr += i;
        }
    }
}
