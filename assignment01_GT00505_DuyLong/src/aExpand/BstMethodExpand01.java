package aExpand;

import aClass.Product;
import aStructure.BinarySearchNode;
import aStructure.BinarySearchTree;

public class BstMethodExpand01<T> extends BinarySearchTree<T> {
	
	public void InSearchExpand(BinarySearchTree<T> bst5, String s) {
		BinarySearchNode<T> n = bst5.search(s) ;
		if(n != null){
			System.out.println(n.data);
		}else{
			System.out.println(" Not Found ");
		}
		
	}
	
}
