package �rnekler;

import java.util.Scanner;

public class �zyineleme�leFaktoryelBulma {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("lutfen faktoryeli alinacak sayiyiyi giriniz:");
	int faktoryeliAlinacakSayi = scan.nextInt();
	faktoryel(faktoryeliAlinacakSayi);
	int sonu�=faktoryel(faktoryeliAlinacakSayi);
	System.out.println("sonu�=" + sonu�);
	

	}
	
	public static int faktoryel(int i)
	{
		
		
		
		 if(i>=1)
		 {
			 return i * faktoryel(i-1);
		 }
		 else
		 { 
			 return 1;
		 }
		 
	}

}
