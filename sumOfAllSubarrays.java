import java.util.*;

public class sumOfAllSubarrays {
    public static void main(String[] args) {
        
        int[] a = { 1,2,3,4 };
        int result = sumOfAllSubarray1(a);
        System.out.println(result);
        
    }

    public static int sumOfAllSubarray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int a = 0;

            
            for (int j = i; j < arr.length; j++) {
                a += arr[j];
                sum+=a;
            }
        }

        return sum;
    }

    public static int sumOfAllSubarray1(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * (i + 1) * ( arr.length - i );
        }
        return sum;
    }
}
