package com.java.datastructure.tree;

/*
 * This class has all the three types of Tree Traversals
 * 
 */
public class TreeTraversal {
	
	public static void main(String[] args) {
		TreeNode root = BinaryTree.createTree();
		System.out.println("\nInOrder Traversal");
		inorderTraversal(root);
		
		System.out.println("\nPreOrder Traversal");
		preOrderTraversal(root);
		
		System.out.println("\nPostOrder Traversal");
		postOrderTraversal(root);
	}

	/*
	 * InOrder Traversal
	 * traverse LEFT node - print the data - traverse RIGHT node
	 */
	public static void inorderTraversal(TreeNode root){
		if(root != null){
			inorderTraversal(root.left);
			System.out.print(root.data+" ");
			inorderTraversal(root.right);
		}
	}
	
	/*
	 * PostOrder Traversal
	 * traverse LEFT node - traverse RIGHT node - print the data
	 * 
	 */
	public static void postOrderTraversal(TreeNode root){
		if(root != null){
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	/*
	 * PreOrder Traversal
	 * print data - traverse LEFT node - traverse RIGHT node 
	 */
	public static void preOrderTraversal(TreeNode root){
		if(root != null){
			System.out.print(root.data+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
}