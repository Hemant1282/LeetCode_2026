public class BuySellStock_leet7 {

    public static int BuySellStock(int prices []){
        int max_profit = Integer.MIN_VALUE;
        int buying_price = prices[0];
        for(int i = 1;i<prices.length;i++){
            if(buying_price < prices[i]){
                int profit = prices[i] - buying_price;
                max_profit = Math.max(profit,max_profit);
            }
            else{
                buying_price = prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        int result = BuySellStock(prices);
        System.out.println(result);
    }
}
