package �rnekler;

import java.util.Scanner;

public class MetodOverloading�leHesapMakinesi {

	
	
	
	public static int ��karma(int a, int b) // 2 de�er al�yor
	{
		return a-b;
	}
	
	public static double b�lme(int a, int b) // 2 de�er al�yor
	{
		return (double)a/b;
	}
	
	
	public static int toplama(int a, int b) //2de�er al�yor
	{
		return a+b;
	}
	
	public static int toplama(int a, int b ,int c) // 3de�er al�yor 
	{
		return a+b+c;
	}
	
	public static int �arpma(int a,int b)//2 de�er al�yor
	{
		return a*b;
	}
	public static int �arpma(int a,int b,int c) //3 de�er al�yor
	{
		return a*b*c;
	}
	public static void main(String[] args) {
	   
		Scanner scan= new Scanner ( System.in);
		String i�lemler= "1-toplama\n"
				+ "2-��karma\n"
				+ "3-�arpma\n"
				+ "4-b�lme\n"
				+ "��k�� i�in q ya bas�n...";
		System.out.println("------------------------------------------------------------------");
		System.out.println(i�lemler);
		System.out.println("------------------------------------------------------------------");
		
		
		while(true)
		{
			System.out.print("i�lemi se�iniz:");
		    String i�lem=scan.nextLine();
		    
		    
		    if(i�lem.equals("1"))
		    {
		    	System.out.println("Ka� de�er toplayacaks�n�z?  (2 veya 3) :");
		    	int ka�Say�=scan.nextInt();
		    	
		    	
					if(ka�Say�==2)
					{
						System.out.println("say� 1:");
						int a= scan.nextInt();
						System.out.println("say� 2:");
						int b= scan.nextInt();
						scan.nextLine(); //dummy kod.
						System.out.println("girilen say�lar�n toplam� :" + toplama(a,b));
					}
					else if(ka�Say�==3)
					{
						System.out.println("say� 1:");
						int a= scan.nextInt();
						System.out.println("say� 2:");
						int b= scan.nextInt();
						System.out.println("say� 3:");
						int c = scan.nextInt();
						scan.nextLine(); //dummy kod.
						System.out.println("girilen say�lar�n toplam� :" + toplama(a,b,c));
					}
					else
					{
						System.out.println("bunun i�in uygun metod bulunmuyor...");
					}
		    }
		    
		    
		    
		    else if(i�lem.equals("2"))
		    {
				System.out.println("say� 1:");
				int a= scan.nextInt();
				System.out.println("say� 2:");
				int b= scan.nextInt();
				scan.nextLine(); //dummy kod.
				System.out.println("girilen say�lar�n fark� :" + ��karma(a,b));
		    }
		    else if(i�lem.equals("3"))
		    {
		    	System.out.println("Ka� de�er �arpacaks�n�z?  (2 veya 3) :");
		    	int ka�Say�=scan.nextInt();
		    	
		    	
					if(ka�Say�==2)
					{
						System.out.println("say� 1:");
						int a= scan.nextInt();
						System.out.println("say� 2:");
						int b= scan.nextInt();
						scan.nextLine(); //dummy kod.
						System.out.println("girilen say�lar�n �arp�m� :" + �arpma(a,b));
					}
					else if(ka�Say�==3)
					{
						System.out.println("say� 1:");
						int a= scan.nextInt();
						System.out.println("say� 2:");
						int b= scan.nextInt();
						System.out.println("say� 3:");
						int c = scan.nextInt();
						scan.nextLine(); //dummy kod.
						System.out.println("girilen say�lar�n �arp�m� :" + �arpma(a,b,c));
					}
					else
					{
						System.out.println("bunun i�in uygun metod bulunmuyor...");
					}
		    }
		    else if(i�lem.equals("4"))
		    {
				System.out.println("say� 1:");
				int a= scan.nextInt();
				System.out.println("say� 2:");
				int b= scan.nextInt();
				scan.nextLine(); //dummy kod.
				System.out.println("girilen say�lar�n b�l�m� :" + b�lme(a,b));
		    }
		    else if(i�lem.equals("q"))
		    {
		    	System.out.println("programdan ��k�l�yor...");
		    	break;
		    }
		    
		    else
		    {
		    	System.out.println("bunun i�in uygun metod bulunmuyor...");
		    }
		}
		
		
	}

}
