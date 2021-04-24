
public class StatikDeðiþkenKullanýmýnaÖrnek {

	 static String ad,soyad; //DEÐÝÞKENLER STATÝK TANIMLANDI . 
	
	
	public static void  degerAl(String adi, String soyadi)
	{
		ad=adi; // ad VE soyad DEÐÝÞKENLERÝNÝ STATÝK TANIMLADIÐIMIZ ÝÇÝN METODUN ÝÇÝNDE DEÐÝÞKENÝ KULLANABÝLÝYORUZ. 
		soyad=soyadi;
	}
	
	public static void yazdir()
	{
		System.out.println("tam isim :" + ad + " " + soyad); 
	}
	
	public static  void main(String[] args) {
		
	degerAl("þule","meþe");
	yazdir();

	}

}
