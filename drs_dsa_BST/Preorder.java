// 19-Java program to illustrate if a given array can represent
// a preorder traversal of a BST or not
public class Preorder
{
	static int preIndex = 0;
	
	// We are actually not building the tree
	static void buildBST_helper(int n, int[] pre, int min, int max)
	{
		if (preIndex >= n)
			return;

		if (min <= pre[preIndex] && pre[preIndex] <= max) {
		
			// build node
			int rootData = pre[preIndex];
			preIndex++;

			// build left subtree
			buildBST_helper(n, pre, min, rootData);

			// build right subtree
			buildBST_helper(n, pre, rootData, max);
		}
		// else
		// return NULL;
	}

	static boolean canRepresentBST(int[] arr, int N)
	{
		// code here
		int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;

		buildBST_helper(N, arr, min, max);

		return preIndex == N;
	}
	
	public static void main(String[] args) {
		int[] preorder1 = { 2, 4, 3 };
		/*
				2
				\
				4
				/
			3
		*/
		int n1 = preorder1.length;
		System.out.println();
		if (canRepresentBST(preorder1, n1))
			System.out.print("preorder1 can represent BST");
		else
			System.out.print("preorder1 can not represent BST :(");
	
		int[] preorder2 = { 5, 3, 4, 1, 6, 10 };
		int n2 = preorder2.length;
		System.out.println();
		/*
						5
			/	 \
		3		 1
			\	 / \
			4 6 10
		*/
		if (!canRepresentBST(preorder2, n2))
			System.out.print("preorder2 can represent BST");
		else
			System.out.print("preorder2 can not represent BST :(");
	
		int[] preorder3 = { 5, 3, 4, 8, 6, 10 };
		int n3 = preorder3.length;
		System.out.println();
		/*
						5
			/	 \
		3		 8
			\	 / \
			4 6 10
		*/
		if (canRepresentBST(preorder3, n3))
			System.out.print("preorder3 can represent BST");
		else
			System.out.print("preorder3 can not represent BST :(");
	}
}

