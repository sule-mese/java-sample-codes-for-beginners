package �rnekler;

import java.util.Scanner;

public class DoWhile�leBirSay�n�nRakamlar�Toplam� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("say�y� giriniz:");
		int say�= scan.nextInt();
		int toplam=0;
		do
		{
			toplam+= (say� % 10);
			say� = say� / 10;	
			
		}while(say�>0);
		
		System.out.println("say�n�n rakamlar� toplam� = " + toplam);
		

	}

}
