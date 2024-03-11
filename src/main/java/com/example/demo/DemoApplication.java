package com.example.demo;

public class DemoApplication {

	public static void main(String[] args) {
		DemoApplication demo = new DemoApplication();
//		 Long[] req = { 7L, 1L, 5L, 3L, 6L, 4L };
		Long[] req = { 7L, 6L, 5L, 4L, 3L, 1L };
		demo.q1(req);
	}

	public void q1(Long[] prices) {
		System.out.println("q1 begin");
		try {
			if (prices == null) {
				System.out.println("input is null.");
				return;
			}
			System.out.println("Price quantity: " + prices.length);

			// 1. find day to buy and price.
			Long price = prices[0];
			long dayToBuy = 0L;
			for (long l = 0L; l < prices.length; l++) {
				Long curPrice = prices[(int) l];
				if (curPrice < price) {
					price = curPrice;
					dayToBuy = l + 1;
				}
			}
			System.out.println("price is " + price + ", dayToBuy is " + dayToBuy);

			// 2. Find best profit.
			long bestProfit = price;
			if ((int) dayToBuy == prices.length) {
				bestProfit = 0L;
			}
			for (long i = dayToBuy; i < prices.length; i++) {
				Long curPrice = prices[(int) i];

				long curProfit = curPrice - price;
				if (curProfit > bestProfit) {
					bestProfit = curProfit;
				}
			}
			System.out.println("best profit is " + bestProfit);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("q1 end");
		}
	}
}
