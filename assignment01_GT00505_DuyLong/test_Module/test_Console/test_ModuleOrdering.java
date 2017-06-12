package test_Console;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import aControl.FuntionOrderingJson;
import consoleView.MenuConsole;

public class test_ModuleOrdering {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, IOException {
		// TODO Auto-generated method stub

		MenuConsole menuConsole = new MenuConsole();
		menuConsole.menu_oder();
		
		FuntionOrderingJson funtionOrderingJson = new FuntionOrderingJson();
		
		funtionOrderingJson.ketNoiBST();
		funtionOrderingJson.docOrdering(funtionOrderingJson.bst5);
//		funtionOrderingJson.NhapVaoDuLieuOrdering(funtionOrderingJson.bst5);
		funtionOrderingJson.SapXepOrdering(funtionOrderingJson.bst5);
		
		//BST auto sort when adding
		
	}

}
