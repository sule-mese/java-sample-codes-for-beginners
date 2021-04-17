package örnekler;

import java.util.Scanner;

public class SwitchCaseÝleHesapMakinesi {

	public static void main(String[] args) {
	
		String iþlemler = "1-TOPLAMA ÝÞLEMÝ \n"
			               	+ 
				          "2-ÇIKARMA ÝÞLEMÝ \n"
				            + 
				          "3-ÇARPMA ÝÞLEMÝ \n"
				            +
				          "4-BÖLME ÝÞLEMÝ \n" ;
		
		System.out.println(iþlemler);
		Scanner scan = new Scanner ( System.in);
		
		System.out.print("seçiminiz:");
		int seçim =  scan.nextInt();
		System.out.print("birinci sayý:");
		int a = scan.nextInt();
		System.out.print("ikinci sayý : ");
		int b = scan.nextInt();
		
		
		double sonuç = switch(seçim)
						{
						case 1: yield (a+b);
						case 2: yield (a-b);
						case 3: yield (a*b);
						case 4: yield ((double)a/b);
						default : yield -1;	
						};

		System.out.println("sonuç : " + sonuç);
	}

}
