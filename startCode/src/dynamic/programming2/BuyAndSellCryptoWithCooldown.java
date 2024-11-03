package dynamic.programming2;

public class BuyAndSellCryptoWithCooldown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProfit(int[] prices) {
        if(prices.length<=1 || prices==null)return 0;
        int n = prices.length;
        int[] buyTodayProfit= new int[n];
        int[] sellTodayProfit= new int[n];
        int[] restTodayProfit= new int[n];
        sellTodayProfit[0]=restTodayProfit[0]=0;
        buyTodayProfit[0]=-prices[0];
        for(int i=1;i<n;i++){
            buyTodayProfit[i]=Math.max(buyTodayProfit[i-1],restTodayProfit[i-1]-prices[i]);
            sellTodayProfit[i]=Math.max(sellTodayProfit[i-1],buyTodayProfit[i-1]+prices[i]);
            restTodayProfit[i]=Math.max(restTodayProfit[i-1],sellTodayProfit[i-1]);

        }
        return sellTodayProfit[n-1];
    }

}
