
public class Arkada�Say� {

	//say�1 in pozitif tam b�lenleri toplam� say�2 ye e�it ise ve ayn� zamanda say�2 nin pozitif tam b�lenleri toplam� say�1 e e�it ise bu say�lar arkada� say�d�r.
	public static void main(String[] args) {
		int say�1 = 220;
		int say�2 = 284;
		
		int saya�1 = 0;
		int saya�2 = 0;
		
		for(int i=1; i<say�1; i++)
		{
			if(say�1 % i == 0)
			{
				saya�1 += i;
			}
		}
		
		for(int i=1; i<say�2; i++)
		{
			if(say�2 % i == 0)
			{
				saya�2 += i;
			}
		}
		
		if(saya�1 == say�2 &&  saya�2 == say�1)
		{
			System.out.println(say�1 + " ve " + say�2 + " ARKADA� SAYIDIR.");
		}
		else
		{
			System.out.println(say�1 + " ve " + say�2 + " ARKADA� SAYI DE��LD�R.");
		}

	}

}
