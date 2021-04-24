package örnekler;

import java.util.Scanner;

public class RecursiveMetodÝleFaktöriyel {

	
	public static long faktoryel(int sayý)
	{
		
		if(sayý==1)
			return 1;
		else
		{
			return sayý* faktoryel(sayý-1);
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in);
		System.out.println("sayý:");
		int sayý = scan.nextInt();
		System.out.println("sonuç=" + faktoryel(sayý));
	}

}
