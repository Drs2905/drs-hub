// 47-A Dynamic programming based
// java program to count derangements
import java.io.*;

class derangements
{
	
	// Function to count
	// derangements
	static int countDer(int n)
	{
		// Create an array to store
		// counts for subproblems
		int der[] = new int[n + 1];
	
		// Base cases
		der[1] = 0;
		der[2] = 1;
	
		// Fill der[0..n] in bottom up
		// manner using above recursive
		// formula
		for (int i = 3; i <= n; ++i)
			der[i] = (i - 1) * (der[i - 1] +
								der[i - 2]);
	
		// Return result for n
		return der[n];
	}
	
	// Driver program
	public static void main (String[] args)
	{
		int n = 4;
		System.out.println("Count of Derangements is " +
							countDer(n));
	
	}
}


