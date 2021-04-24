package �rnekler;

import java.util.Scanner;

public class Kullan�c�danAl�nan2Say�n�nEbobunuBulma {

	public static int ebobBulma(int say�1, int say�2)
	{
		int ebob = 1; // 2 say�n�n ortak b�leni yoksa ebobu 1 dir. 
		
		for(int i=1;i<=say�1 &&  i<=say�2; i++)  // i hem say� 1 den hem say� 2 den k���k olmal� . ebob say�lardan b�y�k ��kamaz
		{
			if(say�1%i==0 && say�2%i==0) // i de�eri hem say� 1 hem say� 2 ye tam b�l�n�yorsa  ebob(say�1,say�2) = i dir. 
			{
				ebob = i;
			}
		}
		
		return ebob; // en son ��kan ebob de�erini main metoda g�ndeririz. 
	}
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in); // kullan�c�dan 2 say� al�r�z. 
		System.out.println("say� 1 i girin:");
		int say�1= scan.nextInt();
		System.out.println("say� 2 yi girin:");
		int say�2= scan.nextInt();
		System.out.println("2 say�n�n ebobu = " + ebobBulma(say�1,say�2));
		
	}

}
