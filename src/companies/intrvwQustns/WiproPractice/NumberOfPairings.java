package companies.intrvwQustns.WiproPractice;

import java.util.Arrays;

public class NumberOfPairings {
	// Function to find number of ways to
	// pair people in party
	static int findWaysToPair(int p) {
		// To store count of number of ways.
		int dp[] = new int[p + 1];
		dp[1] = 1;
		dp[2] = 2;
		// Using the recurrence defined find
		// count for different values of p.
		for (int i = 3; i <= p; i++) {
			dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
			System.out.println(Arrays.toString(dp));
		}
		return dp[p];
	}
	// Driver code
	public static void main(String args[]) {
		int p = 5;
		System.out.println(findWaysToPair(p));
	}
}
