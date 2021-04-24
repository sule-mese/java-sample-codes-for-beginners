
public class MetodlardaParametreKullanýmý {

	
	public static void selamlama(String isim) // string parametre 
	{
		System.out.println("selam " + isim);
	}
	
	
	
	
	public static void topla(int sayý1 , int sayý2) //int parametre
	{
	int toplam=sayý1+sayý2;
	System.out.println(sayý1 +  "+" + sayý2 +  "=" + toplam);
	}
	
	
	
	
	public static void main(String[] args) {
		selamlama("murat"); //metodu çaðýrdýk.
		topla(5,7); //metodu çaðýrdýk . 

	}

}
