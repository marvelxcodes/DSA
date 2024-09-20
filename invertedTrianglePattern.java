import java.util.*;

public class invertedTrianglePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (j % 2 == 1) {
          System.out.print((j+1)/2);
        } else {
          System.out.print("*");
        }
        if (j < n) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
