package aControl;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.type.TypeReference;

import aClass.Customer;
import aClass.Ordering;
import aClass.Product;
import aStructure.BinarySearchTree;
import eOther.DocFile;
import eOther.doiTuongCanMap;

public class FuntionOrderingJson {

	public BinarySearchTree<Ordering> bst5;
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, IOException {
		// TODO Auto-generated method stub

		FuntionOrderingJson funtionOrderingJson = new FuntionOrderingJson();
		
		//funtionOrderingJson.docOrdering(funtionOrderingJson.ketNoiBST());
		//funtionOrderingJson.timKiemOrdering(funtionOrderingJson.ketNoiBST());
		//funtionOrderingJson.deleteOrdering(funtionOrderingJson.ketNoiBST());
		
		funtionOrderingJson.docOrdering(funtionOrderingJson.ketNoiBSTSomeFields());
		
	}

	public BinarySearchTree<Ordering> ketNoiBST() throws JsonParseException, JsonMappingException, IOException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		long begin = Calendar.getInstance().getTimeInMillis();
		
		DocFile fai = new DocFile();
		File f = fai.duLieu_ordering();
		
		doiTuongCanMap mapper = new doiTuongCanMap();
		
		List<Ordering> listOrdering = 
				mapper.doiTuongMap().readValue(f, new TypeReference<List<Ordering>>() {
				});
	
		bst5 = new BinarySearchTree<Ordering>(Ordering.class, "pcode","ccode");

		for(int i =0 ; i < listOrdering.size(); i++){	
			
			try {
				bst5.add(listOrdering.get(i));
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
	
	public BinarySearchTree<Ordering> ketNoiBSTSomeFields() throws JsonParseException, JsonMappingException, IOException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		long begin = Calendar.getInstance().getTimeInMillis();
		
		DocFile fai = new DocFile();
		File f = fai.duLieu_ordering();
		
		doiTuongCanMap mapper = new doiTuongCanMap();
		
		List<Ordering> listOrdering = 
				mapper.doiTuongMap().readValue(f, new TypeReference<List<Ordering>>() {
				});
	
		BinarySearchTree<Ordering> bst5 = new BinarySearchTree<Ordering>(Ordering.class, "pcode","ccode");

		for(int i =0 ; i < listOrdering.size(); i++){	
			
			try {
				bst5.addSomeFields(listOrdering.get(i));
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
	
	public void docOrdering(BinarySearchTree<Ordering> bst5) throws JsonParseException, JsonMappingException, IOException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		long begin1 = Calendar.getInstance().getTimeInMillis();
		
		//bst5.dump(true);
		bst5.InThongTin(true);
		
		long end1 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time: " + (end1 - begin1) + " milliseconds");
		
		//``````````````````````````````````````
	
	}
	
	public void timKiemOrdering(BinarySearchTree<Ordering> bst5) {
		long begin2 = Calendar.getInstance().getTimeInMillis();
		
		String s = "PRDdHGHA2A";
//		boolean r = bst5.search(s);	
//		System.out.println("Tim "+s+ " : " + r);
		System.out.println(bst5.search(s));
		
		long end2 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time: " + (end2 - begin2) + " milliseconds");
		
		
	}
	
	public void deleteOrdering(BinarySearchTree<Ordering> bst5) {
		
		long begin3 = Calendar.getInstance().getTimeInMillis();
		
		bst5.remove("PRDdHGHA2A");	
		//bst5.dump(true);
		bst5.InThongTin(true);
		
		long end3 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time: " + (end3 - begin3) + " milliseconds");
	
	}
	
public void NhapVaoDuLieuOrdering(BinarySearchTree<Ordering> bst5) throws IllegalArgumentException, IllegalAccessException {
		
		Scanner scanner = new Scanner(System.in);
		String a,b = "";
		Integer d = 0;
		
		System.out.println("Nhap vao pcode: ");
		a = scanner.nextLine();
		System.out.println("Nhap vao ccode: ");
		b = scanner.nextLine();
		System.out.println("Nhap vao quantity: ");
		d = scanner.nextInt();
	
		Ordering ordering = new Ordering();
		
		ordering.setPcode(a);
		ordering.setCcode(b);
		ordering.setQuantity(d);
		
		bst5.add(ordering);

		bst5.InThongTin(true);
		
	}

	
	public void SapXepOrdering(BinarySearchTree<Ordering> bst5) {
		
		long begin7 = Calendar.getInstance().getTimeInMillis();
	
		bst5.flatten();
		
		//bst5.dump(true);
		bst5.InThongTin(true);
		
		long end7 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Executed Time 1: " + (end7 - begin7) + " milliseconds");
		
		//``````````````````````````````````````
		
		
	}

	
}
