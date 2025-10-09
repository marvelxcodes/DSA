import java.util.*;

public class twice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    
    for (int i = 0; i < t; i++) {
      HashMap<Integer, Integer> frequency = new HashMap<>();
      int n = sc.nextInt();
      for (int j = 0; j < n; j++) {
        int x = sc.nextInt();
        
        if (frequency.get(x) == null){
          frequency.put(x, 1);
        } else {
          frequency.put(x, frequency.get(x) + 1);
        }
      }

      int score = 0;
      
      for (int val : frequency.values()) {
        score += val/2;
      }

      System.out.println(score);
    }
  }
}
