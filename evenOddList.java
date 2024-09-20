import java.lang.*;
import java.util.*;

public class evenOddList {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int p = 0; p < x; p++) {

        int n = sc.nextInt();
        int[] arr = new int[n];

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i<n; i++) {
            if (arr[i] % 1 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }

        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < even.size(); i++) {
            System.out.print(even.get(i) + " ");
        }

    }

    }
}
