
public class StatikMetodKullanýmýnaÖrnek2 {

	// STATÝK METODLARIN BÝR DÝÐER KULLANIM AMACI HER NESNE ÝÇÝN AYNI ÝÞÝ YAPAN BÝR METODA ÝHTÝYAÇ DUYULMASINDANDIR.
	// BU DURUM BELLEKTE KAZANÇ SAÐLAR.
	
	public static int x;
	
	public static void metod(int a)
	{
		x=a;
	}
	public static void main(String[] args) {
		StatikMetodKullanýmýnaÖrnek2 s1= new StatikMetodKullanýmýnaÖrnek2(); // 2 farklý nesne oluþturduk.
		StatikMetodKullanýmýnaÖrnek2 s2= new StatikMetodKullanýmýnaÖrnek2();	
		s1.metod(1); // her nesne için metodumuzu çaðýrdýk.
		s1.metod(9);
		System.out.println(s1.x); // her nesne için sonucumuzu yazdýrdýk.
		System.out.println(s2.x);
		
		/* 
		 * 2 NESNE ÝÇÝN DE SONUÇ 9 OLDU . NORMALDE BÝRÝNE 5 DÝÐERÝNE 9 DEÐERÝNÝ VERMÝÞTÝK. BUNUUN SEBEBÝ
		 * STATÝC METODLAR NESNEYE DEÐÝL SINIFA AÝTTÝR.
		 * EN SON HANGÝ DEÐERÝ VERÝRSEK DEÐÝÞKENÝN DEÐERÝ O OLARAK KALIR. 
		 */
		
		
		// AYRICA ! STATÝK OLAN METODDAN STATÝK OLMAYAN METODA ERÝÞÝLEMEZ. MAÝN STATÝK METOD OLDUÐU ÝÇÝN DÝÐERLERÝ DE STATÝK OLMALIDIR. 
		
		

	}

}
