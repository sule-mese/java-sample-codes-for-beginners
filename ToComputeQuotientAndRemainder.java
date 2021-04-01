package örnekler;
//in this program we will learn to compute  quotient and remainder from the given dividend and divisor in java.
//first , we created two variables dividend and divisor.
//we divided dividend by divisor by / operator.
//since both of dividend and divisor are integers , and also result  must be int . 
// we computed remainder by dividing dividend by the divisor .
// quotient and remainder are printed on the screen by using println() function. 


public class ToComputeQuotientAndRemainder {

	public static void main(String[] args) {
	
		int dividend=25,divisor=4;
		int quotient = dividend / divisor ;
		int remainder = dividend % divisor;
		
		System.out.println(quotient);
		System.out.println(remainder); 
		
		int result = quotient*divisor + remainder;
		System.out.println(result);
	}

}
