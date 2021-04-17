package örnekler;

import java.util.Scanner;

public class KilometreyeGöreÖdenecekToplamTutar {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("aracýnýz kilometrede kaç kr yakýyor ? [ örneðin 0,32] :");
		double kilometreBaþýnaKuruþ= scan.nextDouble();
		System.out.print("aracýnýzla kaç kilometre gittiniz ? [ örneðin 500] : ");
		int gidilenKilometre = scan.nextInt();
		System.out.println("toplam ödenecek tutar : "  +   kilometreBaþýnaKuruþ*gidilenKilometre + "TL" );
		

	}

}
