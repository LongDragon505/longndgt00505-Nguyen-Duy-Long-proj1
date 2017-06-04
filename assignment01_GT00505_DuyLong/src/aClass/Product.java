package aClass;

public class Product {

//	About a product:
//		1.	pcode (string): the code of the product (this should be unique for the product).
//		2.	pro_name (string): the name of the product.
//		3.	quantity (integer): the number of  products with the same code in a shop at beginning of a day.
//		4.	saled (integer): the number of  products with the same code, which are saled in the day. Condition: saled ≤ quantity.
//		5.	price (double): The price of the product.

		public String pcode;
		public String pro_name;
		public Integer quantity;
		public Integer sale;
		public Double price;
		public String pro_image_url;
		
		
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Product(String pcode, String pro_name, Integer quanlity, Integer saled, Double price,
				String pro_image_url) {
			super();
			this.pcode = pcode;
			this.pro_name = pro_name;
			this.quantity = quanlity;
			this.sale = saled;
			this.price = price;
			this.pro_image_url = pro_image_url;
		}

		public String getPcode() {
			return pcode;
		}
		public void setPcode(String pcode) {
			this.pcode = pcode;
		}
		public String getPro_name() {
			return pro_name;
		}
		public void setPro_name(String pro_name) {
			this.pro_name = pro_name;
		}
	
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}

		
		
		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Integer getSale() {
			return sale;
		}

		public void setSale(Integer sale) {
			this.sale = sale;
		}

		public String getPro_image_url() {
			return pro_image_url;
		}

		public void setPro_image_url(String pro_image_url) {
			this.pro_image_url = pro_image_url;
		}

		@Override
		public String toString() {
			return "Product [pcode=" + pcode + ", pro_name=" + pro_name + ", quanlity=" + quantity + ", saled=" + sale
					+ ", price=" + price + ", pro_image_url=" + pro_image_url + "]";
		}
		
		
		
		
		
	
}
