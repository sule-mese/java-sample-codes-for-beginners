package örnekler;

import java.util.Scanner;

public class BedenKitleİndeksindeKoşulluDurumlar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("kilonuzu giriniz:");
		int kilo = scan.nextInt();
		System.out.print("boyunuzu giriniz ( örneğin 1,72metre ) :");
		double boy = scan.nextDouble();
		double bedenKitleİndeksi = kilo/ (boy*boy);
		System.out.println("beden kitle indeksiniz:" + bedenKitleİndeksi);
		
		if(bedenKitleİndeksi < 18.5)
		{
			System.out.println("zayıf");
		}
		else if(bedenKitleİndeksi< 25)
		{
			System.out.println("normal");
		}
		else if(bedenKitleİndeksi<30)
		{
			System.out.println("fazla kilolu");
		}
		else
		{
			System.out.println("obez");
		}

	}

}
