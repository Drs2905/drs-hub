// Java Program to find the length of
// substring with maximum difference of
// zeroes and ones in binary string.
import java.util.Arrays;

class max_dif
{
static final int MAX=100;

// Return true if there all 1s
static boolean allones(String s, int n)
{
	// Checking each index is 0 or not.
	int co = 0;
	for (int i = 0; i < s.length(); i++)
		if(s.charAt(i) == '1')
			co +=1;	

	return (co == n);
}

// Find the length of substring with maximum
// difference of zeroes and ones in binary
// string
static int findlength(int arr[], String s, int n,
					int ind, int st, int dp[][])
{
	// If string is over.
	if (ind >= n)
		return 0;

	// If the state is already calculated.
	if (dp[ind][st] != -1)
		return dp[ind][st];

	if (st == 0)
		return dp[ind][st] = Math.max(arr[ind] +
							findlength(arr, s, n,
								ind + 1, 1, dp),
							findlength(arr, s, n,
								ind + 1, 0, dp));

	else
		return dp[ind][st] = Math.max(arr[ind] +
							findlength(arr, s, n,
							ind + 1, 1, dp), 0);
}

// Returns length of substring which is
// having maximum difference of number
// of 0s and number of 1s
static int maxLen(String s, int n)
{
	// If all 1s return -1.
	if (allones(s, n))
		return -1;

	// Else find the length.
	int arr[] = new int[MAX];
	for (int i = 0; i < n; i++)
		arr[i] = (s.charAt(i) == '0' ? 1 : -1);

	int dp[][] = new int[MAX][3];
	for (int[] row : dp)
			Arrays.fill(row, -1);
	return findlength(arr, s, n, 0, 0, dp);
}

// Driver code
public static void main (String[] args)
{
	String s = "11000010001";
	int n = 11;
	System.out.println(maxLen(s, n));
}
}


