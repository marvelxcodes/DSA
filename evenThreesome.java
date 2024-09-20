import java.util.*;

public class evenThreesome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int count = 0;

    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++ ) {
        for (int k = j + 1; k < n; k++) {
          if ((arr[i]+arr[j]+arr[k]) % 2 == 0 && (i != k || i !=j || j != k) ) {
            count++;
            System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
          }
        }
      }
    }

    System.out.println(count);
 
  }
}
