package com.example.demo;

public class DemoApplication {

	public static void main(String[] args) {
		DemoApplication demo = new DemoApplication();
		Double[] req = {7.0,1.0,5.0,3.0,6.0,4.0};
		demo.q1(req);
	}

	public void q1(Double[] prices) {
		System.out.println("q1 begin");
		try {
			if (prices == null) {
				System.out.println("input is null.");
				return;
			}
			System.out.println("Price quantity: " + prices.length);

			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("q1 end");
		}
	}
}
