
public class YıldızlarlaİçiBoşKareÇizimi {

	public static void main(String [] args)
	{
		//dikdörtgen daha zor olduğu için dikdörtgen çizelim.
		
		int genişlik=10;
		int yükseklik=10;
		
		for(int i=1;i <= yükseklik;i++)
		{
			for(int j=1;j<=genişlik;j++)
			{
				if(i==1 | i==yükseklik)
				{
					System.out.print("*");
				}
				
				else
				{
					if(j==1 | j==genişlik)
					{
						System.out.print("*");
					}
					else 
					{
					     System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
