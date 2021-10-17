package com.greatlearning.main;

public class Tree {

	Node node;
	Node headNode;
	Node currNode;


	public void convertToSkewed(Node root) {
		if (root == null)
			return;
		else {
			convertToSkewed(root.left);
			if (headNode == null) {
				headNode = new Node(root.data);
				currNode =headNode;
			} else {
				currNode.right = new Node(root.data);
				currNode = currNode.right;
			}
			convertToSkewed(root.right);
		}
	}

	public void traverseTree(Node root) {
		if (root == null)
			return;
		else {
			System.out.print(root.data + " ");
			traverseTree(root.right);
		}
	}

}
