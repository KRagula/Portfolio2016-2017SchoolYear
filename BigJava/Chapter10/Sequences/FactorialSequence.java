import java.math.BigInteger;

public class FactorialSequence implements Sequence {
	
	private int num = 0;
	@Override
	public BigInteger next() {
		// TODO Auto-generated method stub
		
		num++;
		return factorial();
	}
	
	private BigInteger factorial(){
		BigInteger val = BigInteger.valueOf(1);
		for(int i=1; i<=this.num; i++){
			val = val.multiply(BigInteger.valueOf(i));
		}
		return val;
		
	}
	
}
