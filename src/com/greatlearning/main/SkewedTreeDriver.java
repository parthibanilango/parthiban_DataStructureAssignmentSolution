package com.greatlearning.main;

public class SkewedTreeDriver {
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		
		inOrder(tree.node);
		tree.convertToSkewed(tree.node);
		System.out.println("");
		tree.traverseTree(tree.headNode);
	}
	
	static void inOrder(Node root) {
		if (root == null)
			return;
		else {inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
		}
		}

}
