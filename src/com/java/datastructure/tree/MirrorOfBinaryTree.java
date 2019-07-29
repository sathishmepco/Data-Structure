package com.java.datastructure.tree;

/*
Given Binary Tree

				40
				
		20				60
		
	10		30		50		70
	
5

	8
	
Mirror Of The Binary Tree
			40
				
		60				20
		
	70		50		30		10
	
								5
	
							8

	InOrder Traversal of Given Tree ::
	5 8 10 20 30 40 50 60 70 
	Mirror of the Given Tree ::
	70 60 50 40 30 20 10 8 5 
*/
public class MirrorOfBinaryTree {
	
	public static void main(String[] args) {
		TreeNode root = BinaryTree.createTree();
		System.out.println("InOrder Traversal of Given Tree ::");
		TreeTraversal.inorderTraversal(root);
		
		TreeNode rootOfMirror = mirrorOfBinaryTree(root);
		System.out.println("\nMirror of the Given Tree ::");
		TreeTraversal.inorderTraversal(rootOfMirror);
	}
	
	public static TreeNode mirrorOfBinaryTree(TreeNode root){
		if(root == null)
			return null;
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirrorOfBinaryTree(root.left);
		mirrorOfBinaryTree(root.right);
		return root;	
	}
}