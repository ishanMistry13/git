package com.BSTPractice;

public class EmptyBST<D extends Comparable<D>> implements Tree<D>{

	public EmptyBST(){
		
		
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public int cardinality() {
		return 0;
	}

	@Override
	public boolean member(D elt) {
		
		return false;
	}

	@Override
	public NonEmptyBST<D> add(D elt) {
		return new NonEmptyBST<D>(elt);
		
	}

	@Override
	public void printTree() {
			
		
	
	}
	
	
	
	
}
