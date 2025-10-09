import java.util.*;

public class AGiftFromOrangutan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int m = sc.nextInt();
      int min = sc.nextInt();
      int max = min;
      
      for (int j = 0; j < m - 1; j++) {
        int a = sc.nextInt();
        if (a < min) {
          min = a;
        }
        if (a > max) {
          max = a;
        }
      }

      System.out.println((max-min)* (m - 1));
    }
  }
}
