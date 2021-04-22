package �rnekler;

import java.util.Scanner;

public class D�ng�lerleAtmProgram� {

	public static void main(String[] args) {
		
		// D�ng�ler ile Atm Program� yapal�m...
		
		/*
		 * 1. i�lemimiz - bakiye ��renme
		 * 2. i�lemimiz - para �ekme
		 * 3. i�lemimiz - para yat�rma 
		 * olsun. 
		 * ��k�� - q 
		 */
		
		Scanner scan = new Scanner(System.in);
		int bakiye = 1000;
		String i�lemler="1.i�lem - Bakiye ��renme\n" 
				        + "2. i�lem - Para �ekme\n"
				       + "3. i�lem - Para Yat�rma\n"
				        + "��k�� i�in q  ya bas�n";
		
		System.out.println("*********************************************");
		System.out.println(i�lemler);
		System.out.println("*********************************************");
		
		while(true)
		{
			System.out.println("i�lemi se�iniz:");
		     String i�lem=scan.nextLine();
			
			if(i�lem.equals("q"))
			{
				System.out.println("programdan ��k�l�yor...");
				break;
			}
			
			else if(i�lem.equals("1"))
			{
				System.out.println("Bakiyeniz:" + bakiye + "TL dir.");
			}
			
			else if(i�lem.equals("2"))
			{
				System.out.println("�ekmek istedi�iniz tutar ? :");
				int �ekmek�stenilenTutar = scan.nextInt();
				scan.nextLine();
				if(bakiye-�ekmek�stenilenTutar<0)
				{
					System.out.println("yeterli bakiyeniz bulunmamaktad�r.");
				}
				
				else
				{
					bakiye-=�ekmek�stenilenTutar;
					System.out.println("yeni bakiye : " + bakiye);
				}
			}
			
			else if(i�lem.equals("3"))
			{
				System.out.println("yat�rmak istediginiz tutar:");
				int yat�r�lmak�stenenTutar=scan.nextInt();
				scan.nextLine();
				bakiye+=yat�r�lmak�stenenTutar;
				System.out.println("yeni bakiye:" + bakiye);
			}
		}

	}

}
