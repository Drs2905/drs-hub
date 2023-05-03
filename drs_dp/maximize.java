// Java Code to find maximum number of cut segments
// Memoization DP
import java.util.*;

class maximize {

	// Function to find the maximum number of cuts.
	static int[] dp;

	static int func(int l, int p, int q, int r)
	{
		if (l == 0)
			return 0; // Base Case

		if (dp[l] != -1) // If already memoized
			return dp[l];

		int a, b, c; // Intitialise a,b,& c with INT_MIN
		a = Integer.MIN_VALUE;
		b = Integer.MIN_VALUE;
		c = Integer.MIN_VALUE;
		if (p <= l) // If Possible to make a cut of length p
			a = func(l - p, p, q, r);

		if (q <= l) // If possible to make a cut of length q
			b = func(l - q, p, q, r);

		if (r <= l) // If possible to make a cut of length r
			c = func(l - r, p, q, r);

		return dp[l] = 1
					+ Math.max(Math.max(a, b),
								c); // Memoize & return
	}

	static int maximizeTheCuts(int l, int p, int q, int r)
	{
		Arrays.fill(dp, -1); // Set Lookup table to -1
		int ans = func(l, p, q, r); // Utility function call

		if (ans < 0)
			return 0; // If returned answer is negative ,
					// that means cuts are not possible
		return ans;
	}

	// Driver code
	public static void main(String[] args)
	{
		dp = new int[10005];
		int l = 11, p = 2, q = 3, r = 5;
		System.out.println(maximizeTheCuts(l, p, q, r));
	}
}
