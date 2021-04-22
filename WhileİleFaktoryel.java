package örnekler;

import java.util.Scanner;

public class WhileÝleFaktoryel {

	public static void main(String[] args) {
		int carpim = 1;

	 Scanner scan = new Scanner(System.in);
	 System.out.print("faktoryelini almak istediginiz sayýyý giriniz:");
	 int number=scan.nextInt();
	 
	 if(number<0)
	 {
		 System.out.println("negatif sayýlarýn faktoryeli yoktur. ");
	 }
	
	 
	 else if( number==0)
	 {
		 System.out.println("0! = 1");
	 }
	 else
	 {
		 while(number>0)
		 {
			carpim *=number;
		    number--;
		 }
		 System.out.println("number!=" + carpim);
	 }
	

	}

}
