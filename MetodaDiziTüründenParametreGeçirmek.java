
public class MetodaDiziTüründenParametreGeçirmek {

	
	public static void dizininElemanlarınıTopla(int Dizi[])
	{
	
		int toplam=0;
		
		for(int i: Dizi)
		{
			toplam += i;
		}
		
		System.out.println("toplam = " + toplam);
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		int sayıDizisi[] =new int[] {1,2,3,4,5};
		 
		 dizininElemanlarınıTopla(sayıDizisi);
		 
		

	}

}
