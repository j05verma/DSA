package DynamicProgramming;

public class ClimbingStains {
    public static int climbStairs(int n){
        if(n <= 2){
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1");
        int n = 4;
        System.out.println(climbStairs(n));
        System.out.println("Test Case 2");
        int n1 = 3;
        System.out.println(climbStairs(n1));
    }
}
