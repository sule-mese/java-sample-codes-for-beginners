package örnekler;

import java.util.Scanner;

public class MetodOverloadingÝleHesapMakinesi {

	
	
	
	public static int çýkarma(int a, int b) // 2 deðer alýyor
	{
		return a-b;
	}
	
	public static double bölme(int a, int b) // 2 deðer alýyor
	{
		return (double)a/b;
	}
	
	
	public static int toplama(int a, int b) //2deðer alýyor
	{
		return a+b;
	}
	
	public static int toplama(int a, int b ,int c) // 3deðer alýyor 
	{
		return a+b+c;
	}
	
	public static int çarpma(int a,int b)//2 deðer alýyor
	{
		return a*b;
	}
	public static int çarpma(int a,int b,int c) //3 deðer alýyor
	{
		return a*b*c;
	}
	public static void main(String[] args) {
	   
		Scanner scan= new Scanner ( System.in);
		String iþlemler= "1-toplama\n"
				+ "2-çýkarma\n"
				+ "3-çarpma\n"
				+ "4-bölme\n"
				+ "çýkýþ için q ya basýn...";
		System.out.println("------------------------------------------------------------------");
		System.out.println(iþlemler);
		System.out.println("------------------------------------------------------------------");
		
		
		while(true)
		{
			System.out.print("iþlemi seçiniz:");
		    String iþlem=scan.nextLine();
		    
		    
		    if(iþlem.equals("1"))
		    {
		    	System.out.println("Kaç deðer toplayacaksýnýz?  (2 veya 3) :");
		    	int kaçSayý=scan.nextInt();
		    	
		    	
					if(kaçSayý==2)
					{
						System.out.println("sayý 1:");
						int a= scan.nextInt();
						System.out.println("sayý 2:");
						int b= scan.nextInt();
						scan.nextLine(); //dummy kod.
						System.out.println("girilen sayýlarýn toplamý :" + toplama(a,b));
					}
					else if(kaçSayý==3)
					{
						System.out.println("sayý 1:");
						int a= scan.nextInt();
						System.out.println("sayý 2:");
						int b= scan.nextInt();
						System.out.println("sayý 3:");
						int c = scan.nextInt();
						scan.nextLine(); //dummy kod.
						System.out.println("girilen sayýlarýn toplamý :" + toplama(a,b,c));
					}
					else
					{
						System.out.println("bunun için uygun metod bulunmuyor...");
					}
		    }
		    
		    
		    
		    else if(iþlem.equals("2"))
		    {
				System.out.println("sayý 1:");
				int a= scan.nextInt();
				System.out.println("sayý 2:");
				int b= scan.nextInt();
				scan.nextLine(); //dummy kod.
				System.out.println("girilen sayýlarýn farký :" + çýkarma(a,b));
		    }
		    else if(iþlem.equals("3"))
		    {
		    	System.out.println("Kaç deðer çarpacaksýnýz?  (2 veya 3) :");
		    	int kaçSayý=scan.nextInt();
		    	
		    	
					if(kaçSayý==2)
					{
						System.out.println("sayý 1:");
						int a= scan.nextInt();
						System.out.println("sayý 2:");
						int b= scan.nextInt();
						scan.nextLine(); //dummy kod.
						System.out.println("girilen sayýlarýn çarpýmý :" + çarpma(a,b));
					}
					else if(kaçSayý==3)
					{
						System.out.println("sayý 1:");
						int a= scan.nextInt();
						System.out.println("sayý 2:");
						int b= scan.nextInt();
						System.out.println("sayý 3:");
						int c = scan.nextInt();
						scan.nextLine(); //dummy kod.
						System.out.println("girilen sayýlarýn çarpýmý :" + çarpma(a,b,c));
					}
					else
					{
						System.out.println("bunun için uygun metod bulunmuyor...");
					}
		    }
		    else if(iþlem.equals("4"))
		    {
				System.out.println("sayý 1:");
				int a= scan.nextInt();
				System.out.println("sayý 2:");
				int b= scan.nextInt();
				scan.nextLine(); //dummy kod.
				System.out.println("girilen sayýlarýn bölümü :" + bölme(a,b));
		    }
		    else if(iþlem.equals("q"))
		    {
		    	System.out.println("programdan çýkýlýyor...");
		    	break;
		    }
		    
		    else
		    {
		    	System.out.println("bunun için uygun metod bulunmuyor...");
		    }
		}
		
		
	}

}
