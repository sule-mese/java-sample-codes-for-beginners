package �rnekler;

import java.util.Scanner;

public class RecursiveMetod�leFakt�riyel {

	
	public static long faktoryel(int say�)
	{
		
		if(say�==1)
			return 1;
		else
		{
			return say�* faktoryel(say�-1);
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in);
		System.out.println("say�:");
		int say� = scan.nextInt();
		System.out.println("sonu�=" + faktoryel(say�));
	}

}
