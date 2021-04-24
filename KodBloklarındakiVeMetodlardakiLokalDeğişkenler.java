
public class KodBloklarındakiVeMetodlardakiLokalDeğişkenler {

	
	
	public static void toplama(int a, int b, int c) // a , b, ve c toplama metodunun lokal değişkenidir. bu metoddan çıkınca bellekten silinir. 
	{
		System.out.println("toplama sonucu=" + (a+b+c));
	}
	public static void main(String[] args) {
		int a = 4;  // main metodunun lokal değişkenidir. 
		String yazdır = "merhaba"; //main metodunun lokal değişkenidir. 
		
		
		if(a < 10)
		{
			int b=5; // if bloğunun lokal değişkenidir. if in dışına çıkınca bellekten silinir ve kullanılamaz.
			System.out.println(yazdır); 
		}
		// b=10; //hata! 
		
		
		//------------------------------------------------------------------------------------------
		
		
		
		for(int i=0;i<20;i++)   // i for döngüsü bloğunun lokal değişkenidir. for döngüsü dışına çıkınca kullanılamaz. hata verir.
		{
			System.out.println(i);
		}
		
		//i=20;  hata verir. 
		
		
		toplama(10,20,30);
		

	}
	
	
	

}
