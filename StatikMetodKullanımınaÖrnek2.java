
public class StatikMetodKullan�m�na�rnek2 {

	// STAT�K METODLARIN B�R D��ER KULLANIM AMACI HER NESNE ���N AYNI ��� YAPAN B�R METODA �HT�YA� DUYULMASINDANDIR.
	// BU DURUM BELLEKTE KAZAN� SA�LAR.
	
	public static int x;
	
	public static void metod(int a)
	{
		x=a;
	}
	public static void main(String[] args) {
		StatikMetodKullan�m�na�rnek2 s1= new StatikMetodKullan�m�na�rnek2(); // 2 farkl� nesne olu�turduk.
		StatikMetodKullan�m�na�rnek2 s2= new StatikMetodKullan�m�na�rnek2();	
		s1.metod(1); // her nesne i�in metodumuzu �a��rd�k.
		s1.metod(9);
		System.out.println(s1.x); // her nesne i�in sonucumuzu yazd�rd�k.
		System.out.println(s2.x);
		
		/* 
		 * 2 NESNE ���N DE SONU� 9 OLDU . NORMALDE B�R�NE 5 D��ER�NE 9 DE�ER�N� VERM��T�K. BUNUUN SEBEB�
		 * STAT�C METODLAR NESNEYE DE��L SINIFA A�TT�R.
		 * EN SON HANG� DE�ER� VER�RSEK DE���KEN�N DE�ER� O OLARAK KALIR. 
		 */
		
		
		// AYRICA ! STAT�K OLAN METODDAN STAT�K OLMAYAN METODA ER���LEMEZ. MA�N STAT�K METOD OLDU�U ���N D��ERLER� DE STAT�K OLMALIDIR. 
		
		

	}

}
