
public class StatikMetodKullan�m�na�rnek {
	
/* STAT�K METOD KULLANIMININ 2 AMACI VARDIR.
 * 1.S� NESNE OLU�TURMADAN DO�RUDAN SINIF ADI �LE METODA ER��MEK ( BELLEKTEN KAZAN� SA�LAR )
 * 2.S� HER NESNEN�N ORTAK KULLANDI�I METOD OLU�TURMAK 
 */
	
	/* B�Z B�R�NC� KULLANIMINA �RNEK VERECE��Z.*/
	
	public static int metod(int a, int b)
	{
		return a+b;
		
	}
	
	
		
	
	public static void main(String[] args) {
		
		/* E�ER STAT�K TANIMLAMASAYDIK METODUMUZ NESNEYE �ZEL OLACAKTI.
		 * StatikMetodKullan�m�na�rnek s1 = new StatikMetodKullan�m�na�rnek(); // nesne yaratacakt�k
		 * int toplam = s1.metod(1, 2);  // nesnenin metodunu �a��racakt�k. 
		 * System.out.println(toplam);  //sonucu yazd�racakt�k. 
		 */
		
		
		
		// STAT�K TANIMLADI�IMIZ METOD SINIFA �ZEL OLDU . 
		int toplam= StatikMetodKullan�m�na�rnek.metod(1,2); // s�n�fad�.metodad�(); ile �a��rd�k.
		System.out.println(toplam); // sonucu yazd�rd�k.
		
		
		//�RNE��N MATH s�n�f�ndaki sqrt() adl� metod static oldu�u i�in s�n�fad�.metodad�() ile ula�abildik. 
		
		double karek�k = Math.sqrt(toplam);
		System.out.println(karek�k);
		
		
		
		
	}

}
