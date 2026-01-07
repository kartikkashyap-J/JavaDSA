package array;

public class BestTImeToBuySell {
    public static int bestTimeToBuySell(int[] prices){
        int min=prices[0];
        int profit=0;

        for (int i=0;i<prices.length;i++){
            if (min>prices[i]){
                min=prices[i];
            }
            profit=Math.max(profit,prices[i]-min);
        }
        return profit;
    }
    public static void main(String[] args){
        int[] prices={1,2,3,4,5,7,0};
        System.out.println(bestTimeToBuySell(prices));
    }
}
