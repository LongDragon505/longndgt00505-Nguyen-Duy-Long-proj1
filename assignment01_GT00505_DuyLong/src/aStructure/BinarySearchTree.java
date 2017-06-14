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
	//private int demTam = 0;
	//public int demCon = 0;


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

		if(root == null){
			root = n;
			root.viTri = 1;
			//System.out.println(root);
		}
		else{
			//System.out.println("Vi tri root: "+root.viTri);
			add(n, root);
			
		}
	}

	private void add(BinarySearchNode<T> n, BinarySearchNode<T> p) throws IllegalArgumentException, IllegalAccessException 
	{
		
		//if(n.data < p.data)
		if(n.piece.get(0).compareTo(p.piece.get(0)) < 0)
		{
			if(p.left == null) 
			{
				p.left = n; n.parent = p;  n.viTri = root.viTri; root.viTri++;
			//	System.out.println(p.left);
			}
			else add(n, p.left);
		}
		
		
		//if(n.data > p.data)
		if(n.piece.get(0).compareTo(p.piece.get(0)) > 0)
		{
			if(p.right == null)
			{
				p.right = n; n.parent = p;  n.viTri = root.viTri; root.viTri++;
			//	System.out.println(p.right);
			}
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

//	public boolean search(String x) 
	public BinarySearchNode search(String x) 
	{
//		if(root==null) return false;
//		return search(x, root) != null;
		if(root==null) return null;
		return search(x, root);
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
		
		if(n == null){
			System.out.println(" Node doesn't have child ");
			return ;
		}
		
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
//		if(p != null) remove(p.left, p);
//		if(p != null) remove(p.right, p);
		if(p != null) checkTheNodeWhenDeleteAfter1(p);
	}	
	
	public void checkTheNodeWhenDeleteAfter1(BinarySearchNode n) {
		
		if(n.left == null){
			remove(n.right, n);
		}else if(n.right == null){
			remove(n.left, n);
		}
		
	}
	
	public BinarySearchNode get(int i) {	
		
		return searchV(i);
	}
	
	public BinarySearchNode searchV(int x) 
	{
		if(root==null) return null;
		return searchV(x, root);
	}

	private BinarySearchNode searchV(int x, BinarySearchNode n) 
	{
		if(x==n.viTri) return n;
		if(x<n.viTri && n.left != null) return searchV(x, n.left);
		else if(x>n.viTri && n.right != null) return searchV(x, n.right);
		else return null;
	}
	
	public int size() {
		int dai = root.viTri;
		return dai;
		
	}
	
	public void flatten() 
	{
		BinarySearchNode x1 = root;
		
		while(x1 != null) 
		{
			x1 = rotateLeft(x1);
			x1 = x1.right;
		}

		return;
	}

	private BinarySearchNode rotateLeft(BinarySearchNode x1) 
	{
		while(x1.left != null) 
		{
			BinarySearchNode x2 = x1.left;
			BinarySearchNode r2 = x2.right;
			
			x1.left = r2;
			if(r2 != null) r2.parent = x1;
			
			x2.right = x1;
			
			if(x1.parent == null) root = x2;
			else if(x1.parent.left==x1) x1.parent.left = x2;
			else if(x1.parent.right==x1) x1.parent.right = x2;
			
			x2.parent = x1.parent; 
			x1.parent = x2;
			
			x1 = x2;
		}
		
		return x1;
	}
	
//	public void fold(Object c) {
//		while(true) {
//			BinarySearchNode x1 = root;
//			if(x1.right == null) break;
//			while(x1 != null) {
//				x1 = fold(x1);
//				if(root.data == c) break;
//			}
//			if(root.data == c) break;
//		}
//		return;
//	}
//
//	private BinarySearchNode fold(BinarySearchNode x1) 
//	{
//		if(x1==null || x1.right == null) return null;
//		//System.out.println("folding " + x1);
//		
//		BinarySearchNode x2 = x1.right;
//		BinarySearchNode l2 = x2.left;
//		
//		x1.right = l2;
//		if(l2 != null) l2.parent = x1;
//		
//		x2.left = x1;
//		
//		if(x1.parent == null) root = x2;
//		else if(x1.parent.left==x1) x1.parent.left = x2;
//		else if(x1.parent.right==x1) x1.parent.right = x2;
//		
//		x2.parent = x1.parent; 
//		x1.parent = x2;
//		
//		x1 = x2.right;
//		if(x1 != null) x1 = x1.right;
//		
//		//this.dump(true);
//		
//		return x2.right;
//	}
	
	
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
