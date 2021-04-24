
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
		
		
		// ayný isimde fonksiyonlar tanýmlayabiliriz ancak bu fonksiyonlarda
		//parametre tipleri
		//parametre sýralarý
		// yada parametre sayýlarýndan en az biri farklý olmalýdýr. 
		
		
		
		//derleyici verdiðimiz parametre sayýsýndan , sýrasýndan yada tipinden hangi fonksiyonu çaðýrmasý
		//gerektiðini anlayacaktýr. 
		
		
		toplama(1);
		toplama(1,2);
		toplama(1,2d);
		toplama(1,2,3);
		toplama("mustafa" , "murat coþkun");
		
	
		

	}

}
