package LeetCode;

/*
In order to maximize the profit,
we need to minimize the cost price and maximize the selling price.
So at every step, we keep track of the minimum buy price of stock encountered so far.
For every price, we subtract with the minimum so far and if we get more profit
than the current result, we update the result.
 */

public class BuySellStocks {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(minPrice > prices[i]) minPrice = prices[i];
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}
