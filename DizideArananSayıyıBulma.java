
public class DizideArananSay�y�Bulma {

	public static void main(String[] args) {
		
		int dizi[] = {1,2,3,4,5};
		int arananSay� = 7;
		
		boolean say�DizideVarM� = false;
		
		for(int i : dizi)
		{
			if(i == arananSay�)
			{
				say�DizideVarM� = true;
				break;
			}
		}
		
		if(say�DizideVarM� == true)
		{
			System.out.println("say� dizide bulunuyor.");
		}
		else
		{
			System.out.println("say� dizide bulunmuyor.");
		}

	}

}
