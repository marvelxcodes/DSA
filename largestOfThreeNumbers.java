import java.util.*;

public class main {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter Your Number 1: ");
		int num1 = x.nextInt();

		System.out.print("Enter Your Number 2: ");
		int num2 = x.nextInt();

		System.out.print("Enter Your Number 3: ");
		int num3 = x.nextInt();


		System.out.println(num1 >= num2 && num1 > num3 ? num1: num2 >= num1 && num2> num3 ? num2 : num3);
	}

}
