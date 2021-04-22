package örnekler;

import java.util.Scanner;

public class DöngülerleAtmProgramý {

	public static void main(String[] args) {
		
		// Döngüler ile Atm Programý yapalým...
		
		/*
		 * 1. iþlemimiz - bakiye öðrenme
		 * 2. iþlemimiz - para çekme
		 * 3. iþlemimiz - para yatýrma 
		 * olsun. 
		 * çýkýþ - q 
		 */
		
		Scanner scan = new Scanner(System.in);
		int bakiye = 1000;
		String iþlemler="1.iþlem - Bakiye Öðrenme\n" 
				        + "2. iþlem - Para Çekme\n"
				       + "3. iþlem - Para Yatýrma\n"
				        + "Çýkýþ için q  ya basýn";
		
		System.out.println("*********************************************");
		System.out.println(iþlemler);
		System.out.println("*********************************************");
		
		while(true)
		{
			System.out.println("iþlemi seçiniz:");
		     String iþlem=scan.nextLine();
			
			if(iþlem.equals("q"))
			{
				System.out.println("programdan çýkýlýyor...");
				break;
			}
			
			else if(iþlem.equals("1"))
			{
				System.out.println("Bakiyeniz:" + bakiye + "TL dir.");
			}
			
			else if(iþlem.equals("2"))
			{
				System.out.println("çekmek istediðiniz tutar ? :");
				int çekmekÝstenilenTutar = scan.nextInt();
				scan.nextLine();
				if(bakiye-çekmekÝstenilenTutar<0)
				{
					System.out.println("yeterli bakiyeniz bulunmamaktadýr.");
				}
				
				else
				{
					bakiye-=çekmekÝstenilenTutar;
					System.out.println("yeni bakiye : " + bakiye);
				}
			}
			
			else if(iþlem.equals("3"))
			{
				System.out.println("yatýrmak istediginiz tutar:");
				int yatýrýlmakÝstenenTutar=scan.nextInt();
				scan.nextLine();
				bakiye+=yatýrýlmakÝstenenTutar;
				System.out.println("yeni bakiye:" + bakiye);
			}
		}

	}

}
