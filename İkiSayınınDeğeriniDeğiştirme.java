package örnekler;

import java.util.Scanner;

public class İkiSayınınDeğeriniDeğiştirme {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int birinciSayi;
		int ikinciSayi;
		System.out.print("birinci sayi: ");
		birinciSayi= scan.nextInt();
		System.out.print("ikinci sayi:");
		ikinciSayi=scan.nextInt();
		System.out.println("değişiklikten önce birinci sayı :" + birinciSayi + " ikinci sayı :" + ikinciSayi);
		 
		int geçiciDeğişken = birinciSayi;
		birinciSayi=ikinciSayi;
		ikinciSayi=geçiciDeğişken;
		
		System.out.println("değişiklikten sonra birinci sayı :" + birinciSayi + " ikinci sayı :" + ikinciSayi);
		

	}

}
