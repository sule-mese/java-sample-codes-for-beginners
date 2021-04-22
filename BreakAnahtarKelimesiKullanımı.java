package örnekler;

import java.util.Scanner;

public class BreakAnahtarKelimesiKullanýmý {

	public static void main(String[] args) {
		
		//----------------------------------------------------------------------------
		
		
		
		//bu örnekte a dan e ye kadar olan karakterler ve ascii deðerleri bastýrýlacaktýr.
		//  karakter d ye eþit ise döngü kýrýlacaktýr. 
		char karakter='a';
		
		while(karakter!='e')
		{

		    System.out.println(karakter + "=" + (int)karakter);
			karakter++;
			
			if(karakter=='d')
				break;
		}
		
		
		//----------------------------------------------------------------------------------
		
		
		
		//bu örnekte  sürekli kullanýcýdan sayý alýnýr. alýnan sayý -1 e eþit olduðu anda döngü sonlanýr ve program biter.
		//while(true) döngüsünde döngünün herhangi biryerinde break kullanmazsak döngü sonsuza kadar sürer.
		//break  komutu bu döngünün sonsuza kadar sürmesini engeller. 
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("bir sayý giriniz:");
			int sayi= scan.nextInt();
		
			
			if(sayi==-1)
			{
				System.out.println("döngü sonlandý...");
				break;
			}
		}
		
		//---------------------------------------------------------------------------------------
		
		
		//bu örnekte kullanýcý klavyeden seçim yapar. yaptýðý seçim 4 e eþit ise bu programdan çýkýþ anlamýna gelir
		// ve  ekranda teþekkür ederiz  yazýsýný görür. program sonlanýr.
		
		while(true)
		{
			
		
				System.out.print("1-Para Çekme\n"
						+ "2-Para Yatýrma\n"
						+ "3-Bakiye Görüntüleme\n"
						+ "4-Programdan Çýkýþ...\n"
						+ "lütfen yapacaðýnýz iþlemi seçiniz:");
				
				
				int islem= scan.nextInt();
				
				if(islem==4)
				{
					System.out.println("teþekkür ederiz... :)");
					break;
				}
		
		}
		 
		//--------------------------------------------------------------------------------
		
		
	}

}
