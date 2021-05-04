
public class KalýnSesliVeÝnceSesliHarfler {

	public static void main(String[] args) {
		
		char harf = 'A';
		
		
		switch(harf)
		{
		case 'A','I', 'O','U':System.out.println(harf + " kalýn sesli bir harftir.");break;
		
		case 'E', 'Ý', 'Ö', 'Ü': System.out.println(harf + " ince sesli bir harftir.");break;
		}

	}

}
