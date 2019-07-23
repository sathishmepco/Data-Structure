package com.java.datastructure.tree;

/*
 * The given Tree will look like this
 						40
					
			20						60
			
		10		30				50			70
		
	-1
	
		-2

 	Search for 30 :: true
	Search for 75 :: false
 
 */
public class SearchInTree {

	public static void main(String[] args) {
		TreeNode root = BinaryTree.createTree();
		int key = 30;
		boolean isKeyFound = search(root, key); 
		System.out.println("Search for 30 :: "+isKeyFound);
		
		key = 75;
		isKeyFound = search(root, key);
		System.out.println("Search for 75 :: "+isKeyFound);
	}

	public static boolean search(TreeNode root, int key) {
		//if the tree node is null, then it doesn't have any data value so return false
		if (root == null)
			return false;
		//if the search key value is match with tree node data, then return true
		if (root.data == key)
			return true;
		//if the search key value is less than tree node data, then search in the left tree
		if (root.data > key)
			return search(root.left, key);
		//if the search key value is greater than node data, then search in the right tree
		return search(root.right, key);
	}
}