package örnekler;

import java.util.Scanner;

public class KullanıcıdanAlınan3SayıdanEnBüyüğünüBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("birinci sayı:");
		int birinciSayı=scan.nextInt();
		System.out.println("ikinci sayı:");
		int ikinciSayı=scan.nextInt();
		System.out.println("üçüncü sayı:");
		int üçüncüSayı=scan.nextInt();
		
		int enBüyükSayı;
		
		if(birinciSayı>=ikinciSayı &&  birinciSayı >= üçüncüSayı)
			enBüyükSayı=birinciSayı;
		
		else if(ikinciSayı>birinciSayı && ikinciSayı>=üçüncüSayı)
			enBüyükSayı=ikinciSayı;
		else
			enBüyükSayı=üçüncüSayı;
		
		System.out.println("en büyük sayı :"  + enBüyükSayı);
		

	}

}
