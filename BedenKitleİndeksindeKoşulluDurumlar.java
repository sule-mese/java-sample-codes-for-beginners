package �rnekler;

import java.util.Scanner;

public class BedenKitle�ndeksindeKo�ulluDurumlar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("kilonuzu giriniz:");
		int kilo = scan.nextInt();
		System.out.print("boyunuzu giriniz ( �rne�in 1,72metre ) :");
		double boy = scan.nextDouble();
		double bedenKitle�ndeksi = kilo/ (boy*boy);
		System.out.println("beden kitle indeksiniz:" + bedenKitle�ndeksi);
		
		if(bedenKitle�ndeksi < 18.5)
		{
			System.out.println("zay�f");
		}
		else if(bedenKitle�ndeksi< 25)
		{
			System.out.println("normal");
		}
		else if(bedenKitle�ndeksi<30)
		{
			System.out.println("fazla kilolu");
		}
		else
		{
			System.out.println("obez");
		}

	}

}
