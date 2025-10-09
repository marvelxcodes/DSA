import java.util.*;

public class robinHoodAndTheMajorOak {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    
    for (int i = 0; i < t; i++) {
      double n = sc.nextDouble();
      double k = sc.nextDouble();
      // double a = n - k;
      double x = ( k / 2) * ((2 * n) - k + 1);
      System.out.println((int)x % 2 == 0 ? "YES": "No");
    }
  }
}
