
public class Y�ld�zlarla��iBo�Kare�izimi {

	public static void main(String [] args)
	{
		//dikd�rtgen daha zor oldu�u i�in dikd�rtgen �izelim.
		
		int geni�lik=10;
		int y�kseklik=10;
		
		for(int i=1;i <= y�kseklik;i++)
		{
			for(int j=1;j<=geni�lik;j++)
			{
				if(i==1 | i==y�kseklik)
				{
					System.out.print("*");
				}
				
				else
				{
					if(j==1 | j==geni�lik)
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
