package �rnekler;

import java.util.Scanner;

public class Recursive�leG�nderilenParametreyeKadarOlanSay�lar�nToplam� {

	public static long say�lar�Topla(int say�)
	{
		if(say�==1)
		{
			return 1;
		}
		else
		{
			return say� + say�lar�Topla(say�-1);
		}
	}
	public static void main(String[] args) {
		
		//�rne�in metoda g�nderilen say� 10 ise 1 den 10 a kadar olan say�lar�n toplam�n� bulan metodu recursive ile yaz�n�z.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("say� :");
		int say� = scan.nextInt();
		System.out.println(say�lar�Topla(say�));

	}

}
