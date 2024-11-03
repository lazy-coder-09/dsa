package sliding.window;

public class BuyAndSellCryptoMaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            profit= Math.max(profit, prices[i]-buy);
            buy = Math.min(buy,prices[i]);
        }
        return profit;
    }

}
