
public class BinaryOctalHexadecimalIntegers {

	
	public static void main(String[] args) {

		int sayi1 = 0b1010;
		int sayi2 = 0132;
		int sayi3 = 0x5a;
		
		long sayi4 = 0b1010L;
		byte sayi5 = 017;
		short sayi6 = 0x5a;

		System.out.println(sayi1 + " " + sayi2 + " " + sayi3);
		System.out.println(sayi4 + " " + sayi5 + " " + sayi6);
		
		int sayi7 = sayi1 + sayi2 + sayi3;
		int sayi8 = sayi1 * sayi2 * sayi3;
//		
		System.out.println(sayi7);
		System.out.println(sayi8);
//		
		//Java.lang.Integer.decode () i�ine string �eklinde ondal�k onalt�l�k veya sekizlik 
		//say� al�r . ve onun de�erini bir tamsay� de�i�kene atar. 
		Integer anInt = Integer.decode("0x6b");
		Integer anotherInt = Integer.decode("8");
		
		
		System.out.println(anotherInt);
		System.out.println(anInt);
		
	}
	
	
}
