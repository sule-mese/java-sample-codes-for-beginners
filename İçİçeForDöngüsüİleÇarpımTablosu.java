package �rnekler;

public class ����eForD�ng�s��le�arp�mTablosu {

	public static void main(String[] args) {
		// bu �rne�imizde �arp�m tablosu yapt�k. 
		// d�ng� her d�nd���nde o sat�rda �arp�m sonu�lar�n� yazacak. 
		//�rne�in i = 1 i�in j= 1 ,2  ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 olacak. ve �arp�m sonu�lar� da 1 2 3 4 5 6 7 8 9 10 olacak
		//  i = 2 i�in j= 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 olacak . �arp�m sonu�lar� da 2 4 6 8 10 12 14 16 18 20 olacak.
		int i,j;
		for(i=1;i<=10;i++) // bu d�ng� 10 tur d�necek. 
		{
			for(j=1;j<=10;j++)  // her d�nd���nde yap�lacak i�lemler bu d�ng�de yaz�ld�. 
			{
				System.out.print(j+ "x" + i + "=" + (j*i)+"\t");
				
			}
			System.out.println();
		}

	}

}
