package �rnekler;

import java.util.Scanner;

public class KilometreyeG�re�denecekToplamTutar {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("arac�n�z kilometrede ka� kr yak�yor ? [ �rne�in 0,32] :");
		double kilometreBa��naKuru�= scan.nextDouble();
		System.out.print("arac�n�zla ka� kilometre gittiniz ? [ �rne�in 500] : ");
		int gidilenKilometre = scan.nextInt();
		System.out.println("toplam �denecek tutar : "  +   kilometreBa��naKuru�*gidilenKilometre + "TL" );
		

	}

}
