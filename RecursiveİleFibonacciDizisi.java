package örnekler;

import java.util.Scanner;

public class RecursiveÝleFibonacciDizisi {

	// bu dizi istediðimiz indisteki fibonacci deðerini döndürür. 
	
	public static int  istenenÝndistekiFibonacciDeðeriniDöndür(int indis)
	{
		if(indis<0)
		{
			System.out.println("lütfen 0 veya 0 dan büyük indis giriniz");
			return 0;
		}
		else if(indis<=1)
		{
			return indis;
		}
		else
		{
			return  istenenÝndistekiFibonacciDeðeriniDöndür(indis-1) + istenenÝndistekiFibonacciDeðeriniDöndür(indis-2);
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in);
		System.out.println("lütfen indis giriniz:");
		int indis = scan.nextInt();
		System.out.println("indisteki deðer :" + istenenÝndistekiFibonacciDeðeriniDöndür(indis));
		
		

	}

}
