import java.util.*;

public class main {
  
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();

     for (int i = 0; i < t; i++) {
       int n = sc.nextInt();
       int[] arr = new int[n];

       for (int j = 0; j < n; j++) {
          arr[j] = sc.nextInt();
       }

       Arrays.sort(arr);

       long sum = 0;
       for (int j = 0; j < n/2; j++) {
          sum += Math.abs(arr[j] - arr[n-j-1]);
       }

       System.out.println(sum);
     }
  }
}
