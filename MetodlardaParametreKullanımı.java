
public class MetodlardaParametreKullan�m� {

	
	public static void selamlama(String isim) // string parametre 
	{
		System.out.println("selam " + isim);
	}
	
	
	
	
	public static void topla(int say�1 , int say�2) //int parametre
	{
	int toplam=say�1+say�2;
	System.out.println(say�1 +  "+" + say�2 +  "=" + toplam);
	}
	
	
	
	
	public static void main(String[] args) {
		selamlama("murat"); //metodu �a��rd�k.
		topla(5,7); //metodu �a��rd�k . 

	}

}
