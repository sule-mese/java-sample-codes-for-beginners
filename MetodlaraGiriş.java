
public class MetodlaraGiri� {

		public static void selamlama()
		{
			System.out.println("merhaba nas�ls�n�z ?");
			System.out.println("selamlar");
		}
		
		
		public static void faktoryel(int sayi)
		{
			int carpim=1;
			for(int i=sayi;i>0;i--)
			{
				carpim*=i;
			}
			System.out.println(sayi+ "!=" + carpim);
		}
	   /*(eri�im belirleyici)     (ekstra �zellikler) ( d�n�� tipi )  ( fonksiyon ad�)   (arg�manlar)
		{
			
		}
		*/
		
		
   /* (public )  ( static )  (void)     (faktoryel)   ( int a , int b)
		{
			
		}
		*/	
		
		
		public static void main(String[] args) {
		
			selamlama();
			selamlama();
			selamlama();
			faktoryel(5);
			faktoryel(6);
	}

}
