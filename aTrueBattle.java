import java.util.*;

public class aTrueBattle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int y = 0;
      int n = 0;

      int a = sc.nextInt();
      String s = sc.nextLine();

      System.out.println(s + " |");

      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == '0') {
          n++;
        }
        else {
          y++;
        }
      }

      // System.out.println(y > n ? "YES": "NO");
    }
  }
}
