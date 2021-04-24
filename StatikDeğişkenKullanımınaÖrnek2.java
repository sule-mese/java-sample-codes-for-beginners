import java.util.Scanner;

public class StatikDeðiþkenKullanýmýnaÖrnek2 {
     
	static double delta; // STATÝK TANIMLADIÐIMIZ ÝÇÝN kökBul() FONKSÝYONUNDA KULLANABÝLDÝK. 
	
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("3 sayý giriniz:");
		int x1=scan.nextInt();
		int x2=scan.nextInt();
		int x3=scan.nextInt();
		
		kökBul(x1,x2,x3);
	}
	
	
	public static void kökBul(int a , int b , int c)
	{
		delta = b*b-4*a*c;
		
		if(delta>0)
		{
			double x1 = ((-b + Math.sqrt(delta))/(2*a));
			double x2 = ((-b - Math.sqrt(delta))/(2*a));
			System.out.println("2 kök var . x1=" + x1 + " x2=" + x2);
		}
		else if(delta==0)
		{
			double x1= ((-b)/ (2*a));
			System.out.println(" 1 kök var. x1=" + x1);
		}
		else if(delta<0)
		{
			System.out.println("reel kök yoktur.");
		}
	}
	
	

}
