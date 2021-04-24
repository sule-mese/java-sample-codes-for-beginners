
public class MetodaDiziTüründenParametreGeçirmek {

	
	public static void dizininElemanlarýnýTopla(int Dizi[])
	{
	
		int toplam=0;
		
		for(int i: Dizi)
		{
			toplam += i;
		}
		
		System.out.println("toplam = " + toplam);
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		int sayýDizisi[] =new int[] {1,2,3,4,5};
		 
		 dizininElemanlarýnýTopla(sayýDizisi);
		 
		

	}

}
