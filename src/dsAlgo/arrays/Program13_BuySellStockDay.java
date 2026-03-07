package dsAlgo.arrays;

public class Program13_BuySellStockDay {

    public static void main(String[] args) {
        int[] arr = {2,4,1};
        Program13_BuySellStockDay obj = new Program13_BuySellStockDay();
        System.out.println("Maximum profit from stock buy and sell = " + obj.maxProfit(arr));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }



        return maxProfit;
    }
}
