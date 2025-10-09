import java.util.*;

public class maxPossiblePair {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 6, 2, 8, 3, 1, 4 }; // 8+6 = 14
    int max = 0;
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[i] + arr[j] > max && i!=j) {
          max = arr[i] + arr[j];
        }
      }
    }
    System.out.println(max);
  }
}
