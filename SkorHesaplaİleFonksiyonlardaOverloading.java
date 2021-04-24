import java.util.Scanner;

public class SkorHesapla�leFonksiyonlardaOverloading {

	public static void skorHesapla(String isim, int puan) // kullan�c� hem isim hem puan girerse bu fonksiyon �al��t�r�l�r. 
	{
		System.out.println(isim + " adl� kullan�c�n�n " + puan + " puan� vard�r.");
	}
	
	public static void skorHesapla(int puan) // kullan�c� sadece puan girerse bu fonksiyon �al��t�r�l�r.
	{
		System.out.println("isimsiz kullan�c�n�n " + puan + " puan� vard�r.");
	}
	
	public static void skorHesapla(String isim) // kullan�c� sadece isim girerse bu fonksiyon �al��t�r�l�r. 
	{
		System.out.println(isim + " adl� kullan�c�n�n puan� yoktur.");
	}
	
	
	public static void main(String[] args) {
		
		skorHesapla("ay�e",100);
		skorHesapla(55);
		skorHesapla("mehmet");
		

	}

}
