import java.util.*;

public class createSpiralMatrix {
  public static void main(String[] args) {
    int[][] matrix = generateMatrix(5);

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(matrix[i][j] + (matrix[i][j] > 9 ? " ": "  "));
      }
      System.out.println();
    }
  }
    public static int[][] generateMatrix(int A) {
        int[][] m = new int[A][A];
        int counter = 1;
        int a = 0,
            b = 0, 
            c = 0,
            d = 0;

        for(int i = 0; i < A; i++) {
            for(int j = i; j < A - a; j++) {
               m[i][j] = counter;
               counter++;
            }
            a++;
            for(int j = i+1; j < A-b; j++) {
              m[j][A-i-1] = counter;
              counter++;
            }
            b++;
            for(int j = i+1; j < A-c; j++) {
              m[A-i-1][A-j-1] = counter;
              counter++;
            }
            c++;
            for(int j = i + 1; j < A-d-1; j++) {
              m[A-j-1][i] = counter;
              counter++;
            }
            d++;
        }

        return m;
    }
}

