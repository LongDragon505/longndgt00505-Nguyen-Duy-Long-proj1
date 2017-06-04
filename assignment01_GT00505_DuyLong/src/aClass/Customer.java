package aClass;

public class Customer {

//	About a customer:
//		1.	ccode (string): the code of the customer (this should be unique for the customer).
//		2.	cus_name (string): the name of the customer.
//		3.	phone (string): The phone number of the customer (must contain digits only).

	
	public String ccode;
	public String cus_name;
	public String phone;
	
		
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String ccode, String cus_name, String phone) {
		super();
		this.ccode = ccode;
		this.cus_name = cus_name;
		this.phone = phone;
	}
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "Customer [ccode=" + ccode + ", cus_name=" + cus_name + ", phone=" + phone + "]";
	}
	
	
	
	
	
}
