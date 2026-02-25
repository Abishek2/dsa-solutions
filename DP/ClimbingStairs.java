class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }

    private int helper(int n, int[] memo) {
        if (n <= 2) return n;
        
        // If we already calculated this step, don't do it again!
        if (memo[n] != 0) return memo[n];

        // Store the result in our memo array before returning
        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
        return memo[n];
    }
}