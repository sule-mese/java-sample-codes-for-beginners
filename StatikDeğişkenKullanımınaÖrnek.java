
public class StatikDe�i�kenKullan�m�na�rnek {

	 static String ad,soyad; //DE���KENLER STAT�K TANIMLANDI . 
	
	
	public static void  degerAl(String adi, String soyadi)
	{
		ad=adi; // ad VE soyad DE���KENLER�N� STAT�K TANIMLADI�IMIZ ���N METODUN ���NDE DE���KEN� KULLANAB�L�YORUZ. 
		soyad=soyadi;
	}
	
	public static void yazdir()
	{
		System.out.println("tam isim :" + ad + " " + soyad); 
	}
	
	public static  void main(String[] args) {
		
	degerAl("�ule","me�e");
	yazdir();

	}

}
