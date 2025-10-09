import java.util.*;

public class binarySearch {
  public static void main(String[] args) {
    int[] arr = {1,3,4,5,6,8,10,11,78};
    int min = 0;
    int max = arr.length - 1;
    int target = 8;
    int i = arr[0];

    while (i != target) {
      if (i < target) {
        min = 
        System.out.println(min);
        System.out.println(max);
      } else {
        System.out.println(min);
        System.out.println(max);
      }

      i = arr[max/2];
    }
    System.out.println(min);
  }
}
