package roundTest;

public class ArrayLeaders {

	public static void main(String[] args) {

		int[] arr = {7,10,4,10,6,5,2};

		int n = 7;

		for (int i = 0; i < n; i++) {
			int j;

			for (j = i + 1; j < n; j++) {
				if (arr[i] <= arr[j]) {
					break;
				}
			}

			if (j == n) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
