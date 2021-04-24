package örnekler;

import java.util.Scanner;

public class BüyükSayýyýHesapla {

	static int büyükSayý; //STATÝK BÝR METODDAN STATÝK OLMAYAN BÝR DEÐER DÖNDÜRÜLEMEYECEÐÝ ÝÇÝN BU DEÐÝÞKENÝ DE STATÝK YAPTIK . 
	public static int büyükSayýyýDöndür(int a , int b)
	{
		if(a>=b)
		{
			büyükSayý=a;
			
		}
		else
		{
			büyükSayý=b;
		}
		return büyükSayý; // STATÝK DEÐERÝ DÖNDÜRDÜK. 
	}
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		System.out.print("sayý 1 ve 2 yi giriniz:");
		int sayý1=scan.nextInt();
		int sayý2= scan.nextInt();
		
		System.out.println("büyük sayý : " + büyükSayýyýDöndür(sayý1,sayý2));

	}

}
