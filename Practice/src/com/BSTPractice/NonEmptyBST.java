package com.BSTPractice;

public class NonEmptyBST<D extends Comparable<D>> implements Tree<D>{
	
	D data;
	Tree<D> left;
	Tree<D> right;
	
	
	public NonEmptyBST(D elt){
		data = elt;
		this.left = new EmptyBST<D>();
		this.right = new EmptyBST<D>();		
		
		
	}

	
	public NonEmptyBST(D data, Tree<D> leftTree, Tree<D> rightTree) {
		
		this.data=data;
		this.left=leftTree;
		this.right=rightTree;
		
	}
	
	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int cardinality() {
		return 1+left.cardinality()+right.cardinality();
	}

	@Override
	public boolean member(D elt) {
		if(data == elt){
			return true;
			
		}else {
			if(elt.compareTo(data)<1){
				return left.member(elt);
				
			}else{
				return right.member(elt);
				
			}
			
		}
		
	}

	@Override
	public NonEmptyBST<D> add(D elt) {
		if(data == elt){
			return this;
			
		}else{
			if(elt.compareTo(data)<0){
				return new NonEmptyBST<D>( data, left.add(elt),right);
				
			}else{
				System.out.println("Into right");
				return new NonEmptyBST<D>(data,left,right.add(elt));
				
			}
			
			
			
		}
		
	}


	@Override
	public void printTree() {
		
		if(left == null && right == null){
			System.out.println(" "+data+" ");
		}else{
			System.out.println(" "+data+" ");
			if(left!=null){
				left.printTree();	
			}
			
			if(right!=null){
				right.printTree();
			}
					
			
			
		}
		
	}

}
