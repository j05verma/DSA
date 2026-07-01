package Codes;

public class BuyAndSell {
    public static int maxProfit(int[] prices){
        int n = prices.length;
        int maxProfit = 0;
        int buy = prices[0];
        for(int i = 1; i < n; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else if(prices[i] - buy > maxProfit){
                maxProfit = prices[i] - buy;
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        System.out.println(maxProfit(arr));
    }
}
// time - O(n)
// space - O(1)
