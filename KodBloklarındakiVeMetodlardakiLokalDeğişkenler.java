
public class KodBloklar�ndakiVeMetodlardakiLokalDe�i�kenler {

	
	
	public static void toplama(int a, int b, int c) // a , b, ve c toplama metodunun lokal de�i�kenidir. bu metoddan ��k�nca bellekten silinir. 
	{
		System.out.println("toplama sonucu=" + (a+b+c));
	}
	public static void main(String[] args) {
		int a = 4;  // main metodunun lokal de�i�kenidir. 
		String yazd�r = "merhaba"; //main metodunun lokal de�i�kenidir. 
		
		
		if(a < 10)
		{
			int b=5; // if blo�unun lokal de�i�kenidir. if in d���na ��k�nca bellekten silinir ve kullan�lamaz.
			System.out.println(yazd�r); 
		}
		// b=10; //hata! 
		
		
		//------------------------------------------------------------------------------------------
		
		
		
		for(int i=0;i<20;i++)   // i for d�ng�s� blo�unun lokal de�i�kenidir. for d�ng�s� d���na ��k�nca kullan�lamaz. hata verir.
		{
			System.out.println(i);
		}
		
		//i=20;  hata verir. 
		
		
		toplama(10,20,30);
		

	}
	
	
	

}
