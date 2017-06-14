package bSort_LSD;

import java.util.Arrays;

//“158”, “124”, “238”, “707”, “608”, “250”, “888” 

public class sortByLSD {

	public static void main(String[] args) {
//		String[] a = { "BEG", "ABC", "DCA", "CDB", "ADC", "BCD", "BEF" };

		sortByLSD sortByLSD = new sortByLSD();
		
		 String[] a = { "158", "124", "238",
		 "707", "608", "250", "888" };

//		a = radixSort(a, 2);
//		System.out.println(Arrays.asList(a));
//		a = radixSort(a, 1);
//		System.out.println(Arrays.asList(a));
//		a = radixSort(a, 0);
//		System.out.println(Arrays.asList(a));
		 
		for(int i = 2;i >= 0; i--){
			a = radixSort(a, i);
			sortByLSD.inCacBuoc(i);
			System.out.println(Arrays.asList(a));
		}
		
	}

	private static String[] radixSort(String[] a, int d) {
		// int[] C = new int['G' - 'A' + 1];
		// int[] S = new int['G' - 'A' + 1];

		 int[] C = new int['8'-'0' + 1];
		 int[] S = new int['8'-'0' + 1];

		for (String ak : a) {
			int j = radix(ak, d);
			C[j]++;
		}
		for (int j = 1; j < C.length; j++) {
			S[j] = S[j - 1] + C[j - 1];
			
		}

		String[] aux = new String[a.length];
		for (String ak : a) {
			int j = radix(ak, d);		
			aux[S[j]++] = ak;
			
		}

		return aux;
	}

	private static int radix(String ak, int d) {
//		return ak.charAt(d) - 'A';
		 return ak.charAt(d) - '0';
	}
	
	public void inCacBuoc(int d) {
		switch (d) {
		case 2:
			inGhepChu("don vi");
			break;
		case 1:
			inGhepChu("chuc");
			break;
		case 0:
			inGhepChu("tram");
			break;
		default:
			break;
		}
	}
	
	public void inGhepChu(String wa) {
		System.out.println("Sap xep theo hang "+wa);
	}

}
