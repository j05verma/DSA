package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount){
        if(amount == 0){
            return 0;
        }
        // create dp array dp[i] minimum coin needed
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        // i am checking every amount one by one
        for(int i = 1; i <= amount; i++){
            // number of coins time
            for(int coin : coins){
                // current for amount try every coin
                if(coin <= i){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
    public static void main(String[] args) {
        CoinChange obj = new CoinChange();

        System.out.println("Test Case 1");
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        System.out.println(obj.coinChange(coins1, amount1));
        // Expected: 3 (5 + 5 + 1)

        System.out.println("Test Case 2");
        int[] coins2 = {2};
        int amount2 = 3;
        System.out.println(obj.coinChange(coins2, amount2));
        // Expected: -1

        System.out.println("Test Case 3");
        int[] coins3 = {1, 3, 4};
        int amount3 = 6;
        System.out.println(obj.coinChange(coins3, amount3));
        // Expected: 2 (3 + 3 or 4 + 1 + 1)
    }
}
