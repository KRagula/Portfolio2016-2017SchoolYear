import java.math.BigInteger;
public class SquareSequence implements Sequence
{
   private int n;

   public BigInteger next()
   {
      n++;
      return BigInteger.valueOf(n*n); 
   }
}
