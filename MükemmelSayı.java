
public class M�kemmelSay� {

	public static void main(String[] args) {
		
		int say� = 28;
		int saya� = 0;
		
		for(int i=1; i<say�; i++)
		{
			if(say�%i == 0)
			{
				saya� += i;
			}
		}
		
		
		if(saya� == say�)
		{
			System.out.println(say� + " M�KEMMEL SAYIDIR.");
		}
		else
		{
			System.out.println(say� + " M�KEMMEL SAYI DE��LD�R.");
		}

	}

}
