package örnekler;

class ContinueAnahtarKelimesi{

	public static void main(String[] args) {
	
		//----------------------------------------------------------------------------------------------------
		
		
		//bu örnekte 0 ile 20 arasýndaki sayýlar ekrana yazdýrýlacaktýr eðer sayý 3 yada 5 e eþit ise if in içine girilecek 
		//ve continue nedeniyle  alttaki satýrlar iþlenmeden döngünün baþýna bir sonraki deðerle geri dönülecektir. 
		for(int i=0;i<20;i++)
		{
			if(i==3 || i==5)
				continue;
			System.out.println("i=" + i);
		}
		
		
		//--------------------------------------------------------------------------------------------------
		 //bu örnekte 0 ile 10 arasýndaki sayýlar ekrana yazdýrýlacaktýr. sayý eðer 3 yada 5 e eþit ise continue ile 
		// bir sonraki deðerden döngünün baþýna geri dönülecektir. 
		
		int sayý=0;
		while(sayý<10)
		{
			
			if(sayý==3 || sayý==5)
			{
				sayý++;  // bunu yazmazsak sayý 3 e eþit oldugunda  alttaki komutlarý iþlemez  . sayýnýn deðerini arttýrmadan continue ile tekrar baþa döner ama sayý deðeri hala 3 kalýr.
				//böylece program sonsuza kadar devam eder. 
				continue;
			}
				
			System.out.println("sayý=" + sayý);
			sayý++;
		}
		
	}
}
			