import java.util.Scanner;

public class AiledekiKiþilerinYaþlarý {
/*	• Ayrýca yukarýdaki sýnýflandýrmaya göre bir ailedeki bireylerin yaþlarýný
	alýp, aralýðýný veren ve en sonunda da ailede hangi aralýktan kaç kiþi
	olduðunu yazan bir program yazýn.*/
	public static void main(String [] args )
	{
		System.out.println("Lütfen Yaþýnýzý Giriniz:");
		 Scanner scan = new Scanner( System.in);
		 int kiþininYaþý = scan.nextInt();
		System.out.println(kiþininYaþý);
		
		if(kiþininYaþý > 120 | kiþininYaþý<0)
		{
		;
		}
		else if(kiþininYaþý<=3)
		{
			System.out.println("bebek");
		}
		else if(kiþininYaþý<=12)
		{
			System.out.println("çocuk");
		}
		else if ( kiþininYaþý<=19)
		{
			System.out.println("ergen");
		}
		else if(kiþininYaþý<=30)
		{
			System.out.println("genç");
		}
		else if(kiþininYaþý<=59)
		{
			System.out.println("orta yaþ");
		}
		else
		{
			System.out.println("yaþlý");
		}
		
	} 
	
}
