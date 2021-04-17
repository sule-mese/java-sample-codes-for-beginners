package örnekler;

import java.util.Scanner;

public class ÖzyinelemeİleFaktoryelBulma {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("lutfen faktoryeli alinacak sayiyiyi giriniz:");
	int faktoryeliAlinacakSayi = scan.nextInt();
	faktoryel(faktoryeliAlinacakSayi);
	int sonuç=faktoryel(faktoryeliAlinacakSayi);
	System.out.println("sonuç=" + sonuç);
	

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
