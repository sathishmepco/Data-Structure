package com.java.datastructure.tree;
/*
 * The given Tree will look like this, 40 is the root node
					40
					
			20				60
			
		10		30		50		70
		
	5
	
		8

 Depth First Search ::
 40 >> 20 >> 10 >> 5 >> 8 >> 30 >> 60 >> 50 >> 70 >>
 
 */
public class DepthFirstTraversal_DFS {
	
	public static void main(String[] args) {
		TreeNode root = BinaryTree.createTree();
		System.out.println("Depth First Search ::");
		depthFirstSearch(root);
	}
	
	public static void depthFirstSearch(TreeNode root){
		if(root == null)
			return;
		System.out.print(" "+root.data+" >>");
		depthFirstSearch(root.left);
		depthFirstSearch(root.right);
	}
}