
public class DizideArananSayıyıBulma {

	public static void main(String[] args) {
		
		int dizi[] = {1,2,3,4,5};
		int arananSayı = 7;
		
		boolean sayıDizideVarMı = false;
		
		for(int i : dizi)
		{
			if(i == arananSayı)
			{
				sayıDizideVarMı = true;
				break;
			}
		}
		
		if(sayıDizideVarMı == true)
		{
			System.out.println("sayı dizide bulunuyor.");
		}
		else
		{
			System.out.println("sayı dizide bulunmuyor.");
		}

	}

}
