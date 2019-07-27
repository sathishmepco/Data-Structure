package com.java.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/*
	The binary tree will look like this
	
					40
					
			20				60
			
		10		30		50		70
		
	5
	
		8
		
Breadth First Traversal or Breadth First Search is
 40 >> 20 >> 60 >> 10 >> 30 >> 50 >> 70 >> 5 >> 8 >>

*/
public class BreadthFirstTraversal {
	public static void main(String[] args) {
		TreeNode root = BinaryTree.createTree();
		System.out.println("Breadth First Search ::");
		breadthFirstSearch(root);
	}
	
	/*
	 * 	BFS actually traverse level by level
	 * 	This reads all the nodes in the level 0, then it goes to level 1
	 * 	Then reads all the nodes in the level 1, then it goes to level n
	 * 	Like this traverse all the levels
	 * 	In the given tree
	 * 	Level 0 -> 	40
	 * 	Level 1 -> 	20, 60
	 * 	Level 2 ->	10, 30, 50, 70
	 * 	Level 3 ->	5
	 * 	Level 4 ->	8  
	 */
	public static void breadthFirstSearch(TreeNode root){
		if(root == null)
			return;
		Queue<TreeNode> queue = new LinkedList<>();
		//insert the node at the end of the queue
		queue.add(root);
		while( queue.size() > 0){
			//remove the head node from the queue
			TreeNode node = queue.remove();
			System.out.print(" "+node.data+" >>");
			
			//insert the node at the end of the queue
			if( node.left != null )
				queue.add(node.left);
			if ( node.right != null )
				queue.add(node.right);
		}
	}
}