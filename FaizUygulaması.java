package örnekler;

import java.util.Scanner;

public class FaizUygulamasý {

	public static void main(String[] args) {
		// FAÝZ UYGULAMASI YAPACAÐIZ.
		// KULLANICIDAN ANAPARA DEÐERÝNÝ VE PARASINI KAÇ YIL VADELÝ YATIRMAK ÝSTEDÝÐÝ BÝLGÝSÝNÝ ALIP
		//VADE SONUNDA OLUÞACAK PARA DEÐERÝNÝ YAZDIRACAÐIZ.
		//FAÝZ ORANI %6 DIR.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ana paranýzý giriniz:");
		double anaPara=scan.nextDouble();
		System.out.println("kaç yýl vade ile yatýrmak istiyorsunuz:");
		int vade=scan.nextInt();
		
		double  faizOraný = 0.06;
		double toplamPara=anaPara; // toplam para baþlangýçta anapara kadar olacaðýndan anaparaya eþitlenir. 
		
		for(int i=1;i<=vade;i++) // döngü vade sayýsý kadar döner.
		{
	       toplamPara+=toplamPara*faizOraný; // her yýl  paraya faiz oranýna karþýlýk gelen para eklenir. 
	       System.out.println(i + ". yýlýn sonunda paranýz:" + toplamPara); // her yýl için toplam para yazdýrýlýr.
		}
	
		
		System.out.println("\n\n\nAnaparanýz:" + anaPara + "\n" + "Vadeniz:" + vade + "\n" + "Toplam Paranýz:" + toplamPara); // vade sonunda oluþan para yazdýrýlýr. 
				
		
		
	

	}

}
