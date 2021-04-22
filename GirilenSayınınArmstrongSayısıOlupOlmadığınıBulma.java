package örnekler;

import java.util.Scanner;

public class GirilenSayýnýnArmstrongSayýsýOlupOlmadýðýnýBulma {

	public static void main(String[] args) {
		//Girilen  bir sayýnýn armstrong sayýsý olup olmadýðýný anlamaya çalýþýn.
		//Örneðin 4 basamaklý bir sayýnýn armstrong sayýsý olmasý için þu þartý saðlamasý gerekiyor.
		// 1634 = 1^4 + 6^4  + 3^4  + 4^4 (buradaki 4 basamak sayýsý )
		// 371 = 3^3 + 7^3 + 1^3 ( buradaki 3 basamak sayýsý)
		
		//bu programý do while ile de yapabilirsiniz.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("bir sayý giriniz:");
		int sayý=scan.nextInt();
		int basamakSayýsý=0;
		
		int geçiciDeðiþken1=sayý;
		int geçiciDeðiþken2=sayý;

		while(geçiciDeðiþken1>0)
		{
			geçiciDeðiþken1=geçiciDeðiþken1/10;
			basamakSayýsý++;
		}
		System.out.println("sayýnýn basamak sayýsý :" + basamakSayýsý);
		
		
		int toplam=0;
		while(geçiciDeðiþken2>0)
		{
			int basamakDeðeri = geçiciDeðiþken2 % 10;
			geçiciDeðiþken2 = geçiciDeðiþken2 / 10;
			toplam += Math.pow(basamakDeðeri, basamakSayýsý);
		}
		
		if(sayý==toplam)
		{
			System.out.println("sayý armstrong sayýsýdýr. ");
		}
		else
		{
			System.out.println("bu sayý bir armstrong sayýsý deðildir.");
		}

	}

}
