package com.example.demo;

public class DemoApplication {

    public static void main(String[] args) {
        DemoApplication demo = new DemoApplication();
        int[] req1 = {7, 1, 5, 3, 6, 4};
        demo.q1(req1);
        int[] req2 = {7, 6, 5, 4, 3, 1};
        demo.q1(req2);

        demo.q2("1.01", "1.001");
        demo.q2("1.0", "1.0.0");
        demo.q2("0.1", "1.1");
    }

    public void q1(int[] prices) {
        System.out.println("q1 begin");
        try {
            if (prices == null) {
                System.out.println("input is null.");
                return;
            }
            System.out.println("Price quantity: " + prices.length);

            // 1. find day to buy and price.
            int price = prices[0];
            int dayToBuy = 0;
            for (int l = 0; l < prices.length; l++) {
                int curPrice = prices[l];
                if (curPrice < price) {
                    price = curPrice;
                    dayToBuy = l + 1;
                }
            }
            System.out.println("price is " + price + ", dayToBuy is " + dayToBuy);

            // 2. Find best profit.
            int bestProfit = price;
            if (dayToBuy == prices.length) {
                bestProfit = 0;
            }
            for (int i = dayToBuy; i < prices.length; i++) {
                int curPrice = prices[i];

                int curProfit = curPrice - price;
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

    public void q2(String version1, String version2) {
        System.out.println("q2 begin");
        System.out.println("version1 is " + version1 + ", version2 is " + version2);
        String regex = "^(\\d+)(\\.(\\d+)(\\.(\\d+))?)?(\\-(\\w+)(-(\\w+))?)?$";
        if (version1 == null || version2 == null) {
            System.out.println("version1 or version2 is null.");
            return;
        }
        if (version1.length() > 500 || version2.length() > 500) {
            System.out.println("version1 or version2 has length more than 500.");
            return;
        }
        if (!version1.matches(regex) || !version2.matches(regex)) {
            System.out.println("version1 or version2 is not a valid version number");
            return;
        }
        String[] version1Arr = version1.split("\\.");
        String[] version2Arr = version2.split("\\.");
        int length = Math.min(version1Arr.length, version2Arr.length);
        int result = 0;
        for (int i = 0; i < length; i++) {
            int v1 = Integer.parseInt(version1Arr[i]);
            int v2 = Integer.parseInt(version2Arr[i]);
            if (v1 < v2) {
                result = -1;
                break;
            } else if (v1 > v2) {
                result = 1;
                break;
            }
        }

        System.out.println("Result is " + result);
        System.out.println("q2 end");
    }


    public void q3(int n) {
        System.out.println("q3 begin");
        System.out.println("input n = " + n);
        if (n < 1 || n > 45) return;


        System.out.println("q3 end");
    }

}
