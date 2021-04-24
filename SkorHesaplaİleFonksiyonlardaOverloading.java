import java.util.Scanner;

public class SkorHesaplaÝleFonksiyonlardaOverloading {

	public static void skorHesapla(String isim, int puan) // kullanýcý hem isim hem puan girerse bu fonksiyon çalýþtýrýlýr. 
	{
		System.out.println(isim + " adlý kullanýcýnýn " + puan + " puaný vardýr.");
	}
	
	public static void skorHesapla(int puan) // kullanýcý sadece puan girerse bu fonksiyon çalýþtýrýlýr.
	{
		System.out.println("isimsiz kullanýcýnýn " + puan + " puaný vardýr.");
	}
	
	public static void skorHesapla(String isim) // kullanýcý sadece isim girerse bu fonksiyon çalýþtýrýlýr. 
	{
		System.out.println(isim + " adlý kullanýcýnýn puaný yoktur.");
	}
	
	
	public static void main(String[] args) {
		
		skorHesapla("ayþe",100);
		skorHesapla(55);
		skorHesapla("mehmet");
		

	}

}
