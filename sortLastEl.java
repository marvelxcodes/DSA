
public class sortLastEl {
	public static void main(String[] args) {
		int[] arr = {3,8,10,12,15,20,5};

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			} else {
				break;
			}
		}

		for (int i = 0; i < arr.length; i++) {

		System.out.println(arr[i]);
		}
	}
}
