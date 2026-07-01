package DynamicProgramming;

public class FibonacciNumber {
    public static int fib(int n){
        if (n <= 1){
            return n;
        }
        int prev2 = 0;
        int prev1 = 1;

        for(int i = 2; i <= n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        System.out.println(fib(2)); // 1
        System.out.println(fib(3)); // 2
        System.out.println(fib(4)); // 3
        System.out.println(fib(11)); // 89
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
