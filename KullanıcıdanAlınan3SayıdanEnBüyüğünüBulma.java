package �rnekler;

import java.util.Scanner;

public class Kullan�c�danAl�nan3Say�danEnB�y���n�Bulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("birinci say�:");
		int birinciSay�=scan.nextInt();
		System.out.println("ikinci say�:");
		int ikinciSay�=scan.nextInt();
		System.out.println("���nc� say�:");
		int ���nc�Say�=scan.nextInt();
		
		int enB�y�kSay�;
		
		if(birinciSay�>=ikinciSay� &&  birinciSay� >= ���nc�Say�)
			enB�y�kSay�=birinciSay�;
		
		else if(ikinciSay�>birinciSay� && ikinciSay�>=���nc�Say�)
			enB�y�kSay�=ikinciSay�;
		else
			enB�y�kSay�=���nc�Say�;
		
		System.out.println("en b�y�k say� :"  + enB�y�kSay�);
		

	}

}
