package com.java.datastructure.tree;

/*
 	The below code will generate the binary tree like this
 	
 						40
					
			20						60
			
		10		30				50			70
		
	-1
	
		-2
*/

public class BinaryTree{
	
	public static TreeNode createTree(){
		TreeNode root = new TreeNode(40);
		root = insertion(root, 20);
		root = insertion(root, 60);
		root = insertion(root, 10);
		root = insertion(root, 30);
		root = insertion(root, 50);
		root = insertion(root, 70);
		root = insertion(root, -1);
		root = insertion(root, -2);
		
		
		/*
		 * The above code is equivalent to the below code
		 */
		/*TreeNode root = new TreeNode(40);
		root.left = new TreeNode(20);
		root.right = new TreeNode(60);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(30);
		root.right.left = new TreeNode(50);
		root.right.right = new TreeNode(70);
		root.left.left.left = new TreeNode(-1);
		root.left.left.left.left = new TreeNode(-2);*/
		
		return root;
	}
	
	private static TreeNode insertion(TreeNode root, int data){
		if(root == null){
			root = new TreeNode(data);
			return root;
		}
		if(root.data > data)
			root.left = insertion(root.left, data);
		else
			root.right = insertion(root.right, data);
		return root;
	}
} 