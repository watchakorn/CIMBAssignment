package com.example.demo;

public class DemoApplication {

	public static void main(String[] args) {
		DemoApplication demo = new DemoApplication();
		Long[] req = { 7l, 1l, 5l, 3l, 6l, 4l };
		demo.q1(req, 1l);
	}

	public void q1(Long[] prices, Long dayToBuy) {
		System.out.println("q1 begin");
		try {
			if (prices == null) {
				System.out.println("input is null.");
				return;
			}
			System.out.println("Price quantity: " + prices.length);
			System.out.println("Day to buy: " + dayToBuy);
			if (dayToBuy == 0) {
				return;
			}

			// 1. get price from input day.
			Long price = prices[dayToBuy.intValue()];
			System.out.println("price is " + price);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("q1 end");
		}
	}
}
