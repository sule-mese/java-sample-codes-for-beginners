package �rnekler;

import java.util.Scanner;

public class BreakAnahtarKelimesiKullan�m� {

	public static void main(String[] args) {
		
		//----------------------------------------------------------------------------
		
		
		
		//bu �rnekte a dan e ye kadar olan karakterler ve ascii de�erleri bast�r�lacakt�r.
		//  karakter d ye e�it ise d�ng� k�r�lacakt�r. 
		char karakter='a';
		
		while(karakter!='e')
		{

		    System.out.println(karakter + "=" + (int)karakter);
			karakter++;
			
			if(karakter=='d')
				break;
		}
		
		
		//----------------------------------------------------------------------------------
		
		
		
		//bu �rnekte  s�rekli kullan�c�dan say� al�n�r. al�nan say� -1 e e�it oldu�u anda d�ng� sonlan�r ve program biter.
		//while(true) d�ng�s�nde d�ng�n�n herhangi biryerinde break kullanmazsak d�ng� sonsuza kadar s�rer.
		//break  komutu bu d�ng�n�n sonsuza kadar s�rmesini engeller. 
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("bir say� giriniz:");
			int sayi= scan.nextInt();
		
			
			if(sayi==-1)
			{
				System.out.println("d�ng� sonland�...");
				break;
			}
		}
		
		//---------------------------------------------------------------------------------------
		
		
		//bu �rnekte kullan�c� klavyeden se�im yapar. yapt��� se�im 4 e e�it ise bu programdan ��k�� anlam�na gelir
		// ve  ekranda te�ekk�r ederiz  yaz�s�n� g�r�r. program sonlan�r.
		
		while(true)
		{
			
		
				System.out.print("1-Para �ekme\n"
						+ "2-Para Yat�rma\n"
						+ "3-Bakiye G�r�nt�leme\n"
						+ "4-Programdan ��k��...\n"
						+ "l�tfen yapaca��n�z i�lemi se�iniz:");
				
				
				int islem= scan.nextInt();
				
				if(islem==4)
				{
					System.out.println("te�ekk�r ederiz... :)");
					break;
				}
		
		}
		 
		//--------------------------------------------------------------------------------
		
		
	}

}
