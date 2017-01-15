package com.BSTPractice;

public class BSTTree {

	public static void main(String[] args) {
		Tree<Integer> intTree = new NonEmptyBST<Integer>(7);
		
		//intTree.add(7);
		intTree=intTree.add(2);
		intTree=intTree.add(30);
		intTree=intTree.add(1);
		intTree=intTree.add(4);
		intTree=intTree.add(12);
		//khkjhk
		intTree=intTree.add(31);
		
		intTree.printTree();

	}

}
