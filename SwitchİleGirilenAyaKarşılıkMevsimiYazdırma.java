import java.util.Scanner;

public class Switch�leGirilenAyaKar��l�kMevsimiYazd�rma {
	
	public static void main(String[] args) {
    	Switch�leGirilenAyaKar��l�kMevsimiYazd�rma demo = new Switch�leGirilenAyaKar��l�kMevsimiYazd�rma();
    	
    	System.out.println("A number :");
		Scanner stdin = new Scanner(System.in);
		int month = stdin.nextInt();
		
		demo.switchDemo1(month);
		
    }
	
	public static void switchDemo1(int month)
	{
		switch(month)
		{
		case 12,1,2: System.out.println("k��");break;
		case 3,4,5: System.out.println("ilkbahar");break;
		case 6,7,8: System.out.println("yaz");break;
		case 9,10,11:System.out.println("sonbahar");break;
		default: System.out.println("ge�ersiz bir ay girdiniz.");
		}
	
		
			
	}
}
