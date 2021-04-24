package �rnekler;

import java.util.Scanner;

public class Recursive�leFibonacciDizisi {

	// bu dizi istedi�imiz indisteki fibonacci de�erini d�nd�r�r. 
	
	public static int  istenen�ndistekiFibonacciDe�eriniD�nd�r(int indis)
	{
		if(indis<0)
		{
			System.out.println("l�tfen 0 veya 0 dan b�y�k indis giriniz");
			return 0;
		}
		else if(indis<=1)
		{
			return indis;
		}
		else
		{
			return  istenen�ndistekiFibonacciDe�eriniD�nd�r(indis-1) + istenen�ndistekiFibonacciDe�eriniD�nd�r(indis-2);
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in);
		System.out.println("l�tfen indis giriniz:");
		int indis = scan.nextInt();
		System.out.println("indisteki de�er :" + istenen�ndistekiFibonacciDe�eriniD�nd�r(indis));
		
		

	}

}
