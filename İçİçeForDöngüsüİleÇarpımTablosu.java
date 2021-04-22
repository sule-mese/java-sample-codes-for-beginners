package örnekler;

public class ÝçÝçeForDöngüsüÝleÇarpýmTablosu {

	public static void main(String[] args) {
		// bu örneðimizde çarpým tablosu yaptýk. 
		// döngü her döndüðünde o satýrda çarpým sonuçlarýný yazacak. 
		//örneðin i = 1 için j= 1 ,2  ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 olacak. ve çarpým sonuçlarý da 1 2 3 4 5 6 7 8 9 10 olacak
		//  i = 2 için j= 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 olacak . çarpým sonuçlarý da 2 4 6 8 10 12 14 16 18 20 olacak.
		int i,j;
		for(i=1;i<=10;i++) // bu döngü 10 tur dönecek. 
		{
			for(j=1;j<=10;j++)  // her döndüðünde yapýlacak iþlemler bu döngüde yazýldý. 
			{
				System.out.print(j+ "x" + i + "=" + (j*i)+"\t");
				
			}
			System.out.println();
		}

	}

}
