package �rnekler;

import java.util.Scanner;

public class �kiSay�n�nDe�eriniDe�i�tirme {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int birinciSayi;
		int ikinciSayi;
		System.out.print("birinci sayi: ");
		birinciSayi= scan.nextInt();
		System.out.print("ikinci sayi:");
		ikinciSayi=scan.nextInt();
		System.out.println("de�i�iklikten �nce birinci say� :" + birinciSayi + " ikinci say� :" + ikinciSayi);
		 
		int ge�iciDe�i�ken = birinciSayi;
		birinciSayi=ikinciSayi;
		ikinciSayi=ge�iciDe�i�ken;
		
		System.out.println("de�i�iklikten sonra birinci say� :" + birinciSayi + " ikinci say� :" + ikinciSayi);
		

	}

}
