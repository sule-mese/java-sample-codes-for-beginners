package �rnekler;

import java.util.Scanner;

public class BirAral�ktakiAsalSay�lar�EkranaYazd�rma {

	public static void asalSay�lar�Yazd�r()
	{
		
	
		 
		
		 
		 for(int sayi=2;sayi<=1000;sayi++) // bu d�ng� 2 den 1000 e kadar olan b�t�n say�lar�n asall���n� sorgular.
		 {
			 int sayac=0;
			 for(int i=1; i<=sayi; i++) { // say�dan daha k���k olan b�t�n de�erler i�in kalan de�erine bak�l�r. 1 ve kendisi d���nda de�erlere tam b�l�n�yorsa asal de�ildir. 
				 if(sayi%i==0) 
				 {
					  sayac++; 
				 }
				       
			 }
			 
			 if(sayac==2) {
			 System.out.println(sayi + " Asal");
			 }
			 else {
			 System.out.println(sayi  + " Asal De�il");
			 }
		 }
			 
	}
	public static void main(String[] args) {
		// 1 DEN 1000 E KADAR OLAN ASAL SAYILARI EKRANA YAZDIRALIM.
		//ASAL SAYI KEND�S� VE 1 DI�INDA H��B�R SAYIYA B�L�NMEYEN SAYIYA DEN�R.
		asalSay�lar�Yazd�r();

	}

}
