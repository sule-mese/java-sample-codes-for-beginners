
public class MetodlardaReturnKavram� {

	//RETURN FONKS�YONLARDAN �IKTI ALMAMIZI SA�LAYAN B�R ANAHTAR KEL�MED�R. 
	
	
	public static int iki�leCarp ( int a)
	{
		return a*2;
	}
	
	public static int iki�leTopla( int a)
	{
		return a+2;
	}
	
	public static int d�rt�le�arp(int a)
	{
		return 4*a;
	}
	
	
	public static int toplama(int a, int b, int c)  // burada elde etti�imiz toplam de�erini 
	                                               // main metodda da kullanabiliriz. ��nk� de�eri maine d�nd�r�yor.
	{
		int toplam = a + b + c;
		return toplam;
	}
	
	
	public static void toplama2(int a,int b, int c) // burada maine de�er d�nd�rmedi�imiz i�in elde edilen de�erler sadece burada ge�erli olur.
	{
		int toplam= a + b + c ;
		System.out.println("toplam=" + toplam);
	}
	
	
	public static int deneme(int a)
	{
		return a*2;  //return fonksiyonda en son �al��an koddur. return dan sonra yaz�lan kodlar asla �al��t�r�lmaz.  d�ng�lerdeki break mant��� gibidir.
		//a=a+6;
	}
	
	public static void main(String[] args) {
		
		int toplam = toplama(3,5,7);
		System.out.println("toplam = " + toplam);
		toplama2(3,5,7);
		
		
         System.out.println(d�rt�le�arp(iki�leTopla(iki�leCarp(8))));//bir fonksiyondan elde etti�imiz sonucu
         //Ba�ka bir fonksiyona parametre olarak g�ndermek istiyorsak da return kullanmal�y�z. 
         }

}
