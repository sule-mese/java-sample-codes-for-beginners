import java.util.Scanner;

public class MetodaDiziTüründenParametreGeçirmek2 {

	public static void yazdir(String isimler[])
	{
		for(String i: isimler)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {

		String isimler[] = new String[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.print((i+1) + ". ismi girin:");
			isimler[i]=scan.nextLine();
		}
		
		yazdir(isimler);

	}

}
