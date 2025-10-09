import java.util.*;

public class bubbleSort {
  public static void main(String[] args) {
    int[] arr = {4, 2,6,7,2,1};

    for (int i = 0; i < arr.length - 1; i++) {
      int swaps = 0;
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swaps++;
        }
      }
      if (swaps == 0) {
        break;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
