import java.util.*;

public class goodSubarray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5};
    int good = 0;
    int b = 2;

    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j++) {
        sum+=arr[j];

        if ((j-i+1) % 2 == 0 && b > sum) {
          good++;
        }
        if ((j-i+1) % 2 == 1 && b < sum) {
           good++;
        }
      }
    }

    System.out.println(good);
  }
}
