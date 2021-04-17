package örnekler;

import java.util.Scanner;

public class ÝkiSayýnýnDeðeriniDeðiþtirme {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int birinciSayi;
		int ikinciSayi;
		System.out.print("birinci sayi: ");
		birinciSayi= scan.nextInt();
		System.out.print("ikinci sayi:");
		ikinciSayi=scan.nextInt();
		System.out.println("deðiþiklikten önce birinci sayý :" + birinciSayi + " ikinci sayý :" + ikinciSayi);
		 
		int geçiciDeðiþken = birinciSayi;
		birinciSayi=ikinciSayi;
		ikinciSayi=geçiciDeðiþken;
		
		System.out.println("deðiþiklikten sonra birinci sayý :" + birinciSayi + " ikinci sayý :" + ikinciSayi);
		

	}

}
