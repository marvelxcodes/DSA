import java.util.*;

public class starPattern {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = (n*2)-i; j > 1; j--) {
        System.out.print(" ");
      }

      for (int j = 0; j < i*2+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      
      for (int j = (n*4)-i*2; j > 1; j--) {
        System.out.print("*");
      }

      System.out.println();
    }

    for (int i = n; i > 0; i--) {
      for (int j = i; j > 1; j--) {
        System.out.print(" ");
      }
      
      for (int j = (n*4)-i*2; j >= 0; j--) {
        System.out.print("*");
      }

      System.out.println();
    }

    for (int i = n; i > 0; i--) {
      for (int j = 0; j < (n*2)-i; j++) {
        System.out.print(" ");
      }

      for (int j = i*2; j > 1; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
     
  }
}
