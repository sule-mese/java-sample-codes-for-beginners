package örnekler;

import java.util.Scanner;

public class KapsamlýVizeFinalHarfnotuHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("vize 1:");
		double vize1=scan.nextDouble();
		System.out.println("vize 2:");
		double vize2=scan.nextDouble();
		System.out.println("final:");
		double finalNot=scan.nextDouble();
		double toplamNot=0.3*vize1 + 0.3*vize2 + 0.4*finalNot;
		
		
		if(toplamNot>90)
		{
			System.out.println("AA aldýnýz.");
		}
		else if(toplamNot>80)
		{
			System.out.println("BB aldýnýz.");
		}
		else if(toplamNot>70)
		{
			System.out.println("CC aldýnýz.");
		}
		else if(toplamNot>60)
		{
			System.out.println("DD aldýnýz.");
		}
		else if(toplamNot>50)
		{
			System.out.println("FF aldýnýz.");
		}
		else
		{
			System.out.println("kaldýnýz.");
		}
		
		
		

	}

}
