package örnekler;

import java.util.Scanner;

public class DikÜçgeninHipotenüsünüBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double birinciKenar, ikinciKenar , hipotenüs;
		System.out.print("birinci kenarý giriniz:");
		birinciKenar=scan.nextDouble();
		System.out.print("ikinci kenarý giriniz:");
		ikinciKenar = scan.nextDouble();
		
		hipotenüs = Math.sqrt(birinciKenar*birinciKenar  + ikinciKenar*ikinciKenar);
		System.out.println("hipotenüs : " + hipotenüs);
		
		

	}

}
