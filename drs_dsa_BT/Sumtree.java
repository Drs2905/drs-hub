//20- Java program to check if Binary tree
// is sum tree or not
import java.io.*;

// A binary tree node has data,
// left child and right child
class Node
{
	int data;
	Node left, right, nextRight;

	// Helper function that allocates a new node
	// with the given data and NULL left and right
	// pointers.
	Node(int item)
	{
		data = item;
		left = right = null;
	}
}
class Sumtree {
	public static Node root;

	// A utility function to get the sum
	// of values in tree with root as root
	static int sum(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		return (sum(node.left) + node.data+sum(node.right));
	}

	// Returns 1 if sum property holds for
	// the given node and both of its children
	static int isSumTree(Node node)
	{
		int ls,rs;
	
		// If node is NULL or it's a leaf
		// node then return true
		if(node == null || (node.left == null && node.right == null))
		{
			return 1;
		}
	
		// Get sum of nodes in left and
		// right subtrees
		ls = sum(node.left);
		rs = sum(node.right);
	
		// If the node and both of its
		// children satisfy the property
		// return 1 else 0
		if((node.data == ls + rs) && isSumTree(node.left) != 0 && isSumTree(node.right) != 0)
		{
			return 1;
		}
		return 0;
	}

	// Driver code
	public static void main (String[] args)
	{
		Sumtree tree=new Sumtree();
		tree.root=new Node(26);
		tree.root.left=new Node(10);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(6);
		tree.root.right.right=new Node(3);
		if(isSumTree(root) != 0)
		{
			System.out.println("The given tree is a SumTree");
		}
		else
		{
			System.out.println("The given tree is not a SumTree");
		}
	}
}

