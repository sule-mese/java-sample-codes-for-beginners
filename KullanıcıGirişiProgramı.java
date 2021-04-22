package örnekler;

import java.util.Scanner;

public class KullanýcýGiriþiProgramý {

	public static void main(String[] args) {
		// bu örnekte bir adet kullanýcý giriþi yazmaya çalýþacaðýz.
		// sanki sistemde kayýtlýymýþ gibi 2 adet deðiþken tanýmlayacaðýz. 
		// sonra kullanýcýdan 2 adet deðer alacaðýz.
		// bizim tanýmladýðýmýz deðer ile kullanýcýnýn girdiði deðer ayný ise giriþ yapmýþ olacak.
		// kullanýcýnýn yanlýþ deðer girmek için 3 hakký vardýr. 
		// 3 hakký da doldurursa birdaha deneme yapamaz ve program sonlanýr. 
		
		String sistemdeKayýtlýKullaniciAdi="mehmet";
		String sistemdeKayýtlýParola="12345";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("*****************************************************************");
		System.out.println("kullanýcý giriþine hoþgeldiniz.");
		
		int  giriþHakký=3; // kullanýcýn giriþ Haklarýnýn sayýsýný tutacak olan deðiþken 
		while(true)
		{
			System.out.print("kullanýcý adý:");
			String kullaniciAdi=scan.nextLine();
			System.out.print("parola:");
			String parola =scan.nextLine();
		    if(kullaniciAdi.equals(sistemdeKayýtlýKullaniciAdi) && parola.equals(sistemdeKayýtlýParola))
		    {
		    	System.out.println("baþarýlý giriþ...");
		    	break;
		    }
		    
		    else if (!kullaniciAdi.equals(sistemdeKayýtlýKullaniciAdi) && parola.equals(sistemdeKayýtlýParola))
		    {
		    	System.out.println("kullanýcý adýnýz hatalý");
		    	giriþHakký--;
		    }
		    
		    else if(kullaniciAdi.equals(sistemdeKayýtlýKullaniciAdi) && !parola.equals(sistemdeKayýtlýParola))
		    {
		    	System.out.println("parolanýz hatalý");
		    	giriþHakký--;
		    }
		    
		    else
		    {
		    	
		    	System.out.println("kullanýcý adý ve parolanýz hatalý...");
		    	giriþHakký--;
		    	
		    }
		    
		    
		    if(giriþHakký==0)
		    	{
		    		System.out.println("lütfen daha sonra tekrar deneyin...");
		    		break;
		    	}
			
			
			
		}

	}

}
