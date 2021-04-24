
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
		
		
		// aynı isimde fonksiyonlar tanımlayabiliriz ancak bu fonksiyonlarda
		//parametre tipleri
		//parametre sıraları
		// yada parametre sayılarından en az biri farklı olmalıdır. 
		
		
		
		//derleyici verdiğimiz parametre sayısından , sırasından yada tipinden hangi fonksiyonu çağırması
		//gerektiğini anlayacaktır. 
		
		
		toplama(1);
		toplama(1,2);
		toplama(1,2d);
		toplama(1,2,3);
		toplama("mustafa" , "murat coşkun");
		
	
		

	}

}
