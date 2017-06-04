package test_Console;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import aClass.Customer;
import aControl.FuntionCustomerJson;
import aStructure.BinarySearchTree;
import consoleView.MenuConsole;

public class test_ModuleCustomer {

	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, IOException {
		// TODO Auto-generated method stub
		
		MenuConsole menuConsole = new MenuConsole();
		
		menuConsole.menu_customer();
		
		FuntionCustomerJson funtionCustomerJson = new FuntionCustomerJson();
		
		funtionCustomerJson.ketNoiBST();
		funtionCustomerJson.NhapVaoDuLieuCustomer(funtionCustomerJson.bst5);
		funtionCustomerJson.docCustomer(funtionCustomerJson.bst5);
		funtionCustomerJson.themCustomer(funtionCustomerJson.bst5);
		funtionCustomerJson.timKiemCustomer(funtionCustomerJson.bst5);
		funtionCustomerJson.deleteCustomer(funtionCustomerJson.bst5);
		
		//BST auto sort when adding
		
	}
	

}
