package homework6;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Ramanujan {

	static MathContext mc = new MathContext(1000, RoundingMode.HALF_EVEN);

	public static void main(String[] args) {
		
		BigDecimal root2=new BigDecimal("1.41421356237309504880168872420969807856967187537694807317667973799");
	//   BigDecimal a=(root2.multiply(new BigDecimal("2"))).divide(new BigDecimal("9801"),mc);
	     BigDecimal ans=new BigDecimal("0");
	    for(BigDecimal k=new BigDecimal("0");k.compareTo(new BigDecimal("2000"))<=0;k=k.add(new BigDecimal("1"))){


	    BigDecimal num=fact(k.multiply(new BigDecimal("4")));
	    num=num.multiply(new BigDecimal("1103").add(k.multiply(new BigDecimal("26390"))));
	    BigDecimal den=fact(k).pow(4);
	            den=den.multiply(new BigDecimal("396").pow(k.multiply(new BigDecimal("4")).intValueExact()));
	    ans=ans.add(num.divide(den,mc));



	    }
	    BigDecimal a = (root2.multiply(new BigDecimal("2"))).divide(new BigDecimal("9801"), mc);
	    ans = new BigDecimal("1").divide(ans.multiply(a), mc);
	    System.out.println(ans);
	}
	
	public static BigDecimal fact(BigDecimal n){
	    BigDecimal fact=new BigDecimal("1");
	    for(BigDecimal x=new BigDecimal("2");n.compareTo(x)>=0;x=x.add(new BigDecimal("1"))){
	        fact=fact.multiply(x);
	    }
	    return fact;

	}

}
