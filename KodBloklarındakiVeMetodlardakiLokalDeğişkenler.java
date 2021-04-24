
public class KodBloklarýndakiVeMetodlardakiLokalDeðiþkenler {

	
	
	public static void toplama(int a, int b, int c) // a , b, ve c toplama metodunun lokal deðiþkenidir. bu metoddan çýkýnca bellekten silinir. 
	{
		System.out.println("toplama sonucu=" + (a+b+c));
	}
	public static void main(String[] args) {
		int a = 4;  // main metodunun lokal deðiþkenidir. 
		String yazdýr = "merhaba"; //main metodunun lokal deðiþkenidir. 
		
		
		if(a < 10)
		{
			int b=5; // if bloðunun lokal deðiþkenidir. if in dýþýna çýkýnca bellekten silinir ve kullanýlamaz.
			System.out.println(yazdýr); 
		}
		// b=10; //hata! 
		
		
		//------------------------------------------------------------------------------------------
		
		
		
		for(int i=0;i<20;i++)   // i for döngüsü bloðunun lokal deðiþkenidir. for döngüsü dýþýna çýkýnca kullanýlamaz. hata verir.
		{
			System.out.println(i);
		}
		
		//i=20;  hata verir. 
		
		
		toplama(10,20,30);
		

	}
	
	
	

}
