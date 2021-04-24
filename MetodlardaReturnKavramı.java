
public class MetodlardaReturnKavramý {

	//RETURN FONKSÝYONLARDAN ÇIKTI ALMAMIZI SAÐLAYAN BÝR ANAHTAR KELÝMEDÝR. 
	
	
	public static int ikiÝleCarp ( int a)
	{
		return a*2;
	}
	
	public static int ikiÝleTopla( int a)
	{
		return a+2;
	}
	
	public static int dörtÝleÇarp(int a)
	{
		return 4*a;
	}
	
	
	public static int toplama(int a, int b, int c)  // burada elde ettiðimiz toplam deðerini 
	                                               // main metodda da kullanabiliriz. çünkü deðeri maine döndürüyor.
	{
		int toplam = a + b + c;
		return toplam;
	}
	
	
	public static void toplama2(int a,int b, int c) // burada maine deðer döndürmediðimiz için elde edilen deðerler sadece burada geçerli olur.
	{
		int toplam= a + b + c ;
		System.out.println("toplam=" + toplam);
	}
	
	
	public static int deneme(int a)
	{
		return a*2;  //return fonksiyonda en son çalýþan koddur. return dan sonra yazýlan kodlar asla çalýþtýrýlmaz.  döngülerdeki break mantýðý gibidir.
		//a=a+6;
	}
	
	public static void main(String[] args) {
		
		int toplam = toplama(3,5,7);
		System.out.println("toplam = " + toplam);
		toplama2(3,5,7);
		
		
         System.out.println(dörtÝleÇarp(ikiÝleTopla(ikiÝleCarp(8))));//bir fonksiyondan elde ettiðimiz sonucu
         //Baþka bir fonksiyona parametre olarak göndermek istiyorsak da return kullanmalýyýz. 
         }

}
