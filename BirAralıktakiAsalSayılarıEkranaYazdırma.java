package örnekler;

import java.util.Scanner;

public class BirAralıktakiAsalSayılarıEkranaYazdırma {

	public static void asalSayılarıYazdır()
	{
		
	
		 
		
		 
		 for(int sayi=2;sayi<=1000;sayi++) // bu döngü 2 den 1000 e kadar olan bütün sayıların asallığını sorgular.
		 {
			 int sayac=0;
			 for(int i=1; i<=sayi; i++) { // sayıdan daha küçük olan bütün değerler için kalan değerine bakılır. 1 ve kendisi dışında değerlere tam bölünüyorsa asal değildir. 
				 if(sayi%i==0) 
				 {
					  sayac++; 
				 }
				       
			 }
			 
			 if(sayac==2) {
			 System.out.println(sayi + " Asal");
			 }
			 else {
			 System.out.println(sayi  + " Asal Değil");
			 }
		 }
			 
	}
	public static void main(String[] args) {
		// 1 DEN 1000 E KADAR OLAN ASAL SAYILARI EKRANA YAZDIRALIM.
		//ASAL SAYI KENDİSİ VE 1 DIŞINDA HİÇBİR SAYIYA BÖLÜNMEYEN SAYIYA DENİR.
		asalSayılarıYazdır();

	}

}
