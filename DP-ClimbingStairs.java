int solution(int n) {
    // Base case: If n is 1 or 2, there are n distinct ways to climb the stairs.
    if (n <= 2) {
        return n;
    }
    
    // Create an array to store the number of distinct ways for each step.
    int[] dp = new int[n + 1];
    
    // Initialize values for the first two steps.
    dp[1] = 1; // There is only one way to climb 1 step.
    dp[2] = 2; // There are two ways to climb 2 steps: (1, 1) or (2).

    // Fill in the DP array for steps 3 to n.
    for (int i = 3; i <= n; i++) {
        // The number of distinct ways to reach step i is the sum of ways to reach step i-1 and i-2.
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    
    // Return the result, which is stored in dp[n].
    return dp[n];
}
