import java.util.Scanner;

public class StatikDe�i�kenKullan�m�na�rnek2 {
     
	static double delta; // STAT�K TANIMLADI�IMIZ ���N k�kBul() FONKS�YONUNDA KULLANAB�LD�K. 
	
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("3 say� giriniz:");
		int x1=scan.nextInt();
		int x2=scan.nextInt();
		int x3=scan.nextInt();
		
		k�kBul(x1,x2,x3);
	}
	
	
	public static void k�kBul(int a , int b , int c)
	{
		delta = b*b-4*a*c;
		
		if(delta>0)
		{
			double x1 = ((-b + Math.sqrt(delta))/(2*a));
			double x2 = ((-b - Math.sqrt(delta))/(2*a));
			System.out.println("2 k�k var . x1=" + x1 + " x2=" + x2);
		}
		else if(delta==0)
		{
			double x1= ((-b)/ (2*a));
			System.out.println(" 1 k�k var. x1=" + x1);
		}
		else if(delta<0)
		{
			System.out.println("reel k�k yoktur.");
		}
	}
	
	

}
