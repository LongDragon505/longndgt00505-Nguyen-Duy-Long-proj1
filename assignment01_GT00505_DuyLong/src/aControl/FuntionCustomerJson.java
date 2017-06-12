package aControl;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import aClass.Customer;
import aStructure.BinarySearchTree;
import eOther.DocFile;
import eOther.Res;
import eOther.doiTuongCanMap;

public class FuntionCustomerJson {

	public BinarySearchTree<Customer> bst5;
	
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		
		FuntionCustomerJson funtionCustomerJson = new FuntionCustomerJson();
				
		funtionCustomerJson.docCustomer(funtionCustomerJson.ketNoiBST());
//		funtionCustomerJson.timKiemCustomer(funtionCustomerJson.ketNoiBST());
//		funtionCustomerJson.deleteCustomer(funtionCustomerJson.ketNoiBST());
		
		funtionCustomerJson.NhapVaoDuLieuCustomer(funtionCustomerJson.bst5);
		funtionCustomerJson.themCustomer(funtionCustomerJson.bst5);

	}
	
	public BinarySearchTree<Customer> ketNoiBST() throws JsonParseException, JsonMappingException, IOException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		long begin = Calendar.getInstance().getTimeInMillis();
		
		DocFile fai = new DocFile();
		File f = fai.duLieu_customer();
		
		doiTuongCanMap mapper = new doiTuongCanMap();
		
		List<Customer> listCustomer = 
				mapper.doiTuongMap().readValue(f, new TypeReference<List<Customer>>() {
				});
		
		bst5 = new BinarySearchTree<Customer>(Customer.class, "ccode");

		for(int i =0 ; i < listCustomer.size(); i++){	
			
			try {
				bst5.add(listCustomer.get(i));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
		//bst5.demCon = listCustomer.size();
		//System.out.println("Dem: "+bst5.demCon);
		
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time: " + (end - begin) + " milliseconds");
		
		//``````````````````````````````````````
		
		return bst5;
	}
	
	public void docCustomer(BinarySearchTree<Customer> bst5) throws JsonParseException, JsonMappingException, IOException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		long begin1 = Calendar.getInstance().getTimeInMillis();
		
		//bst5.dump(true);
		bst5.InThongTin(true);
		
		long end1 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time 1: " + (end1 - begin1) + " milliseconds");
		
		//``````````````````````````````````````
	
	}
	
	public void timKiemCustomer(BinarySearchTree<Customer> bst5) {
		long begin2 = Calendar.getInstance().getTimeInMillis();
		
		//String s = "CSTzzXeHic";
		String s = Nhap1Tu();
		//boolean r = bst5.search(s);
		
//		System.out.println("Tim "+s+ " : " + r);
		System.out.println(bst5.search(s));
		
		
		long end2 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time 2: " + (end2 - begin2) + " milliseconds");
		
		
	}
	
	public void deleteCustomer(BinarySearchTree<Customer> bst5) {
		
		long begin3 = Calendar.getInstance().getTimeInMillis();
		
		String s = Nhap1Tu();
		bst5.remove(s);
		
		//bst5.remove("CSTw0q0NQx");	
		//bst5.dump(true);
		bst5.InThongTin(true);
		
		long end3 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time 3: " + (end3 - begin3) + " milliseconds");
	
	}
	
	public void themCustomer(BinarySearchTree<Customer> bst5) throws JsonGenerationException, JsonMappingException, IOException {
		
		long begin4 = Calendar.getInstance().getTimeInMillis();
		
		DocFile fai = new DocFile();
		File f = fai.duLieu_customer2();
		
		doiTuongCanMap mapper = new doiTuongCanMap();
		
		mapper.doiTuongMap().writeValue(f, bst5.vietRaFile(true));
		
		//bst5.vietRaFile(true);
		
		long end4 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time 4: " + (end4 - begin4) + " milliseconds");
		
	}

	
	public String Nhap1Tu() {
		
		Scanner scanner = new Scanner(System.in);
		String a = "";
		System.out.println("Nhap vao chuoi: ");
		a = scanner.nextLine();
		
		return a;
	}

	public void NhapVaoDuLieuCustomer(BinarySearchTree<Customer> bst5) throws IllegalArgumentException, IllegalAccessException {
		
		Scanner scanner = new Scanner(System.in);
		String a,b,c = "";
		System.out.println("Nhap vao ccode: ");
		a = scanner.nextLine();
		System.out.println("Nhap vao cus_name: ");
		b = scanner.nextLine();
		System.out.println("Nhap vao phone: ");
		c = scanner.nextLine();
		
		Customer customer = new Customer();
		
		customer.setCcode(a);
		customer.setCus_name(b);
		customer.setPhone(c);
		
//		Customer customer2 = new Customer("aaaaaa","hjhhhjh","44444444");
//		
		bst5.add(customer);
//		//System.out.println(customer2);		
//		bst5.dump(true);
		bst5.InThongTin(true);
		
	}
	
	public void SapXepCustomer(BinarySearchTree<Customer> bst5) {
		
		long begin7 = Calendar.getInstance().getTimeInMillis();

		bst5.flatten();
		
		//bst5.dump(true);
		bst5.InThongTin(true);
		
		long end7 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time 7: " + (end7 - begin7) + " milliseconds");
		
//		bst5.fold(50);
//		bst5.dump(true);
		
		//``````````````````````````````````````
		
		
	}
	
	public void layVitri(BinarySearchTree<Customer> bst5) {
		
		System.out.println("b: "+bst5.size());
		System.out.println("n :"+bst5.get(50));
		
	}
	
//	public void SapXepCustomer() throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
//		
//		long begin7 = Calendar.getInstance().getTimeInMillis();
//		BinarySearchTree<Customer> bstS = new BinarySearchTree<Customer>(Customer.class, "ccode");
//		
//		bstS.add(bst5);
//		
//		bstS.flatten();
//		
//		bstS.dump(true);
//		//bst5.InThongTin(true);
//		
//		long end7 = Calendar.getInstance().getTimeInMillis();
//		System.out.println("Executed Time 1: " + (end7 - begin7) + " milliseconds");
//		
//		//``````````````````````````````````````
//		
//	}
	
}
