
public class MetodlardaOverloading {


	    public static void toplama(int a)
		{
			System.out.println(a+2);
		}
	    
	    
	    public static void toplama(int a, int b)
	    {
	    	System.out.println(a+b);
	    }
	    
	    public static void toplama(int a, double b)
	    {
	    	System.out.println(a+b);
	    }
	    
	    
	    public static void toplama(int a , int b , int c)
	    {
	    	System.out.println(a+b+c);
	    }
	    
	    public static void toplama(String a, String b)
	    { 
	    	System.out.println(a +" " + b);
	    }
	    
	    
	    
	public static void main(String[] args) {
		
		
		// ayn� isimde fonksiyonlar tan�mlayabiliriz ancak bu fonksiyonlarda
		//parametre tipleri
		//parametre s�ralar�
		// yada parametre say�lar�ndan en az biri farkl� olmal�d�r. 
		
		
		
		//derleyici verdi�imiz parametre say�s�ndan , s�ras�ndan yada tipinden hangi fonksiyonu �a��rmas�
		//gerekti�ini anlayacakt�r. 
		
		
		toplama(1);
		toplama(1,2);
		toplama(1,2d);
		toplama(1,2,3);
		toplama("mustafa" , "murat co�kun");
		
	
		

	}

}
