import java.util.*;

public class unique {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i]= sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      boolean isFound = false;
      for (int j = i + 1; j < n - 1; j++) {
        if (arr[i] == arr[j]) {
          isFound = true;
          break;
        }
      }

      if (isFound == false) {
        System.out.println(arr[i]);
      }
    }
  }
}
