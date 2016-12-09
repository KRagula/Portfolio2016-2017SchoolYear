import java.math.BigInteger;

public class RandomSequence implements Sequence
{
   public BigInteger next()
   {
      return BigInteger.valueOf((long) (Integer.MAX_VALUE * Math.random()));
   }
}
