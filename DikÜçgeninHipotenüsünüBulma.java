package �rnekler;

import java.util.Scanner;

public class Dik��geninHipoten�s�n�Bulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double birinciKenar, ikinciKenar , hipoten�s;
		System.out.print("birinci kenar� giriniz:");
		birinciKenar=scan.nextDouble();
		System.out.print("ikinci kenar� giriniz:");
		ikinciKenar = scan.nextDouble();
		
		hipoten�s = Math.sqrt(birinciKenar*birinciKenar  + ikinciKenar*ikinciKenar);
		System.out.println("hipoten�s : " + hipoten�s);
		
		

	}

}
