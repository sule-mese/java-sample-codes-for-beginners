package örnekler;

import java.util.Scanner;

public class BedenKitleÝndeksi {

	public static void main(String[] args) {
	//kullanýcýdan aldýðýnýz boy ve kilo deðerlerine göre beden kitle indeksini bulunuz.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("kilonuzu giriniz:");
		int kilo = scan.nextInt();
		System.out.print("boyunuzu giriniz ( örneðin 1,72metre ) :");
		double boy = scan.nextDouble();
		double bedenKitleÝndeksi = kilo/ (boy*boy);
		System.out.print("beden kitle indeksiniz:" + bedenKitleÝndeksi);
		

	}

}
