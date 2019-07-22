package com.java.datastructure.tree;

public class BinaryTree {
	
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