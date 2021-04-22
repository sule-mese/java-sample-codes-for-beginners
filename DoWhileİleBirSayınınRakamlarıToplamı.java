package örnekler;

import java.util.Scanner;

public class DoWhileÝleBirSayýnýnRakamlarýToplamý {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("sayýyý giriniz:");
		int sayý= scan.nextInt();
		int toplam=0;
		do
		{
			toplam+= (sayý % 10);
			sayý = sayý / 10;	
			
		}while(sayý>0);
		
		System.out.println("sayýnýn rakamlarý toplamý = " + toplam);
		

	}

}
