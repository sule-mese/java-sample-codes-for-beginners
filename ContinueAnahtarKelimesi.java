package �rnekler;

class ContinueAnahtarKelimesi{

	public static void main(String[] args) {
	
		//----------------------------------------------------------------------------------------------------
		
		
		//bu �rnekte 0 ile 20 aras�ndaki say�lar ekrana yazd�r�lacakt�r e�er say� 3 yada 5 e e�it ise if in i�ine girilecek 
		//ve continue nedeniyle  alttaki sat�rlar i�lenmeden d�ng�n�n ba��na bir sonraki de�erle geri d�n�lecektir. 
		for(int i=0;i<20;i++)
		{
			if(i==3 || i==5)
				continue;
			System.out.println("i=" + i);
		}
		
		
		//--------------------------------------------------------------------------------------------------
		 //bu �rnekte 0 ile 10 aras�ndaki say�lar ekrana yazd�r�lacakt�r. say� e�er 3 yada 5 e e�it ise continue ile 
		// bir sonraki de�erden d�ng�n�n ba��na geri d�n�lecektir. 
		
		int say�=0;
		while(say�<10)
		{
			
			if(say�==3 || say�==5)
			{
				say�++;  // bunu yazmazsak say� 3 e e�it oldugunda  alttaki komutlar� i�lemez  . say�n�n de�erini artt�rmadan continue ile tekrar ba�a d�ner ama say� de�eri hala 3 kal�r.
				//b�ylece program sonsuza kadar devam eder. 
				continue;
			}
				
			System.out.println("say�=" + say�);
			say�++;
		}
		
	}
}
			