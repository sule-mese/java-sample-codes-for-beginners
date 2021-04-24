package örnekler;

import java.util.Scanner;

public class KullanýcýdanAlýnan2SayýnýnEbobunuBulma {

	public static int ebobBulma(int sayý1, int sayý2)
	{
		int ebob = 1; // 2 sayýnýn ortak böleni yoksa ebobu 1 dir. 
		
		for(int i=1;i<=sayý1 &&  i<=sayý2; i++)  // i hem sayý 1 den hem sayý 2 den küçük olmalý . ebob sayýlardan büyük çýkamaz
		{
			if(sayý1%i==0 && sayý2%i==0) // i deðeri hem sayý 1 hem sayý 2 ye tam bölünüyorsa  ebob(sayý1,sayý2) = i dir. 
			{
				ebob = i;
			}
		}
		
		return ebob; // en son çýkan ebob deðerini main metoda göndeririz. 
	}
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in); // kullanýcýdan 2 sayý alýrýz. 
		System.out.println("sayý 1 i girin:");
		int sayý1= scan.nextInt();
		System.out.println("sayý 2 yi girin:");
		int sayý2= scan.nextInt();
		System.out.println("2 sayýnýn ebobu = " + ebobBulma(sayý1,sayý2));
		
	}

}
