package �rnekler;

import java.util.Scanner;

public class FaizUygulamas� {

	public static void main(String[] args) {
		// FA�Z UYGULAMASI YAPACA�IZ.
		// KULLANICIDAN ANAPARA DE�ER�N� VE PARASINI KA� YIL VADEL� YATIRMAK �STED��� B�LG�S�N� ALIP
		//VADE SONUNDA OLU�ACAK PARA DE�ER�N� YAZDIRACA�IZ.
		//FA�Z ORANI %6 DIR.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ana paran�z� giriniz:");
		double anaPara=scan.nextDouble();
		System.out.println("ka� y�l vade ile yat�rmak istiyorsunuz:");
		int vade=scan.nextInt();
		
		double  faizOran� = 0.06;
		double toplamPara=anaPara; // toplam para ba�lang��ta anapara kadar olaca��ndan anaparaya e�itlenir. 
		
		for(int i=1;i<=vade;i++) // d�ng� vade say�s� kadar d�ner.
		{
	       toplamPara+=toplamPara*faizOran�; // her y�l  paraya faiz oran�na kar��l�k gelen para eklenir. 
	       System.out.println(i + ". y�l�n sonunda paran�z:" + toplamPara); // her y�l i�in toplam para yazd�r�l�r.
		}
	
		
		System.out.println("\n\n\nAnaparan�z:" + anaPara + "\n" + "Vadeniz:" + vade + "\n" + "Toplam Paran�z:" + toplamPara); // vade sonunda olu�an para yazd�r�l�r. 
				
		
		
	

	}

}
