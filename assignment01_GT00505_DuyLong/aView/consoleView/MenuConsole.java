package consoleView;

public class MenuConsole {

	String tenCongTy = "\n Sale Management System  (SMS) \n";
	
	String[] menuProduct = {"\n 1. Product list:\n"
			,"11. Load data from file"
			,"12. Input & add new item"
			,"13. Display data"
			,"14. Save product list to file"
			,"15. Search by pcode"
			,"16. Delete by pcode"
			,"17. Sort by pcode"
			,"18. Delete the node after the node having code = xCode"
	};
	
	String[] menuCustomer = {"\n 2. Customer list:\n"
			,"21. Load data from file"
			,"22. Input & add new item"
			,"23. Display data"
			,"24. Save customer list to file"
			,"25. Search by ccode"
			,"26. Delete by ccode"};
	
	String[] menuOder = {"\n 3. Order list:\n"
			,"31. Input data"
			,"32. Display data with total value"
			,"33. Sort  by pcode and ccode"
	};
	
	String[] luaChon1 = {"\n 50. Display all menu","99. Exit \n"};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuConsole menuConsole = new MenuConsole();
		
		menuConsole.menu_tenCongTy();
		menuConsole.menu_product();
		menuConsole.menu_customer();
		menuConsole.menu_oder();

	}
	
	public void menu_tenCongTy() {
		System.out.println(tenCongTy);
	}
	
	public void menu_product() {
			
		for(int i = 0; i < menuProduct.length; i++){
			System.out.println("\t"+menuProduct[i]);
		}
	}
	
	public void menu_customer() {
		
		for(int i = 0; i < menuCustomer.length; i++){
			System.out.println("\t"+menuCustomer[i]);
		}
	}
	
	public void menu_oder() {
		
		for(int i = 0; i < menuOder.length; i++){
			System.out.println("\t"+menuOder[i]);
		}
	}
	
	public void lua_chon_1() {
		for(int i = 0; i < luaChon1.length; i++){
			System.out.print("\t"+luaChon1[i]);
		}
	}
	
	public void NhapVaoMenu() {
		System.out.println("\n Please choice and input the number: ");
	}
	
	
//	Product list:
//		1.1.      Load data from file
//		1.2.      Input & add new item
//		1.3.      Display data
//		1.4.      Save product list to file
//		1.5.      Search by pcode
//		1.6.      Delete by pcode
//		1.7.      Sort by pcode
//		1.8.      Delete the node after the node having code = xCode

	
//	Customer list:
//		2.1.      Load data from file
//		2.2.      Input & add new item
//		2.3.      Display data
//		2.4.      Save customer list to file
//		2.5.      Search by ccode
//		2.6.      Delete by ccode

//	Order list:
//		3.1.      Input data
//		3.2.      Display data with total value
//		3.3.      Sort  by pcode and ccode

	
}
