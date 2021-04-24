
public class MetodlaraGiriþ {

		public static void selamlama()
		{
			System.out.println("merhaba nasýlsýnýz ?");
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
	   /*(eriþim belirleyici)     (ekstra özellikler) ( dönüþ tipi )  ( fonksiyon adý)   (argümanlar)
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
