package LeetCode;

import java.util.Arrays;

public class OneHundredTwentyOne_Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {
        int[] prices = {2,4,1,5,7,8,66,3,1,2,5,7,8,9,5,6};
        System.out.println(maxProfit(prices));;
    }

    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        for(int i=0;i<prices.length;i++){

           /* buy=Math.min(buy, prices[i]);*/

                if(buy> prices[i]){
                    buy = prices[i];
                }
                if(sell < prices[i]-buy){
                    sell = prices[i] - buy;
                }

            /*sell=Math.max(sell, prices[i]-buy);*/
        }
        return sell;
    }
}
