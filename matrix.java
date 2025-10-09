import java.util.*;

public class matrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*
     int h = sc.nextInt();
     int w = sc.nextInt();

    int[][] matrix = new int[h][w];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    System.out.println();

    rows(matrix);
    System.out.println();

    
    rotate(matrix);

    rows(matrix);
    System.out.println();

    rowsReverse(matrix);
    System.out.println();

    columns(matrix);
    System.out.println();

    columnsReverse(matrix);
*/
    int[][] m1 = {{1,3},{2,4}};
    int[][] m2 = {{3,2},{1,4}};
    int[][] x = multiply(m1,m2);
    rows(x);
  }

  public static void rows(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void columns(int[][] matrix) {
     for (int i = 0; i < matrix[0].length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println();
    }
  }

  public static void rowsReverse(int[][] matrix) {
     for (int i = matrix.length - 1; i >= 0; i--) {
      for (int j = matrix[0].length - 1; j >= 0; j--) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void columnsReverse(int[][] matrix) {
     for (int i = matrix[0].length - 1; i >= 0; i--) {
      for (int j = matrix.length - 1; j >= 0; j--) {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println();
    }
  }

  public static void transpose(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 2 * i ; j < matrix.length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }

  public static void rotate(int[][] matrix) {
    transpose(matrix);
    int n = matrix.length-1;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length / 2; j++) {
        int temp = matrix[i][n-j];
        matrix[i][n-j] = matrix[i][j];
        matrix[i][j] = temp;
      }
    }
  }

  public static int[][] multiply(int[][] m1, int[][] m2) {
    int[][] result = new int[m1[0].length][m2.length];
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result.length; j++) {
        for (int k = 0; k < result.length; k++) {
          result[i][j] += m1[i][k] * m2[k][j];
        }
      }
    }
    return result;
  }
}
