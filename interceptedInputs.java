import java.util.*;

public class interceptedInputs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int a = sc.nextInt();
      int xy = a-2;
      int[] vals = new int[a];

      for (int j = 0; j < a; j++) {
        vals[j] = sc.nextInt();
      }

      targetProd(vals, xy);
    }
  }

  public static void targetProd(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            if (num != 0 && target % num == 0) {
                int comp = target / num;
                if (set.contains(comp)) {
                    System.out.println(num + " " + comp);
                    return;
                }
            }
            set.add(num);
        }
    }
}
