import java.math.BigInteger;
import java.util.Scanner;

/** The KRRecursion class calculates the Fibonacci series given two 
 * terms and a value to be calculated as well as the Factorial of a 
 * number (up to 1000).  Made using recursion.
 * 
 * @author Kanishka Ragula
 * @version 0.1.0
 * @since 27/01/2017
 *
 */
public class KRRecursion {
	
	/** Main method of the KRRecursion class
	 * 
	 * @param args
	 * @return nothing
	 */
	public static void main(String[] args){
		//Instantiate the scanner
		Scanner sc = new Scanner(System.in);
		//Instantiate this so we can call methods.
		KRRecursion me = new KRRecursion();
		
		//Entry line for the user input.
		System.out.println("Do you want to do a fibonacci or factorial? (fib/fac)");
		String response = sc.nextLine();
		
		//Decide to either to Fibonacci or Factorial
		
		if(response.equals("fib")){ //Fibonacci result
			
			//Asks for first term, second term, and desired term
			System.out.println("Please enter the first number:");
			String fNum = sc.nextLine();
			System.out.println("Please enter the second number:");
			String secNum = sc.nextLine();
			System.out.println("Please enter the number in the sequence you want (>2)");
			int num = sc.nextInt();
			System.out.println(me.fib(new BigInteger(fNum), new BigInteger(secNum), num-1));
			
		} else if(response.equals("fac")){ //Factorial
			//Asks for the number to take the factorial of
			System.out.println("Please enter the positive number to take a factorial of (less than 1000)");
			System.out.println(me.fac(new BigInteger (sc.nextLine())));
			
		} else {//catch just in case the user can't read.
			
			System.out.println("Please enter either fib or fac to continue next time when you restart.");
			System.exit(0);
			
		}
		

	}

	/**Fibonacci Method takes in a first and second term as well as a desired term
	 * and calculates the Fibonacci series to the desired value through
	 * value(n) = value (n-1) + value (n-2)
	 * 
	 * @param firstNum First number in the sequence
	 * @param secNum Second number in the sequence
	 * @param fibNumber Desired term in the sequence
	 * @return Fibonacci sequence result for the terms given
	 */
	public BigInteger fib(BigInteger firstNum, BigInteger secNum, int fibNumber)  {
	    if(fibNumber == 0)
	    	return firstNum;
	    else if(fibNumber == 1)
	    	return secNum;
	    else
	    	return fib(firstNum, secNum, fibNumber - 1).add(fib(firstNum, secNum,fibNumber - 2));
	}
	
	/**Factorial method takes the factorial (!) of a positive integer
	 * by using for term n, 
	 * factorial = (n)*(n-1)*(n-2)*...(2)*(1)
	 * 
	 * @param endNum The value to take the factorial of
	 * @return the factorial of that number
	 */
	public BigInteger fac(BigInteger endNum){
		if(endNum.equals(BigInteger.ONE)){
			return BigInteger.ONE;
		} else {
			BigInteger res = endNum.multiply(fac(endNum.subtract(BigInteger.ONE)));
			return res;
		}
	}
}
