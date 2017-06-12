package aControl;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.type.TypeReference;

import aClass.Customer;
import aClass.Product;
import aStructure.BinarySearchTree;
import eOther.DocFile;
import eOther.doiTuongCanMap;

public class FuntionProductJson {

	public BinarySearchTree<Product> bst5;
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, IOException {
		// TODO Auto-generated method stub

		FuntionProductJson funtionProductJson = new FuntionProductJson();
		
		funtionProductJson.docProduct(funtionProductJson.ketNoiBST());
		funtionProductJson.timKiemProduct(funtionProductJson.ketNoiBST());
		//funtionProductJson.deleteProduct(funtionProductJson.ketNoiBST());
		funtionProductJson.deleteAfterCodeInput(funtionProductJson.ketNoiBST());
		
	}

	public BinarySearchTree<Product> ketNoiBST() throws JsonParseException, JsonMappingException, IOException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		long begin = Calendar.getInstance().getTimeInMillis();
		
		DocFile fai = new DocFile();
		File f = fai.duLieu_product();
		
		doiTuongCanMap mapper = new doiTuongCanMap();
		
		List<Product> listProduct = 
				mapper.doiTuongMap().readValue(f, new TypeReference<List<Product>>() {
				});
	
		bst5 = new BinarySearchTree<Product>(Product.class, "pcode");

		for(int i =0 ; i < listProduct.size(); i++){	
			
			try {
				bst5.add(listProduct.get(i));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}

		
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time: " + (end - begin) + " milliseconds");
		
		//``````````````````````````````````````
		
		return bst5;
	}
	
	public void docProduct(BinarySearchTree<Product> bst5) throws JsonParseException, JsonMappingException, IOException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		long begin1 = Calendar.getInstance().getTimeInMillis();
		
		//bst5.dump(true);
		bst5.InThongTin(true);
		
		long end1 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time 1: " + (end1 - begin1) + " milliseconds");
		
		//``````````````````````````````````````
	
	}
	
	public void timKiemProduct(BinarySearchTree<Product> bst5) {
		long begin2 = Calendar.getInstance().getTimeInMillis();
		
		//String s = "PRDHTthNsf";
		String s = Nhap1Tu();
//		boolean r = bst5.search(s);		
//		System.out.println("Tim "+s+ " : " + r);
		System.out.println(bst5.search(s));
		
		long end2 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time 2: " + (end2 - begin2) + " milliseconds");
		
		
	}
	
	public void deleteProduct(BinarySearchTree<Product> bst5) {
		
		long begin3 = Calendar.getInstance().getTimeInMillis();
		
		
		String s = Nhap1Tu();
		bst5.remove(s);	
		//bst5.remove("PRD1qvV5iA");	
		//bst5.dump(true);
		bst5.InThongTin(true);
		
		long end3 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time 3: " + (end3 - begin3) + " milliseconds");
	
	}
	
	public void deleteAfterCodeInput(BinarySearchTree<Product> bst5) {
		
	long begin4 = Calendar.getInstance().getTimeInMillis();
		
		String s = Nhap1Tu();
//		bst5.removeAfterCodeInput("PRD5DmQFkv");	
		bst5.removeAfterCodeInput(s);	
		//bst5.dump(true);
		bst5.InThongTin(true);
		
		long end4 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time 4: " + (end4 - begin4) + " milliseconds");
		
	}
	
	//PRD0YY09Bf
	
	public void themProduct(BinarySearchTree<Product> bst5) throws JsonGenerationException, JsonMappingException, IOException {
		
		long begin4 = Calendar.getInstance().getTimeInMillis();
		
		DocFile fai = new DocFile();
		File f = fai.duLieu_product2();
		
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

	public void NhapVaoDuLieuProduct(BinarySearchTree<Product> bst5) throws IllegalArgumentException, IllegalAccessException {
		
		Scanner scanner = new Scanner(System.in);
		String a,b,c = "";
		Integer d,e = 0;
		Double g = 119996.0;
		System.out.println("Nhap vao pcode: ");
		a = scanner.nextLine();
		System.out.println("Nhap vao pro_name: ");
		b = scanner.nextLine();
		System.out.println("Nhap vao quantity: ");
		d = scanner.nextInt();
		System.out.println("Nhap vao sale: ");
		e = scanner.nextInt();
		System.out.println("Nhap vao price: ");
		g = scanner.nextDouble();
		System.out.println("Nhap vao pro_image_url: ");
		c = scanner.nextLine();
		
		Product product = new Product();
	
		product.setPcode(a);
		product.setPro_name(b);
		product.setQuantity(d);
		product.setSale(e);
		product.setPrice(g);
		product.setPro_image_url(c);
		
		bst5.add(product);

		bst5.InThongTin(true);
		
	}
	
	public void SapXepProduct(BinarySearchTree<Product> bst5) {
			
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
	
	
}
