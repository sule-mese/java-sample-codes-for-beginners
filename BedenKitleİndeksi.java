package �rnekler;

import java.util.Scanner;

public class BedenKitle�ndeksi {

	public static void main(String[] args) {
	//kullan�c�dan ald���n�z boy ve kilo de�erlerine g�re beden kitle indeksini bulunuz.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("kilonuzu giriniz:");
		int kilo = scan.nextInt();
		System.out.print("boyunuzu giriniz ( �rne�in 1,72metre ) :");
		double boy = scan.nextDouble();
		double bedenKitle�ndeksi = kilo/ (boy*boy);
		System.out.print("beden kitle indeksiniz:" + bedenKitle�ndeksi);
		

	}

}
