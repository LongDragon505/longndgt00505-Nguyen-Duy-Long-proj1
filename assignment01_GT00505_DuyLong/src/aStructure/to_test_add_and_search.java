package aStructure;

import java.lang.reflect.Field;

import aClass.Customer;
import aClass.Product;


public class to_test_add_and_search {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException
	{
		BinarySearchTree<Customer> bst = new BinarySearchTree<Customer>(Customer.class,"ccode");
		Customer cus = new Customer("DBC", "Nam", "012938");
		Customer cus3 = new Customer("ABC", "Anh", "575757");
		Customer cus4 = new Customer("CCF", "fff", "3333");
		Customer cus5 = new Customer("JBE", "ggg", "444");
		Customer cus6 = new Customer("KFO", "hhhh", "8888");
		//Product pro1 = new Product("DEV", "Nokia", 12, 65, 25.000);
		
		   // Get value from fields
		   System.out.println("====Start get value from fields====");
		   
		
		bst.add(cus);
		//System.out.println("In: "+bst.getN().data.getCcode());
		
		bst.add(cus3);
		bst.add(cus4);
		bst.add(cus5);
		bst.add(cus6);

			
		bst.dump(true);
		
//		boolean r1 = bst.search("ABC");
		
		System.out.println("Tim 1: " + bst.search("ABC") /*r1*/);
		
		//boolean r2 = bst.search("ABD");
		
		System.out.println("Tim 2: " + bst.search("ABD") /*r2*/);
		
		bst.remove("DBC");
		
		bst.dump(true);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		

	}

}
