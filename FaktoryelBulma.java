package örnekler;

import java.util.Scanner;

public class FaktoryelBulma {

	public static void main(String[] args) {

Scanner scan= new Scanner(System.in);
System.out.print("faktoryeli alinacak sayiyi giriniz:");
int faktoryeliAlinacakSayi=scan.nextInt();

if(faktoryeliAlinacakSayi<0)
{
	System.out.println(" negatif sayýlarýn faktöryeli olamaz.");
}
else if(faktoryeliAlinacakSayi==0)
{
	System.out.println("0! = 1");
}
else
{
	int faktoryel=1;
	int sayininOrjinaliniTut=faktoryeliAlinacakSayi;	
	
	for(int i=1;i<=faktoryeliAlinacakSayi;i++)
	{
		faktoryel*=i;
	}
	System.out.println(sayininOrjinaliniTut + "!= " + faktoryel);
}

}

}
