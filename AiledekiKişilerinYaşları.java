import java.util.Scanner;

public class AiledekiKi�ilerinYa�lar� {
/*	� Ayr�ca yukar�daki s�n�fland�rmaya g�re bir ailedeki bireylerin ya�lar�n�
	al�p, aral���n� veren ve en sonunda da ailede hangi aral�ktan ka� ki�i
	oldu�unu yazan bir program yaz�n.*/
	public static void main(String [] args )
	{
		System.out.println("L�tfen Ya��n�z� Giriniz:");
		 Scanner scan = new Scanner( System.in);
		 int ki�ininYa�� = scan.nextInt();
		System.out.println(ki�ininYa��);
		
		if(ki�ininYa�� > 120 | ki�ininYa��<0)
		{
		;
		}
		else if(ki�ininYa��<=3)
		{
			System.out.println("bebek");
		}
		else if(ki�ininYa��<=12)
		{
			System.out.println("�ocuk");
		}
		else if ( ki�ininYa��<=19)
		{
			System.out.println("ergen");
		}
		else if(ki�ininYa��<=30)
		{
			System.out.println("gen�");
		}
		else if(ki�ininYa��<=59)
		{
			System.out.println("orta ya�");
		}
		else
		{
			System.out.println("ya�l�");
		}
		
	} 
	
}
