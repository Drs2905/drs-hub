// Java program to find minimum removals
// to make max-min <= K
import java.util.Arrays;

class minmax_k
{
	static int MAX=100;
	static int dp[][]=new int[MAX][MAX];
	
	// function to check all possible combinations
	// of removal and return the minimum one
	static int countRemovals(int a[], int i, int j, int k)
	{
		// base case when all elements are removed
		if (i >= j)
			return 0;
	
		// if condition is satisfied, no more
		// removals are required
		else if ((a[j] - a[i]) <= k)
			return 0;
	
		// if the state has already been visited
		else if (dp[i][j] != -1)
			return dp[i][j];
	
		// when Amax-Amin>d
		else if ((a[j] - a[i]) > k) {
	
			// minimum is taken of the removal
			// of minimum element or removal
			// of the maximum element
			dp[i][j] = 1 + Math.min(countRemovals(a, i + 1, j, k),
									countRemovals(a, i, j - 1, k));
		}
		return dp[i][j];
	}
	
	// To sort the array and return the answer
	static int removals(int a[], int n, int k)
	{
		// sort the array
		Arrays.sort(a);
	
		// fill all stated with -1
		// when only one element
		for(int[] rows:dp)
		Arrays.fill(rows,-1);
		if (n == 1)
			return 0;
		else
			return countRemovals(a, 0, n - 1, k);
	}
	
	// Driver code
	public static void main (String[] args)
	{
		int a[] = { 1, 3, 4, 9, 10, 11, 12, 17, 20 };
		int n = a.length;
		int k = 4;
		System.out.print(removals(a, n, k));
	}
}


