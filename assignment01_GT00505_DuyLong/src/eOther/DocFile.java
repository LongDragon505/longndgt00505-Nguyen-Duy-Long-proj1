package eOther;

import java.io.File;

public class DocFile {
	
	
	
	public DocFile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public File duLieu_customer() {
		File f = Res.getDesktopFile("dsa2017-data/1e2/customers.json");
		return f;
	}
	
	public File duLieu_product() {
		File f = Res.getDesktopFile("dsa2017-data/1e2/products.json");
		return f;
	}
	
	public File duLieu_ordering() {
		File f = Res.getDesktopFile("dsa2017-data/1e2/orders.json");
		return f;
	}
	
	public File duLieu_customer2() {
		File f = Res.getDesktopFile("customers.json");
		return f;
	}
	
	public File duLieu_product2() {
		File f = Res.getDesktopFile("products.json");
		return f;
	}
	
	public File duLieu_ordering2() {
		File f = Res.getDesktopFile("orders.json");
		return f;
	}
	
}
