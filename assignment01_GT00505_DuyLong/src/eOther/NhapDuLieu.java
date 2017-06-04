package eOther;

import aStructure.BinarySearchTree;
import java.lang.reflect.Field;
import java.util.Scanner;

public class NhapDuLieu<T> {

	public T k;
	public Class<?> lopThamSo;
	public Field[] fields;
	//public Field f,f2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}
	
	
	
	public NhapDuLieu() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public NhapDuLieu(Class<T> tlop) throws InstantiationException, IllegalAccessException {
		this.k = tlop.newInstance();
		lopThamSo = k.getClass();
		fields = lopThamSo.getDeclaredFields();
	}



	public void NhapVao() {
		
		Scanner scanner = new Scanner(System.in);
		
		for(Field field : fields){
			
			System.out.println("Nhap vao "+field);
			
		}
		
	}

}
