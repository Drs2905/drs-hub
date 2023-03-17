/* 31-Java program to calculate Kth ancestor of given node */
import java.util.*;
class Kthancestor {
// A Binary Tree Node
static class Node
{
	int data;
	Node left, right;
}

// function to generate array of ancestors
static void generateArray(Node root, int ancestors[])
{
	// There will be no ancestor of root node
	ancestors[root.data] = -1;

	// level order traversal to
	// generate 1st ancestor
	Queue<Node> q = new LinkedList<Node> ();
	q.add(root);

	while(!q.isEmpty())
	{
		Node temp = q.peek();
		q.remove();

		if (temp.left != null)
		{
			ancestors[temp.left.data] = temp.data;
			q.add(temp.left);
		}

		if (temp.right != null)
		{
			ancestors[temp.right.data] = temp.data;
			q.add(temp.right);
		}
	}
}

// function to calculate Kth ancestor
static int kthAncestor(Node root, int n, int k, int node)
{
	// create array to store 1st ancestors
	int ancestors[] = new int[n + 1];

	// generate first ancestor array
	generateArray(root,ancestors);

	// variable to track record of number of
	// ancestors visited
	int count = 0;

	while (node!=-1)
	{
		node = ancestors[node];
		count++;

		if(count==k)
			break;
	}

	// print Kth ancestor
	return node;
}

// Utility function to create a new tree node
static Node newNode(int data)
{
	Node temp = new Node();
	temp.data = data;
	temp.left = null;
	temp.right = null;
	return temp;
}

// Driver program to test above functions
public static void main(String[] args)
{
	// Let us create binary tree shown in above diagram
	Node root = newNode(1);
	root.left = newNode(2);
	root.right = newNode(3);
	root.left.left = newNode(4);
	root.left.right = newNode(5);

	int k = 2;
	int node = 5;

	// print kth ancestor of given node
	System.out.println(kthAncestor(root,5,k,node));
}
}
