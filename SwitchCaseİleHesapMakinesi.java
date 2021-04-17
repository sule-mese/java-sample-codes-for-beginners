package �rnekler;

import java.util.Scanner;

public class SwitchCase�leHesapMakinesi {

	public static void main(String[] args) {
	
		String i�lemler = "1-TOPLAMA ��LEM� \n"
			               	+ 
				          "2-�IKARMA ��LEM� \n"
				            + 
				          "3-�ARPMA ��LEM� \n"
				            +
				          "4-B�LME ��LEM� \n" ;
		
		System.out.println(i�lemler);
		Scanner scan = new Scanner ( System.in);
		
		System.out.print("se�iminiz:");
		int se�im =  scan.nextInt();
		System.out.print("birinci say�:");
		int a = scan.nextInt();
		System.out.print("ikinci say� : ");
		int b = scan.nextInt();
		
		
		double sonu� = switch(se�im)
						{
						case 1: yield (a+b);
						case 2: yield (a-b);
						case 3: yield (a*b);
						case 4: yield ((double)a/b);
						default : yield -1;	
						};

		System.out.println("sonu� : " + sonu�);
	}

}
