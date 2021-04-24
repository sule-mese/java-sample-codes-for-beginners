
public class MetodParametresiOlarakVarTipindenDeðiþkenKullanýmý {

	//METODUN ÝÇÝNDE VAR TÝPÝNDEN DEÐÝÞKEN KULLANILABÝLMESÝNE RAÐMEN METOD PARAMETRESÝ OLARAK VAR TÝPÝNDEN DEÐÝÞKEN KULLANILAMAZ.
	
	public static int toplama(int a, int b)
	{
		var toplam= a+b; // metodun içindeki deðiþken var tipinden olabilir.
		return toplam;
	}
	
	/*public static int toplama(int a, int b, var c) //parametre var tipinden olamaz. 
	{
		var toplam= a+ b + c;
		return toplam;
	}*/
	
	
	public static void main(String[] args) {
		
		int toplam = toplama(2,3);
		System.out.println(" toplam = " + toplam);
		}

}
