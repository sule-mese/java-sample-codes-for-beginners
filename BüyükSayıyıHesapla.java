package �rnekler;

import java.util.Scanner;

public class B�y�kSay�y�Hesapla {

	static int b�y�kSay�; //STAT�K B�R METODDAN STAT�K OLMAYAN B�R DE�ER D�ND�R�LEMEYECE�� ���N BU DE���KEN� DE STAT�K YAPTIK . 
	public static int b�y�kSay�y�D�nd�r(int a , int b)
	{
		if(a>=b)
		{
			b�y�kSay�=a;
			
		}
		else
		{
			b�y�kSay�=b;
		}
		return b�y�kSay�; // STAT�K DE�ER� D�ND�RD�K. 
	}
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		System.out.print("say� 1 ve 2 yi giriniz:");
		int say�1=scan.nextInt();
		int say�2= scan.nextInt();
		
		System.out.println("b�y�k say� : " + b�y�kSay�y�D�nd�r(say�1,say�2));

	}

}
