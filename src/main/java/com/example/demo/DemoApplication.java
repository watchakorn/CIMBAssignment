package com.example.demo;

public class DemoApplication {

	public static void main(String[] args) {
		DemoApplication demo = new DemoApplication();
		Long[] req = { 7l, 1l, 5l, 3l, 6l, 4l };
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

			// 1. find day to buy.
			Long price = prices[0];
			Long dayToBuy = 0l;
			for (Long l = 0l; l < prices.length; l++) {
				Long curPrice = prices[l.intValue()];
				if (curPrice < price) {
					price = curPrice;
					dayToBuy = l + 1;
				}
			}
			System.out.println("price is " + price + ", dayToBuy is " + dayToBuy);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("q1 end");
		}
	}
}
