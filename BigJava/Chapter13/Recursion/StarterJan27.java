import java.math.BigInteger;
import java.util.Scanner;
public class StarterJan27 {
	long result;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		StarterJan27 me = new StarterJan27();
		
		System.out.println("Do you want to do a fibonacci or factorial? (fib/fac)");
		String response = sc.nextLine();
		
		
		if(response.equals("fib")){
			
		} else if(response.equals("fac")){
			System.out.println("Please enter the number to take a factorial of (less than 8503)");
			System.out.println(me.fac(new BigInteger (sc.nextLine())));
		} else {
			System.out.println("Please enter either fib or fac to continue next time when you restart.");
			System.exit(0);
		}
		

	}
	public long fib(int firstNum, int secNum, int fibNumber){
		
		return 0;
	}
	
	public BigInteger fac(BigInteger endNum){
		if(endNum.equals(BigInteger.ONE)){
			return BigInteger.ONE;
		} else {
			BigInteger res = endNum.multiply(fac(endNum.subtract(BigInteger.ONE)));
			return res;
		}
	}
}
