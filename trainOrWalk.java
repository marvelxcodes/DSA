import java.util.*;

public class trainOrWalk {
  
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();

     for (int i = 0; i < t; i++) {
       int n = sc.nextInt();
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       int p = sc.nextInt();
       int q = sc.nextInt();
       int y = sc.nextInt();

       int[] arr = new int[n];

       for (int j = 0; j < n; j++) {
          arr[j] = sc.nextInt();
       }

       int time = 0;
       int curr = a;

       for (int j = 1; j < n; j++) {

         if (arr[j] == c) {
            
         } else {
           time += (arr[j] - arr[j-1]) * p;
         }

         if (arr[j] == b) {
           break;
         }
       }
       
       System.out.println(time);
     }
  }
}
