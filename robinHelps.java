import java.util.*;

public class robinHelps {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int count = 0;
      int gold = 0;

      for (int j = 0; j < n; j++) {
        int a = sc.nextInt();

        if (a == 0 && gold > 0) {
          count++;
          gold--;
        }
        if (a >= k) {
          gold = gold + a;
        }
      }

      System.out.println(count);
    //   System.out.println(gold);
    }
  }
}
