import java.util.*;

public class numberToDecimal {
  public static void main(String[] args) {
    int num = 10011; // 
    int base = 2;

    int result = 0;
    int multiplier = 1;
    
    while (num > 0) {
      int digit = num % 10;
      result += digit * multiplier;
      num /= 10;
      multiplier *= base;
    }

    System.out.println(result);
  }
}
