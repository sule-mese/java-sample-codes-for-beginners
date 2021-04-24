package örnekler;

import java.util.Scanner;

public class RecursiveİleGönderilenParametreyeKadarOlanSayılarınToplamı {

	public static long sayılarıTopla(int sayı)
	{
		if(sayı==1)
		{
			return 1;
		}
		else
		{
			return sayı + sayılarıTopla(sayı-1);
		}
	}
	public static void main(String[] args) {
		
		//örneğin metoda gönderilen sayı 10 ise 1 den 10 a kadar olan sayıların toplamını bulan metodu recursive ile yazınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("sayı :");
		int sayı = scan.nextInt();
		System.out.println(sayılarıTopla(sayı));

	}

}
