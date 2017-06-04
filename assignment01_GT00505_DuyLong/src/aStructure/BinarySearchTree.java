package aStructure;


import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree<T> 
{
	public BinarySearchNode<T> root = null;
	
	public T k;
	public Class<?> lopThamSo;
	public Field[] fields;
	public Field f,f2;
	private int demTam = 0;


	public BinarySearchTree() 	{		}
	
//	public BinarySearchTree(Class<T> tlop) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException 
//	{
//	
//		this.k = tlop.newInstance();
//		lopThamSo = k.getClass();
//		fields = lopThamSo.getDeclaredFields();
//		f = lopThamSo.getDeclaredField("ccode");
//		//System.out.println("f: "+f.getName());
//	}
//	
	public BinarySearchTree(Class<T> tlop, String name) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException 
	{
	
		this.k = tlop.newInstance();
		lopThamSo = k.getClass();
		fields = lopThamSo.getDeclaredFields();
		f = lopThamSo.getDeclaredField(name);
		//System.out.println("f: "+f.getName());
	}
	
	public BinarySearchTree(Class<T> tlop, String name, String name2) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException 
	{
	
		this.k = tlop.newInstance();
		lopThamSo = k.getClass();
		fields = lopThamSo.getDeclaredFields();
		f = lopThamSo.getDeclaredField(name);
		f2 = lopThamSo.getDeclaredField(name2);
		//System.out.println("f: "+f.getName());
	}
	
	public BinarySearchTree(BinarySearchNode<T> n) 
	{
		root = n;
	}

	public void dump() 
	{
		dump(false);
	}
	

	
	public void dump(boolean dash) 
	{
		System.out.println("======= tree ");
		if(root == null) System.out.println("Empty tree");
		
		Stack<BinarySearchNode<T>> todo = new Stack<BinarySearchNode<T>>();
		if(root != null) todo.push(root);
		
		while(!todo.isEmpty())
		{
			BinarySearchNode<T> cur = todo.pop();			
			
			if(dash) for(int k=0; k<cur.getLevel(); k++) System.out.print("-- ");
			//System.out.println(cur.piece.get(0));
//			for(int i = 0; i < cur.part.size(); i++){
//				System.out.println(" .. "+cur.part.get(i));
//			}
			System.out.println(cur);
			
			if(cur.right != null) todo.push(cur.right);
			if(cur.left != null) todo.push(cur.left);
			

		}
		
		return;
	}	

	//public void add(String x) 
	public void add(Object x) throws IllegalArgumentException, IllegalAccessException
	{
		String a = "";
		
		BinarySearchNode<T> n = new BinarySearchNode<T>();
		
		n.data = (T) x;
		//System.out.println("f1: "+f.get(x));
		a = f.get(x).toString();
		//System.out.println("a: "+a);

		n.piece.add(0, a);
		

		
		if(root == null) root = n;
		else add(n, root);
	}

	private void add(BinarySearchNode<T> n, BinarySearchNode<T> p) throws IllegalArgumentException, IllegalAccessException 
	{

		//if(n.data < p.data)
		if(n.piece.get(0).compareTo(p.piece.get(0)) < 0)
		{
			if(p.left == null) { p.left = n; n.parent = p; }
			else add(n, p.left);
		}
		
		
		//if(n.data > p.data)
		if(n.piece.get(0).compareTo(p.piece.get(0)) > 0)
		{
			if(p.right == null)
			{ p.right = n; n.parent = p; }
			else add(n, p.right);
		}	

	}
	
	public void addSomeFields(Object x) throws IllegalArgumentException, IllegalAccessException
	{
		String a = "";
		String b = "";
		
		BinarySearchNode<T> n = new BinarySearchNode<T>();
		
		n.data = (T) x;
		//System.out.println("f1: "+f.get(x));
		a = f.get(x).toString();
		//System.out.println("a: "+a);
		b = f2.get(x).toString();
		
		n.piece.add(0, a);
		n.piece.add(1, b);

		
		if(root == null) root = n;
		else addSomeFiels(n, root);
	}
	
	private void addSomeFiels(BinarySearchNode<T> n, BinarySearchNode<T> p) throws IllegalArgumentException, IllegalAccessException 
	{

		//if(n.data < p.data)
		if(n.piece.get(0).compareTo(p.piece.get(0)) < 0)
		{
			if(p.left == null) { p.left = n; n.parent = p; }
			else addSomeFiels(n, p.left);
		}
		
		
		//if(n.data > p.data)
		if(n.piece.get(0).compareTo(p.piece.get(0)) > 0)
		{
			if(p.right == null)
			{ p.right = n; n.parent = p; }
			else addSomeFiels(n, p.right);
		}	
		
		//if(n.data = p.data) pcode = pcode => So Sanh ccode
		if(n.piece.get(0).compareTo(p.piece.get(0)) == 0)
		{
			
			//if(n.data1 < p.data1)
			if(n.piece.get(1).compareTo(p.piece.get(1)) < 0)
			{
				if(p.left == null)
				{ 
					p.left = n;
					n.parent = p;
				}
				else{
					if(n.piece.get(0).compareTo(p.piece.get(0)) != 0){
						
						n.left = p.left;
						p.left.parent = n;
						p.left = n;
						n.parent = p;
						
					}
					else{
						addSomeFiels(n, p.left);
					}
					
					
				}
			}
			
			//if(n.data1 > p.data1)
			if(n.piece.get(1).compareTo(p.piece.get(1)) > 0)
			{
				if(p.right == null)
				{
					p.right = n;
					n.parent = p; 
				}
				else{ 
					if(n.piece.get(0).compareTo(p.piece.get(0)) != 0){
						
						n.right = p.right;
						p.right.parent = n;
						p.right = n;
						n.parent = p;
						
					}
					else{
						addSomeFiels(n, p.right);
					}
					
				}
			}
		}		

	}

	public boolean search(String x) 
	{
		if(root==null) return false;
		return search(x, root) != null;
	}

	private BinarySearchNode search(String x, BinarySearchNode n) 
	{
				
		if(n.piece.get(0).toString().compareTo(x) == 0) return n;
		if(n.piece.get(0).toString().compareTo(x) > 0 && n.left != null) return search(x, n.left);
		else if(n.piece.get(0).toString().compareTo(x) < 0 && n.right != null) return search(x, n.right);
		else return null;
	}


	public void remove(String x) 
	{
		if(root == null) return;
		BinarySearchNode p = search(x, root);
		if(p != null) remove(p, p.parent);
	}

	private void remove(BinarySearchNode n, BinarySearchNode p) 
	{
		//if n has only one child c, and p.left==n,then p.left = c
		//if n has only one child c, and p.right==n,then p.right = c
		if(n.left == null || n.right == null) 
		{
			BinarySearchNode c = (n.left==null 
					? n.right : n.left);
			
			if(p==null) {
				root = c;
			} 
			
			else {
				if(p.left==n) p.left = c; 
				else if(p.right==n) p.right = c;				
			}
			
			if(c != null) c.parent = p;
		} 
		
		//if n has both children
		else {
			BinarySearchNode t = n.left;
			while(t.left != null) t = t.left;
			t.parent.left = t.right;
			n.data = t.data;
		}
	}
	
	public void removeAfterCodeInput(String x) 
	{
		if(root == null) return;
		BinarySearchNode p = search(x, root);
		if(p != null) remove(p.left, p);
	}	
	
	public void InThongTin(boolean dash) 
	{
		System.out.println("======= tree ");
		if(root == null) System.out.println("Empty tree");
		
		Stack<BinarySearchNode<T>> todo = new Stack<BinarySearchNode<T>>();
		if(root != null) todo.push(root);
		
		while(!todo.isEmpty())
		{
			BinarySearchNode<T> cur = todo.pop();			
			
			//if(dash) for(int k=0; k<cur.getLevel(); k++) System.out.print("-- ");
			System.out.println(cur.data);
			
			if(cur.right != null) todo.push(cur.right);
			if(cur.left != null) todo.push(cur.left);
			

		}
		
		return;
	}	
	
	
	public List<T> vietRaFile(boolean dash) 
	{
		
		Stack<BinarySearchNode<T>> todo = new Stack<BinarySearchNode<T>>();
		if(root != null) todo.push(root);
		BinarySearchNode<T> cur = null;
		List<T> list  = new LinkedList<T>();
		int i = 0;
		
		while(!todo.isEmpty())
		{
			cur = todo.pop();			
			
			//if(dash) for(int k=0; k<cur.getLevel(); k++) System.out.print("-- ");
			System.out.println(cur.data);
			list.add(cur.data);
			if(cur.right != null) todo.push(cur.right);
			if(cur.left != null) todo.push(cur.left);
			
			i++;
		}
			
		return list;
		
	}	

}
