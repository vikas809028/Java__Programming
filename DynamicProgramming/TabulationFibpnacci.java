package DynamicProgramming;

public class TabulationFibpnacci {
    public int fib(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        TabulationFibpnacci m = new TabulationFibpnacci();
        int n = 8;
        int result = m.fib(n);
        System.out.println("The " + n + "th number in fibonacci sequence is : " + result);

    }
}
