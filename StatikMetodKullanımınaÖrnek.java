
public class StatikMetodKullanýmýnaÖrnek {
	
/* STATÝK METOD KULLANIMININ 2 AMACI VARDIR.
 * 1.SÝ NESNE OLUÞTURMADAN DOÐRUDAN SINIF ADI ÝLE METODA ERÝÞMEK ( BELLEKTEN KAZANÇ SAÐLAR )
 * 2.SÝ HER NESNENÝN ORTAK KULLANDIÐI METOD OLUÞTURMAK 
 */
	
	/* BÝZ BÝRÝNCÝ KULLANIMINA ÖRNEK VERECEÐÝZ.*/
	
	public static int metod(int a, int b)
	{
		return a+b;
		
	}
	
	
		
	
	public static void main(String[] args) {
		
		/* EÐER STATÝK TANIMLAMASAYDIK METODUMUZ NESNEYE ÖZEL OLACAKTI.
		 * StatikMetodKullanýmýnaÖrnek s1 = new StatikMetodKullanýmýnaÖrnek(); // nesne yaratacaktýk
		 * int toplam = s1.metod(1, 2);  // nesnenin metodunu çaðýracaktýk. 
		 * System.out.println(toplam);  //sonucu yazdýracaktýk. 
		 */
		
		
		
		// STATÝK TANIMLADIÐIMIZ METOD SINIFA ÖZEL OLDU . 
		int toplam= StatikMetodKullanýmýnaÖrnek.metod(1,2); // sýnýfadý.metodadý(); ile çaðýrdýk.
		System.out.println(toplam); // sonucu yazdýrdýk.
		
		
		//ÖRNEÐÝN MATH sýnýfýndaki sqrt() adlý metod static olduðu için sýnýfadý.metodadý() ile ulaþabildik. 
		
		double karekök = Math.sqrt(toplam);
		System.out.println(karekök);
		
		
		
		
	}

}
