
public class MükemmelSayý {

	public static void main(String[] args) {
		
		int sayý = 28;
		int sayaç = 0;
		
		for(int i=1; i<sayý; i++)
		{
			if(sayý%i == 0)
			{
				sayaç += i;
			}
		}
		
		
		if(sayaç == sayý)
		{
			System.out.println(sayý + " MÜKEMMEL SAYIDIR.");
		}
		else
		{
			System.out.println(sayý + " MÜKEMMEL SAYI DEÐÝLDÝR.");
		}

	}

}
