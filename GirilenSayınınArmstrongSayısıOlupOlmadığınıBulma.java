package �rnekler;

import java.util.Scanner;

public class GirilenSay�n�nArmstrongSay�s�OlupOlmad���n�Bulma {

	public static void main(String[] args) {
		//Girilen  bir say�n�n armstrong say�s� olup olmad���n� anlamaya �al���n.
		//�rne�in 4 basamakl� bir say�n�n armstrong say�s� olmas� i�in �u �art� sa�lamas� gerekiyor.
		// 1634 = 1^4 + 6^4  + 3^4  + 4^4 (buradaki 4 basamak say�s� )
		// 371 = 3^3 + 7^3 + 1^3 ( buradaki 3 basamak say�s�)
		
		//bu program� do while ile de yapabilirsiniz.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("bir say� giriniz:");
		int say�=scan.nextInt();
		int basamakSay�s�=0;
		
		int ge�iciDe�i�ken1=say�;
		int ge�iciDe�i�ken2=say�;

		while(ge�iciDe�i�ken1>0)
		{
			ge�iciDe�i�ken1=ge�iciDe�i�ken1/10;
			basamakSay�s�++;
		}
		System.out.println("say�n�n basamak say�s� :" + basamakSay�s�);
		
		
		int toplam=0;
		while(ge�iciDe�i�ken2>0)
		{
			int basamakDe�eri = ge�iciDe�i�ken2 % 10;
			ge�iciDe�i�ken2 = ge�iciDe�i�ken2 / 10;
			toplam += Math.pow(basamakDe�eri, basamakSay�s�);
		}
		
		if(say�==toplam)
		{
			System.out.println("say� armstrong say�s�d�r. ");
		}
		else
		{
			System.out.println("bu say� bir armstrong say�s� de�ildir.");
		}

	}

}
