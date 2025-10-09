import java.util.*;

public class concentricNumbers {
  public static void main(String[] args) {
    int a = 5;
    int[][] arr = new int[2*a-1][2*a-1];

    for (int i = 0; i < a; i++) {
      
      for (int j = 0; j < a; j++) {
        arr[i][j] = i < j ? a-i:a-j;
      }
    }





    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}










