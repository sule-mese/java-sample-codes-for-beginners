
public class ArkadaşSayı {

	//sayı1 in pozitif tam bölenleri toplamı sayı2 ye eşit ise ve aynı zamanda sayı2 nin pozitif tam bölenleri toplamı sayı1 e eşit ise bu sayılar arkadaş sayıdır.
	public static void main(String[] args) {
		int sayı1 = 220;
		int sayı2 = 284;
		
		int sayaç1 = 0;
		int sayaç2 = 0;
		
		for(int i=1; i<sayı1; i++)
		{
			if(sayı1 % i == 0)
			{
				sayaç1 += i;
			}
		}
		
		for(int i=1; i<sayı2; i++)
		{
			if(sayı2 % i == 0)
			{
				sayaç2 += i;
			}
		}
		
		if(sayaç1 == sayı2 &&  sayaç2 == sayı1)
		{
			System.out.println(sayı1 + " ve " + sayı2 + " ARKADAŞ SAYIDIR.");
		}
		else
		{
			System.out.println(sayı1 + " ve " + sayı2 + " ARKADAŞ SAYI DEĞİLDİR.");
		}

	}

}
