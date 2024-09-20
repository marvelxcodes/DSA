import java.util.*;

public class equality {
	public static void main(String[] args) {
		int[] a1 = { 1 , 2, 3 };
		int[] a2 = { 1, 2, 3 };
		boolean isEqual = true;

		for (int i = 0; i< a1.length; i++) {
			if (a1[i] != a2[i]) {
				isEqual = false;
		
			}
		}

		System.out.println(isEqual);
	}
}


