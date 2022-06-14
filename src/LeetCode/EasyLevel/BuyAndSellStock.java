package LeetCode.EasyLevel;

import java.util.Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        BuyAndSellStock stock = new BuyAndSellStock();
        int [] prices = {700,100,500,300,600,400};

        System.out.println("Цена акций с понедельника по субботу: " + Arrays.toString(prices) + ".");
        System.out.println("Цена указана в $ (Долларах США)" + ".");

        System.out.println("Если покупать и продавать акции в течении недели, то можно заработать: " +"$"+stock.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {

        int answer = 0;

        int n = prices.length;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1])
                answer += prices[i] - prices[i - 1];
        }

        return answer;
    }


}
