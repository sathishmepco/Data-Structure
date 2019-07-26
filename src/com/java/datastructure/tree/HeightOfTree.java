package com.java.datastructure.tree;

/*
The binary tree will look like this

The height of the Tree is longest path from root node to any leaf node.
In this given tree longest path is 40 > 20 > 10 > -1 > -2
No of nodes in the path is 5, thats the height of the tree.


					40
				
		20						60
		
	10		30				50			70
	
-1

	-2
	
Height of the Tree is :: 5

*/

public class HeightOfTree {
	
	public static void main(String[] args) {
		TreeNode root = BinaryTree.createTree();
		int height = heightOfTree(root);
		System.out.println("Height of the Tree is :: "+height);
	}
	
	public static int heightOfTree(TreeNode root){
		//only leaf node is null, so return o (no more nodes)
		if( root == null)
			return 0;
		//traverse the left sub tree 
		int left_depth = heightOfTree(root.left);
		//traverse the left sub tree
		int right_depth = heightOfTree(root.right);
		//adding 1 for denoting the current node
		if(left_depth > right_depth)
			return left_depth+1;
		return right_depth+1;
	}
}