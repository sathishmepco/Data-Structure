package com.java.datastructure.tree;

/*
 * This program to find out the Path from root node to node X.
	The binary tree will look like this
	
						40
					
			20						60
			
		10		30				50			70
		
	5
	
		8

	Path to node 50 is ::40 > 60 > 50
	Path to node 8 is ::40 > 20 > 10 > 5 > 8

		
*/
public class PathToNodeX {
	
	public static void main(String[] args) {
		TreeNode root = BinaryTree.createTree();
		int dataXNode = 50;
		String path = findPath(root, dataXNode);
		System.out.println("Path to node "+dataXNode+" is ::"+path);
		
		dataXNode = 8 ;
		path = findPath(root, dataXNode);
		System.out.println("Path to node "+dataXNode+" is ::"+path);
	}
	
	public static String findPath(TreeNode root, int dataXNode){
		//if the node is null, then there will not be any child nodes, so return null
		if(root == null)
			return null;
		//if the node has the value X, then we reached the destination, so return the node value
		if(root.data == dataXNode)
			return root.data+"";
		String leftPath = null, rightPath = null;
		
		//if the value X is greater than current node value then search in right subtree
		// else search in the left subtree
		if(root.data < dataXNode)
			rightPath = findPath(root.right, dataXNode);
		else
			leftPath = findPath(root.left, dataXNode);
		
		//At the end the value X will be in either right tree or left tree
		//So one tree will be null, one tree will have the path to the value X
		if(leftPath != null)
			return root.data +" > "+ leftPath;
		if(rightPath != null)
			return root.data +" > "+ rightPath;

		//if the value is not present in the Tree, then return null;
		//means both left subtree and right subtree is null
		return null;
	}
}
