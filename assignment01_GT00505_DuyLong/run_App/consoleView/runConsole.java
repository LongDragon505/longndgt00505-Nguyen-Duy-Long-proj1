package consoleView;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import aControl.FuntionCustomerJson;
import aControl.FuntionOrderingJson;
import aControl.FuntionProductJson;

public class runConsole {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, IOException {
		// TODO Auto-generated method stub

		MenuConsole menuConsole = new MenuConsole();
		menuConsole.menu_tenCongTy();
		menuConsole.menu_product();
		menuConsole.menu_customer();
		menuConsole.menu_oder();
		menuConsole.lua_chon_1();
		
		FuntionProductJson funtionProductJson = new FuntionProductJson();
		FuntionCustomerJson funtionCustomerJson = new FuntionCustomerJson();
		FuntionOrderingJson funtionOrderingJson = new FuntionOrderingJson();
		

		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		
		do{
			
			menuConsole.NhapVaoMenu();
			choice = scanner.nextInt();
			
			switch (choice) {

			case 1:
				menuConsole.menu_product();			
				break;
			case 2:
				menuConsole.menu_customer();
				break;
			case 3:
				menuConsole.menu_oder();
				break;
			case 11:
				funtionProductJson.ketNoiBST();
				System.out.println("Done ... ");
				break;
			case 12:
				funtionProductJson.NhapVaoDuLieuProduct(funtionProductJson.bst5);
				break;
			case 13:
				funtionProductJson.docProduct(funtionProductJson.bst5);
				break;
			case 14:
				funtionProductJson.themProduct(funtionProductJson.bst5);
				System.out.println("Done ... ");
				break;
			case 15:
				funtionProductJson.timKiemProduct(funtionProductJson.bst5);
				break;
			case 16:
				funtionProductJson.deleteProduct(funtionProductJson.bst5);
				break;
			case 17:
				funtionProductJson.SapXepProduct(funtionProductJson.bst5);
				break;
			case 18:
				funtionProductJson.deleteAfterCodeInput(funtionProductJson.bst5);
				break;
			case 21:
				funtionCustomerJson.ketNoiBST();
				System.out.println("Done ... ");
				break;
			case 22:
				funtionCustomerJson.NhapVaoDuLieuCustomer(funtionCustomerJson.bst5);
				break;
			case 23:
				funtionCustomerJson.docCustomer(funtionCustomerJson.bst5);
				break;
			case 24:
				funtionCustomerJson.themCustomer(funtionCustomerJson.bst5);
				System.out.println("Done ... ");
				break;
			case 25:
				funtionCustomerJson.timKiemCustomer(funtionCustomerJson.bst5);
				break;
			case 26:
				funtionCustomerJson.deleteCustomer(funtionCustomerJson.bst5);
				break;
			case 31:
				funtionOrderingJson.ketNoiBST();
				System.out.println("Done ... ");
				break;
			case 32:
				funtionOrderingJson.docOrdering(funtionOrderingJson.bst5);
				break;
			case 33:
				funtionOrderingJson.SapXepOrdering(funtionOrderingJson.bst5);
				break;

			case 99:
				System.out.println("Exit Program");
				break;
			case 50:
				menuConsole.menu_tenCongTy();
				menuConsole.menu_product();
				menuConsole.menu_customer();
				menuConsole.menu_oder();
				menuConsole.lua_chon_1();
				break;
			default:

				break;

			}
		} while(choice != 99);

	}

}
