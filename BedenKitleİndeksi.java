package örnekler;

import java.util.Scanner;

public class BedenKitleİndeksi {

	public static void main(String[] args) {
	//kullanıcıdan aldığınız boy ve kilo değerlerine göre beden kitle indeksini bulunuz.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("kilonuzu giriniz:");
		int kilo = scan.nextInt();
		System.out.print("boyunuzu giriniz ( örneğin 1,72metre ) :");
		double boy = scan.nextDouble();
		double bedenKitleİndeksi = kilo/ (boy*boy);
		System.out.print("beden kitle indeksiniz:" + bedenKitleİndeksi);
		

	}

}
