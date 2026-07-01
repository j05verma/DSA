package Codes;

public class BuyAndSellBrute {
    public static int bestTimeBuyAndSell(int[] nums){
        int n = nums.length;
        int maxProfit = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int profit = nums[j] - nums[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        System.out.print(bestTimeBuyAndSell(arr));
    }
}
// time - O(n*n)
// space - O(1)