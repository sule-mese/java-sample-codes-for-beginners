
public class MetodParametresiOlarakVarTipindenDe�i�kenKullan�m� {

	//METODUN ���NDE VAR T�P�NDEN DE���KEN KULLANILAB�LMES�NE RA�MEN METOD PARAMETRES� OLARAK VAR T�P�NDEN DE���KEN KULLANILAMAZ.
	
	public static int toplama(int a, int b)
	{
		var toplam= a+b; // metodun i�indeki de�i�ken var tipinden olabilir.
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
