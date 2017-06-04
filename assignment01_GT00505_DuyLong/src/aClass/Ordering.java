package aClass;

public class Ordering {

//	About ordering:
//		1.	pcode (string): the code of the product to be ordered.
//		2.	ccode (string): the code of the customer.
//		3.	quantity (integer): the number of  ordered products.

	
	public String pcode;
	public String ccode;
	public Integer quantity;
	
	
	
	public Ordering() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ordering(String pcode, String ccode, Integer quantity) {
		super();
		this.pcode = pcode;
		this.ccode = ccode;
		this.quantity = quantity;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString() {
		return "Ordering [pcode=" + pcode + ", ccode=" + ccode + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
