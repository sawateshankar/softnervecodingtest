package roundTest;

public class SumAllSubSetXor {

	static int rec(int i, int x, int[] arr, int size) {

		if (i == size) {
			return x;
		}
		int choice1 = rec(i + 1, x ^ arr[i], arr, size);

		int choice2 = rec(i + 1, x, arr, size);
		return choice1 + choice2;
	}

	static int xorSum(int[] arr, int size) {

		return rec(0, 0, arr, size);
	}

	public static void main(String[] args) {

		int[] num = { 1, 5, 6 };
		int size = num.length;
		System.out.println(xorSum(num, size));

	}

}
