package roundTest;

public class Stock {

	public static void main(String[] args) {

		int prices[] = { 7, 6, 4, 3, 1 };

		int n = 5;
		int buy = prices[0];
		int maxProfit = 0;

		for (int i = 1; i < n; i++) {
			if (buy > prices[i]) {
				buy = prices[i];
			} else if (prices[i] - buy > maxProfit) {
				maxProfit = prices[i] - buy;
			}
		}
		System.out.println(maxProfit);

	}

}
