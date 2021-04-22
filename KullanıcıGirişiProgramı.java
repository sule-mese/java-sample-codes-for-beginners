package �rnekler;

import java.util.Scanner;

public class Kullan�c�Giri�iProgram� {

	public static void main(String[] args) {
		// bu �rnekte bir adet kullan�c� giri�i yazmaya �al��aca��z.
		// sanki sistemde kay�tl�ym�� gibi 2 adet de�i�ken tan�mlayaca��z. 
		// sonra kullan�c�dan 2 adet de�er alaca��z.
		// bizim tan�mlad���m�z de�er ile kullan�c�n�n girdi�i de�er ayn� ise giri� yapm�� olacak.
		// kullan�c�n�n yanl�� de�er girmek i�in 3 hakk� vard�r. 
		// 3 hakk� da doldurursa birdaha deneme yapamaz ve program sonlan�r. 
		
		String sistemdeKay�tl�KullaniciAdi="mehmet";
		String sistemdeKay�tl�Parola="12345";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("*****************************************************************");
		System.out.println("kullan�c� giri�ine ho�geldiniz.");
		
		int  giri�Hakk�=3; // kullan�c�n giri� Haklar�n�n say�s�n� tutacak olan de�i�ken 
		while(true)
		{
			System.out.print("kullan�c� ad�:");
			String kullaniciAdi=scan.nextLine();
			System.out.print("parola:");
			String parola =scan.nextLine();
		    if(kullaniciAdi.equals(sistemdeKay�tl�KullaniciAdi) && parola.equals(sistemdeKay�tl�Parola))
		    {
		    	System.out.println("ba�ar�l� giri�...");
		    	break;
		    }
		    
		    else if (!kullaniciAdi.equals(sistemdeKay�tl�KullaniciAdi) && parola.equals(sistemdeKay�tl�Parola))
		    {
		    	System.out.println("kullan�c� ad�n�z hatal�");
		    	giri�Hakk�--;
		    }
		    
		    else if(kullaniciAdi.equals(sistemdeKay�tl�KullaniciAdi) && !parola.equals(sistemdeKay�tl�Parola))
		    {
		    	System.out.println("parolan�z hatal�");
		    	giri�Hakk�--;
		    }
		    
		    else
		    {
		    	
		    	System.out.println("kullan�c� ad� ve parolan�z hatal�...");
		    	giri�Hakk�--;
		    	
		    }
		    
		    
		    if(giri�Hakk�==0)
		    	{
		    		System.out.println("l�tfen daha sonra tekrar deneyin...");
		    		break;
		    	}
			
			
			
		}

	}

}
