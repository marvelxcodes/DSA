import java.util.*;

public class profitableInterestRate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    
    for (int i = 0; i < t; i++) {
      int amount = sc.nextInt();
      int threshold = sc.nextInt();

      if (amount >= threshold) {
        System.out.println(amount);
        continue;
      }

      int a = 1;
      
      boolean isFound = false;
      while (amount - a >= 0) {
        if (amount - a == threshold - 2 * a) {
          amount = amount - a;
          threshold = threshold - 2 * a;
          isFound = true;
          break;
        } else {
          a++;
        }

      }
      System.out.println(isFound ? amount : 0);
    }
  }
}
