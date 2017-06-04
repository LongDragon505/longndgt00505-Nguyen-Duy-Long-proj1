package test_Console;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import aControl.FuntionProductJson;
import consoleView.MenuConsole;

public class test_ModuleProduct {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, JsonParseException, JsonMappingException, InstantiationException, NoSuchFieldException, SecurityException, IOException {
		// TODO Auto-generated method stub

		MenuConsole menuConsole = new MenuConsole();
		menuConsole.menu_product();
		
		FuntionProductJson funtionProductJson = new FuntionProductJson();
		
		funtionProductJson.ketNoiBST();
		funtionProductJson.NhapVaoDuLieuProduct(funtionProductJson.bst5);
		funtionProductJson.docProduct(funtionProductJson.bst5);
		funtionProductJson.timKiemProduct(funtionProductJson.bst5);
		funtionProductJson.deleteProduct(funtionProductJson.bst5);
		funtionProductJson.deleteAfterCodeInput(funtionProductJson.bst5);
		
		//BST auto sort when adding
		
	}

}
