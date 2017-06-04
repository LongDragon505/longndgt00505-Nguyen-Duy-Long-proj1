package aStructure;

import java.util.LinkedList;
import java.util.List;

import eOther.Res;


public class BinarySearchNode<T> {

	public BinarySearchNode() {}
	
	public BinarySearchNode(T d) { data = d;}
	
	@Override
	public String toString() {
	//	return ""+data;
		return "id="+Res.code(this)
		+", data=" + data
		+ ", parent=" + Res.code(parent)
		+ ", left=" + Res.code(left)
		+ ", right=" + Res.code(right);
	}

	//public Integer data;
	//public String data;
	public T data;
	public BinarySearchNode left;
	public BinarySearchNode right;
	public BinarySearchNode parent;
	public List<String> piece = new LinkedList<String>();
	//public List<String> part = new LinkedList<String>();
	
	public int getLevel() 
	{
		int l = 0;
		for(BinarySearchNode t=this; t!= null; t = t.parent) l++; 
		return l;
	}

}
