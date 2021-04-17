
public class BreakAndContinue {

	public static void main(String[] args) {
		
			
			System.out.println("break");
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0)
					break; // Terminate loop.
				System.out.println(i + "\t");
			}
			
			System.out.println("\ncontinue");
			
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0)
					continue; // Terminate only this step.
				System.out.println(i + "\t" );
			} // end of for loop
		} 

	

}
