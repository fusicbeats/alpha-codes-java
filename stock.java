public class stock {

    public static void stockprice(int prices[]){
        int bPrice=Integer.MAX_VALUE; // buy price
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(bPrice < prices[i]){
                int profit = prices[i] - bPrice; // Today's profit
                maxProfit = Math.max(maxProfit,profit);
            }else{
                bPrice = prices[i];
            }
        }

        System.out.println(maxProfit);
    }

    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        stockprice(prices);
    }
}